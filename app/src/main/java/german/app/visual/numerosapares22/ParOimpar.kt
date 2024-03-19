package german.app.visual.numerosapares22

class ParOimpar {
    fun calcular(num: Int): String {

        if (num % 2 == 0) {
            return "Par"
        } else {
            return "Impar"
        }
    }
}
