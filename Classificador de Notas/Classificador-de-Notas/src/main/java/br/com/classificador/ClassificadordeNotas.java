package br.com.classificador;

public class ClassificadordeNotas {

    public static String classificarNota(double nota) {
        int caso;

        if (nota >= 7  && nota <= 10) {
            caso = 1;

        } else if (nota >= 5 && nota <= 6.9) {
            caso = 2;

        }else if (nota >= 0 && nota <= 4.9){
            caso = 3;
        }else {
            caso = -1;
        }

        return switch (caso) {
            case 1 -> "Aprovado";
            case 2 -> "Recuperação";
            case 3 -> "Reprovado";
            default -> "Nota Invalida ! \nDigite a Nota corretamente a nota digitada foi: \n" + nota;
        };
    }
    public static void main(String[] args){
        double nota = -1;
        System.out.println(classificarNota(nota));
    }

}
