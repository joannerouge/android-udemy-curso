package laura.cardenas.colorquotes

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    // Clase de cita para guardar el texto y el autor
    // Una clase que nos ayude a generar citas al azar


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        quoteTextView.setTextColor(ColorGenerator.getRandomColor())
        val quote = QuoteGenerator.getQuote()
        quoteTextView.text = quote.text
        autorTextView.text = quote.author
        mainLayout.setBackgroundColor(ColorGenerator.getRandomColor())

        newQuoteButton.setOnClickListener {
            val quote = QuoteGenerator.getQuote()
            quoteTextView.setTextColor(ColorGenerator.getRandomColor())
            quoteTextView.text = quote.text
            autorTextView.text = quote.author
            mainLayout.setBackgroundColor(ColorGenerator.getRandomColor())

        }
    }

}
