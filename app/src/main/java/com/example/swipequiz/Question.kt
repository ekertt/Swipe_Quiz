package com.example.swipequiz

data class Question(
    var question: String,
    var isCorrect: Boolean
) {
    companion object {
        val QUESTIONS = arrayOf(
            "A 'val' and 'var' are the same.",
            "Mobile Application Development grants 12 ECTS.",
            "A Unit in Kotlin corresponds to a void in Java.",
            "In kotlin 'when' replaces the 'switch' operator in Java."
        )

        val ISCORRECT = arrayOf(
            false,
            false,
            true,
            true
        )
    }
}