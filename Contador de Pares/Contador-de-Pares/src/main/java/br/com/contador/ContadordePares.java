package br.com.contador;

public class ContadordePares {

    public static int contadordepares(int [] numeros){
    int contador = 0;

    for (int numero : numeros){
        if (numero % 2 == 0){
            contador++;
        }
    }
    return contador;
    }
    public static void main(String[] args) {

        int [] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int total = contadordepares(numeros);

        System.out.println(" O total de numeros pares são : " + total);

    }
}
