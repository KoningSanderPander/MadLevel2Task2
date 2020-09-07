package nl.svdoetelaar.madlevel2task2

data class Question(
    var question: String,
    var answer: Boolean
) {
    companion object {
        val questions = arrayOf(
            "A 'val' and 'var' are the same.",
            "Mobile Application Development grants 12 ECTS.",
            "A unit in Kotlin corresponds to void in Java.",
            "In Kotlin 'when' replaces the 'switch' operator in Java."
        )

        val answers = arrayOf(
            false,
            false,
            true,
            true
        )
    }
}