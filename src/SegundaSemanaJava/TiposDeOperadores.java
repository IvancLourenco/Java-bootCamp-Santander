package SegundaSemanaJava;

import java.util.Date;

public class TiposDeOperadores {

    public static void main(String[] args) {
        //Classe operadores.java
        String nome = "Ivan";
        int idade = 24;
        double peso = 74.2;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();

        //Operadores aritmeticos
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20/7);

        // repeticao

        int numero = 5;

        System.out.println( numero -- );
        System.out.println( numero);

        boolean variavel = true;

        variavel = !variavel;
        System.out.println( variavel);
    }
}
