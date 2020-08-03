package laura.cardenas.colorquotes

class QuoteGenerator {
    private val quoteList = listOf(
        Quote(text = "Somos nuestras decisiones", author = "A. Dumbledore"),
        Quote (text= "Stay hungry, stay foolish", author= "S. Jobs"),
        Quote (text= " Ojo por ojo y el mundo quedará ciego", author= "M. Gandhi"),
        Quote (text=  "El mundo esta lleno de cosas obvias que nunca nadie observa", author = "S. Holmes"),
        Quote ( text= "La imaginación es más importante que el conocimiento", author= "A. Einstein"))

    fun getQuote (): Quote = quoteList.random()

}
