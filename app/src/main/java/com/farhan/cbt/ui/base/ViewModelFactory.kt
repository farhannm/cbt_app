package com.farhan.cbt.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.farhan.cbt.repository.AuthRepository
import com.farhan.cbt.repository.BaseRepository
import com.farhan.cbt.ui.auth.AuthViewModel

class ViewModelFactory(
    private val repository : BaseRepository
) : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(AuthViewModel::class.java) -> AuthViewModel(repository as AuthRepository) as T
            else -> throw IllegalArgumentException("ViewModelClass not found.")
        }
    }

}