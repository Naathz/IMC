package com.example.logonrm.imc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import com.example.logonrm.imc.Extension.format
import kotlinx.android.synthetic.main.activity_resultado.*

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
        //"PESO" é o nome da chave, val é o atributo SEMPRE COMEÇA COM LETRA MINÚSCULA
        if(intent != null) {
            val peso = intent.getStringExtra("PESO").toDouble()
            val altura = intent.getStringExtra("ALTURA").toDouble()

            val imc = peso / (altura * altura)
//para associar coloque ID.nome etc
            tvValorIMC.text = imc.format(1)


        //condições
        if(imc <= 18.5){
                //aqui vc chama a fun alteraImagem
            alteraImagemStatusIMC(R.drawable.abaixo)
            ivStatusIMC.text = "Abaixo do peso"
        } else if (imc <= 24.9){
            alteraImagemStatusIMC(R.drawable.ideal)
            ivStatusIMC.text = "Peso ideal"
        } else if (imc <= 29.9){
            alteraImagemStatusIMC(R.drawable.sobre)
            ivStatusIMC.text = "Sobrepeso"
        } else if (imc <= 34.9){
            alteraImagemStatusIMC(R.drawable.obesidade)
            ivStatusIMC.text = "Obesidade 1"
        }else if (imc <= 39.9){
            alteraImagemStatusIMC(R.drawable.obesidade)
            ivStatusIMC.text = "Obesidade 2"
        }else{
            alteraImagemStatusIMC(R.drawable.obesidade)
            ivStatusIMC.text = "Obesidade 3"
        }

    }
}

//vc pode criar uma função para só mudar as nomenclaturas das imagens, pois a única coisa que vai mudar é a imagem
    fun alteraImagemStatusIMC(idImagem: Int){
        tvStatusIMC.setImageDrawable(
                ContextCompat.getDrawable(this, idImagem)
        )
        }
    }