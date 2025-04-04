package br.com.calculadorasimples;

public class Calculadora {

    public static int calcular(int a, int b,String operador){

        if(operador.equals("+")){
            return a + b;

        } else if (operador.equals("-")) {
            return a - b;

        } else if (operador.equals("*")) { //equals: O equals é um objeto em java que compara 2 string
            return a * b ;

        } else if (operador.equals("/")) {

            if (b != 0) {
                return (int) a / b;
            } else {
                throw new IllegalStateException("Dividir o valor por zero não é permitido"); //IllegalStateException: é um argumento ultilizado para uma excecão em java que faz um tratamento em java caso o preenchimento do objeto seja algo não esperado;
            }

        }else{
            throw new IllegalArgumentException("Valor invalido. Use o +,*,- ou /");
        }
    }
    public static void main(String[] args) {

        //Somatória
        System.out.println(calcular(10, 5, "+")); // valor 15
        //Subtração
        System.out.println(calcular(10,5,"-")); //valor 5
        //Multiplicação
        System.out.println(calcular(10,5,"*")); // valor 50
        //Divisão
        System.out.println(calcular(10,0,"/")); // Não consegue fazer a divisão se resultado for zero.
    }
}
