package laura.cardenas.colorquotes

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val rainbowColors = listOf(R.color.blue, R.color.green, R.color.blue)
    // Clase de cita para guardar el texto y el autor
    // Una clase que nos ayude a generar citas al azar


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        quoteTextView.setTextColor(Color.BLACK)

        newQuoteButton.setOnClickListener {
            val quoteGenerator = QuoteGenerator()
            val quote = quoteGenerator.getQuote()
            quoteTextView.text = quote.text
            autorTextView.text = quote.author
            mainLayout.setBackgroundColor(rainbowColors.random())
        }
    }

}
