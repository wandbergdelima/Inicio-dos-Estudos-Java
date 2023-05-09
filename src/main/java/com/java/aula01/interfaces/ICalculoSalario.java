package com.java.aula01.interfaces;

//classe 100 % abstrata - ela nao pode ser instanciada
//contrato
public interface ICalculoSalario {
    //assinatura do metodo
    Double calcularSalarioLiquido(Double salarioBruto, Double despesas);
}
