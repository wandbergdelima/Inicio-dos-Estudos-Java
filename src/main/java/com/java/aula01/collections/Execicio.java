package com.java.aula01.collections;

import com.java.aula01.heranca.Paciente;

// import java.util.*;

public class Execicio {
    public static void main(String[] args) {
        /*
         * // List<String> nomes = new ArrayList<>();
         * 
         * // Set<String> nomes = new HashSet<>();
         * nomes.add("Paulo");
         * nomes.add("Joao");
         * nomes.add("Ana");
         * nomes.add("Wandberg");
         * nomes.add("Joao");
         * nomes.add("Ana");
         * 
         * for (String nome: nomes) {
         * System.out.println(nome);
         * }
         */

        /*
         * Map<String, Object> mapa = new HashMap<>();
         * 
         * mapa.put("a", "I");
         * mapa.put("b", "II");
         * mapa.put("c", "III");
         * mapa.put("d", "IV");
         * mapa.put("e", "V");
         * mapa.put("f", "VI");
         * mapa.put("g", "VII");
         * 
         * for (String key: mapa.keySet()
         * ) {
         * System.out.println(key + ":" + mapa.get(key));
         * }
         * 
         */

        Paciente paciente = new Paciente();
        paciente.setId(1);
        paciente.setNome("Wandberg");
        paciente.setMatricula(12645);
        paciente.setPlanoDeSaude("Amil");

        paciente.imprimirInfo();

    }

    /*
     * 
     * class MetodoSobrecarregado{
     * 
     * public void testaMetodosSobrecarregados()
     * {
     * System.out.printf("Salário em número inteiro = %d\n", salario(700));
     * System.out.printf("Salário em número double = %f\n", salario(7.500));
     * }
     * 
     * public int salario(int valorInt)
     * {
     * System.out.printf("\n Salário com argumento de inteiro = %d\n", valorInt);
     * return valorInt * valorInt;
     * }
     * 
     * public double salario( double valorDouble)
     * {
     * System.out.printf("\n Salário chamado com argumento de double = %f\n",
     * valorDouble);
     * return valorDouble * valorDouble;
     * }
     * }
     * 
     * public class Test_Metodos_Sobrecarregados {
     * 
     * public static void main(String[] args) {
     * 
     * MetodoSobrecarregado testaM = new MetodoSobrecarregado();
     * testaM.testaMetodosSobrecarregados();
     * }
     * }
     */

}
