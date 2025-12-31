package com.uv.jetpackcomposelearning.ui.loginAndSignup.note

import android.net.Uri
import android.util.Log
import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.storage.FirebaseStorage
import com.uv.jetpackcomposelearning.ui.loginAndSignup.model.Note
import java.util.UUID

class NodeViewModel: ViewModel() {

    private val firestore = FirebaseFirestore.getInstance()
    private val firebaseDatabase = FirebaseDatabase.getInstance().reference
    private val storage = FirebaseStorage.getInstance()

    var notes = mutableStateListOf<Note>()
        private set



    fun addNote(note: Note, imageUri: Uri?, onComplete:() -> Unit){

        if(imageUri != null){
            val ref = storage.reference.child("images/${UUID.randomUUID()}")

            ref.putFile(imageUri).addOnSuccessListener {
                ref.downloadUrl.addOnSuccessListener { uri ->
                    val updatedNote = note.copy(imageUrl = uri.toString())
                    saveToFirestoreAndRealtime(updatedNote, onComplete)

                }
            }
        }
        else{
            saveToFirestoreAndRealtime(note, onComplete)

        }

    }

    private fun saveToFirestoreAndRealtime(note: Note, onComplete:() -> Unit){
        firestore.collection("notes").add(note).addOnSuccessListener { doc ->
            val pushedNote = note.copy(id = doc.id)
            firebaseDatabase.child("notes").child(doc.id).setValue(pushedNote)
            onComplete()

        }
    }

    fun listenToRealtime() {
        firebaseDatabase.child("notes")
            .addValueEventListener(
                object : com.google.firebase.database.ValueEventListener {

                override fun onDataChange(snapshot: DataSnapshot) {
                    notes.clear()

                    for (child in snapshot.children) {
                        val note = child.getValue(Note::class.java)
                        note?.let { notes.add(it) }
                    }
                }

                override fun onCancelled(error: DatabaseError) {
                    Log.e("Firebase", error.message)
                }
            })
    }

}
