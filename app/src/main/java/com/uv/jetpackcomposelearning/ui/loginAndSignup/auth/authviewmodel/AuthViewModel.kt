package com.uv.jetpackcomposelearning.ui.loginAndSignup.auth.authviewmodel

import androidx.lifecycle.ViewModel
import com.google.firebase.auth.FirebaseAuth

class AuthViewModel : ViewModel() {

    private val auth = FirebaseAuth.getInstance()

    fun login(
        email: String,
        password: String,
        result: (Boolean, String) -> Unit
    ) {
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    result(true, "")
                } else {
                    result(false, task.exception?.message ?: "Login failed")
                }
            }
    }

    fun signup(
        email: String,
        password: String,
        result: (Boolean, String) -> Unit
    ) {
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    result(true, "")
                } else {
                    result(false, task.exception?.message ?: "Signup failed")
                }
            }
    }
}
