package laura.cardenas.colorquotes

import android.graphics.Color

object ColorGenerator {
    val colors= listOf<Int>(Color.BLUE,Color.CYAN,Color.GREEN)

    fun getRandomColor() : Int {
        return colors.random()
    }
}