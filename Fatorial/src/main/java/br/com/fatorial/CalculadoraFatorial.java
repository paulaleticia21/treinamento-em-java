package br.com.fatorial;

public class CalculadoraFatorial {

    public static Long calcularFatorial(int n){
        long resultado = 1;

        if (n < 0){
            throw new IllegalArgumentException("O valor não pode ser negativo");
        }

        int i = 1;
        while (i <= n){
            resultado *= i; // Faz a multiplicação pelo valor
            i++;
        }
            return resultado;
    }
    public static void main(String[] args) {
    int numero = 10;
    long resultadoFatorial = calcularFatorial(numero);
    System.out.println("O fatorial de :\t" + numero + "\té:\t" + resultadoFatorial);

    }
}
