package com.example.salestaxcalculator
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var firstnum: EditText? = null
    var secondnum: EditText? = null
    var r: TextView? = null
    var bt: Button? = null
    var a = 0.0
    var b = 0.0
    var c = 0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        firstnum = findViewById<View>(R.id.amount_entry) as EditText
        secondnum = findViewById<View>(R.id.tax_entry) as EditText
        bt = findViewById<View>(R.id.calculate) as Button
        r = findViewById<View>(R.id.total) as TextView
        bt!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                a = firstnum!!.text.toString().toDouble()
                b = secondnum!!.text.toString().toDouble()
                c = a + (a*b/100)
                r!!.text = "Total: $c"
            }
        })
    }
}