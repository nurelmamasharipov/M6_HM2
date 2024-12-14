package com.example.m6_hm2.ui.model

data class PersonModel(
    val name: String,
    val images : List<String>,
    val age : String,
    val title : String
) {
    companion object {
        fun getMockList() = listOf(
            PersonModel(
                name = "John",
                age = "21 years old",
                title = "Android Developer",
                images = listOf(
                    "https://i.pinimg.com/474x/cf/43/d2/cf43d27b4413db81a7da70675960bc20.jpg",
                    "https://i.pinimg.com/236x/77/7a/9c/777a9c718efa54c35ed484e8517a6d66.jpg",
                    "https://i.pinimg.com/236x/8c/88/c6/8c88c631fb551778abefe35a4e7f4979.jpg"
                )
            ),
            PersonModel(
                name = "Anton",
                age = "23 years old",
                title = "Android Developer",
                images = listOf(
                    "https://i.pinimg.com/474x/cf/43/d2/cf43d27b4413db81a7da70675960bc20.jpg",
                    "https://i.pinimg.com/236x/8c/88/c6/8c88c631fb551778abefe35a4e7f4979.jpg",
                    "https://i.pinimg.com/236x/77/7a/9c/777a9c718efa54c35ed484e8517a6d66.jpg"
                )
            ),
            PersonModel(
                name = "Bob",
                age = "33 years old",
                title = "Android Developer",
                images = listOf(
                    "https://i.pinimg.com/236x/8c/88/c6/8c88c631fb551778abefe35a4e7f4979.jpg",
                    "https://i.pinimg.com/474x/cf/43/d2/cf43d27b4413db81a7da70675960bc20.jpg",
                    "https://i.pinimg.com/236x/77/7a/9c/777a9c718efa54c35ed484e8517a6d66.jpg"
                )
            ),
            PersonModel(
                name = "Kevin",
                age = "18 years old",
                title = "Android Developer",
                images = listOf(
                    "https://i.pinimg.com/236x/77/7a/9c/777a9c718efa54c35ed484e8517a6d66.jpg",
                    "https://i.pinimg.com/474x/cf/43/d2/cf43d27b4413db81a7da70675960bc20.jpg",
                    "https://i.pinimg.com/236x/8c/88/c6/8c88c631fb551778abefe35a4e7f4979.jpg"
                )
            ),
            PersonModel(
                name = "Ruslan",
                age = "25 years old",
                title = "Android Developer",
                images = listOf(
                    "https://i.pinimg.com/236x/8c/88/c6/8c88c631fb551778abefe35a4e7f4979.jpg",
                    "https://i.pinimg.com/236x/77/7a/9c/777a9c718efa54c35ed484e8517a6d66.jpg",
                    "https://i.pinimg.com/474x/cf/43/d2/cf43d27b4413db81a7da70675960bc20.jpg"
                )
            ),
        )
    }
}