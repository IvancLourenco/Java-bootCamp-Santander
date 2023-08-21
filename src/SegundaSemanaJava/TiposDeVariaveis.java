package SegundaSemanaJava;

public class TiposDeVariaveis {
    public static void main(String[] args) {
        double salarioMinimo = 2500.33;
        long cpf = 1234567891011L; //Se o numero começar com 0 e melhor mudar para string

        short numeroCurto = 1;
        int numeroNormal1 = numeroCurto;
        short numeroCurto2 = (short) numeroNormal1; //para converter uma variavel maior para o curto o java avisa que esta em sua conta e risco

       // variaveis constantes

        final double VALOR_DE_PI = 3.14;


    }
}
