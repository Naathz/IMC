package com.example.logonrm.imc

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_formulario.*

class FormularioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario)

        btCalcular.setOnClickListener {
            //variável para ir da minha tela para a de resultado:
            val telaResultado = Intent (this, ResultadoActivity::class.java)
            telaResultado.putExtra("PESO", inputPeso.editText?.text.toString())
            telaResultado.putExtra("ALTURA", inputAltura.editText?.text.toString())
            startActivity(telaResultado)
        }

        btLimpar.setOnClickListener {
        //para não quebrar a app termine com editText? e o kotlin vai fazer OU editText!! para
            //tentar fazer de qlqr forma e q vc assume q pode dar crash, porém costuma-se
            // usar terminando com "?" pq é mais seguro p/ não dar crash
            inputAltura.editText?.setText(" ")
            inputPeso.editText?.setText(" ")
        }

    }
}
