package com.java.aula01.collections;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Principal6 {

    public static void main(String[] args) {

        //Chave e Valor
        Map<Integer, Object> mapa = new HashMap<>();
        mapa.put(1, "Maria");
        mapa.put(2, 25);
        mapa.put(3, true);
        mapa.put(4, new Date());
        mapa.put(5, 15.6);

        for(Integer key: mapa.keySet()){
            System.out.println(key + ": "+mapa.get(key));
        }
    }
}
