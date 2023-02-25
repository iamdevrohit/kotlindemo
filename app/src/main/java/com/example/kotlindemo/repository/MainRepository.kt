package com.example.kotlindemo.repository

import com.example.kotlindemo.remotedata.RetrofitService

class MainRepository constructor(private val retrofitService: RetrofitService){

    fun getAllMovies() = retrofitService.getAllMovies()

}