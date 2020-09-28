package nl.svdoetelaar.madlevel2task2

import androidx.recyclerview.widget.ItemTouchHelper

data class Question(
    var question: String,
    var answer: Int
) {
    companion object {
        private const val correct = ItemTouchHelper.RIGHT
        private const val incorrect = ItemTouchHelper.LEFT

        val questions: Array<Question> = arrayOf(
            Question("A 'val' and 'var' are the same.", incorrect),
            Question( "Mobile Application Development grants 12 ECTS.", incorrect),
            Question("A unit in Kotlin corresponds to void in Java.", correct),
            Question("In Kotlin 'when' replaces the 'switch' operator in Java.", correct)
        )

        val answers = arrayOf(
            incorrect,
            incorrect,
            correct,
            correct
        )
    }
}