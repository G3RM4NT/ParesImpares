package german.app.visual.numerosapares22

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.txtresultado)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val num1 = findViewById<EditText>(R.id.txtnumero)
        val Btncalcular = findViewById<Button>(R.id.btncalcular)
        val Txtresultado = findViewById<TextView>(R.id.txtresultado)



        Btncalcular.setOnClickListener {
            val objParOimpar = ParOimpar()
            val resul = objParOimpar.calcular(num1.text.toString().toInt())
            Txtresultado.text = resul

        }

    }
}