package com.durand.appinstagramclone.profile

data class User(
    val username: String,
    val profileUrl: String,
    val followers: Int,
    val following: Int,
    val name: String,
    val description: String,
    val stories: List<Story>,
    val post: List<String>
)

data class Story(
    val image: String,
    val text: String
)