package com.example.apprretrofitfinal.data.repository

import com.example.apprretrofitfinal.data.model.Post
import com.example.apprretrofitfinal.data.remote.RetrofitInstance

class PostRepository {
    suspend fun getPosts(): List<Post> {
        return RetrofitInstance.api.getPosts()
    }
}