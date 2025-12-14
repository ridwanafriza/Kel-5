package com.id.myresep.navigation

data class Koleksi(
    val judul: String,
    val caption: String,
    val gambar: Int,
    val bahan: List<String> = listOf(),
    val cara: List<String> = listOf()
)


