package com.example.meightproject

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    var textView1: TextView? = null
    var textView2: TextView? = null
    private var editText: EditText? = null
    var myLayout: ConstraintLayout? = null
    var numClicks: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView1 = findViewById(R.id.textview_cliks)
        textView2 = findViewById(R.id.textview_name)
        editText = findViewById(R.id.edittext_type_name)
        myLayout = findViewById(R.id.my_layout)

        setBackground() // iniciando com uma imagem de fundo

        val button = findViewById<Button>(R.id.btn_change_image)
        button.setOnClickListener {
            incrementClicks()
            setBackground()
            setNameAndClicksOnTextView()
        }
    }

    private fun setNameAndClicksOnTextView() {
        textView1?.text = "$numClicks cliques"
        textView2?.text = "${editText?.text}"
    }

    private fun setBackground() {
        val image1 = getDrawable(R.drawable.peixe1)
        val image2 = getDrawable(R.drawable.peixe2)
        val image3 = getDrawable(R.drawable.tartaruga)

        val imageList: List<Drawable> = listOf(image1, image2, image3) as List<Drawable>
        val position = (0..2).random() // gerando uma posição aleatória da lista de imagens
        myLayout?.background = imageList[position]
    }

    private fun incrementClicks() = numClicks++
}
