package com.example.logonrm.imc.Extension

/**
 * Created by logonrm on 02/03/2018.
 */
/**EXTENSÃO para formatar para deixar o resultado do IMC com determinado número de casas decimais que quisermos
 * (ainda sim é uma função**/

fun Double.format(digits: Int) =
        java.lang.String.format("%.$(digits)f", this)