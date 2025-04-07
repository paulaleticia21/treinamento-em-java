package br.com.limite;

public class SomarLimite {

    public static int somarLimite(int limite){

        int soma = 0;
        int i = 0;

        if(limite < 0 ){
            throw new IllegalArgumentException("Valor deve ser positivo");
        }

        do {
            if (i % 3 == 0) {
                i++;
                continue;
            }
            soma += i;
            i++;
        }while (i <= limite) ;
            return soma;
        }

    public static void main(String[] args) {
         int limite = 15;
         int resultado = somarLimite(limite);
        System.out.println("A soma dos números positivos até " + limite + " (ignorando múltiplos de 3) é: " + resultado);
    }
}
