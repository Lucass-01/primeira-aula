package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        funcaoSoma(2, 2);
        funcaoSubtrair(5,2);
        List<String> x = nomesDeAlunos("Lucas","Fernando");
        for (String s: x){
            System.out.println(s);
        }
    }

    public  static List<String> nomesDeAlunos(String s,String str) {
        List<String> listString = new ArrayList<>();
        listString.add(s);
        listString.add(str);
        return  listString;

    }
    public static void funcaoSoma(int x, int y){
        int z = x+y;
        System.out.println("A soma de " + x + " mais " + y + " é igual a: " + z);
    }
    public static  void funcaoSubtrair (double x,double y){
        double z = x - y;
    }
}
