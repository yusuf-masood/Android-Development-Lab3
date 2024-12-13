package com.example.yusuffinalproject.apiquestions

data class Question(
    val id: String,
    val category: String,
    val correctAnswer: String,
    val incorrectAnswers: List<String>,
    val question: QuestionText,
    val difficulty: String
)

{

    data class QuestionText(val text: String)

}
