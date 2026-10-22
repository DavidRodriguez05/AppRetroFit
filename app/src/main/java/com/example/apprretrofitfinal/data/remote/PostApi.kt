package com.example.apprretrofitfinal.data.remote

import com.example.apprretrofitfinal.data.model.Post
import retrofit2.http.GET

interface PostApi {
    @GET("posts")
    suspend fun getPosts(): List<Post>
}