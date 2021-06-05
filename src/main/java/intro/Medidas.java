// 1 - Pacote
package intro;

// 2 - Referências sobre as bibliotecas

import java.util.Scanner;

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos - Características

    // 3.2 - Métodos e Funções
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("O P Ç Õ E S");
        System.out.println("c - Calcular Area Modo Curto:");
        System.out.println("e - Calcular Area Modo Extenso:");
        System.out.println("d - Contar até dez:");
        System.out.println("i - if  Simples:");
        System.out.println("r - Contagem regressiva de 10 a 0:");
        System.out.println("Qual a opção desejada: ");
        String opcao = scanner.next();



    //String opcao = "melancia";

    switch (opcao){
        case "c":
        case "C":
            System.out.println("Vcoê escolheu executar o método cacularAreaMetodoCurto");
            calcularAreaModoCurto();
            break;
        case "d":
        case "D":
            System.out.println("Vcoê escolheu executar o método contarAteDez");
            contarAteDez();
            break;

            case "i":
            System.out.println("Vcoê escolheu executar o método ifSimples");
            ifSimples();
            break;
        case "e":
        case "E":
            System.out.println("Vcoê escolheu executar o método calcularAreaModoExtenso");
            calcularAreaModoExtenso();
            break;
        case "r":
        case "R":
            System.out.println("Vcoê escolheu executar o método contagen regressiva");
            contagemRegressiva();
            break;
        default:
            System.out.println("Vcoê escolheu executar o método calcularAreaModoMelancia");
            calcularAreaModoExtenso();
            break;
    }


    }

    public static void ifSimples(){
        String modo = "curto";

        if (modo == "curto"){
            calcularAreaModoCurto();
        }
        else{
            calcularAreaModoExtenso();
        }
    }

    public static void calcularAreaModoCurto(){
        System.out.println("Cálculo de Areas");
        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + "M² e o comprimento de "
                + comprimento + "M² a área do tapete é de: " + largura * comprimento + "M²");
    }

    public static void calcularAreaModoExtenso(){
        // Calculo de área = Exemplo: o tamanho do tapete ou do piso
        int largura;
        int comprimento;
        int resultado;

        largura = 5; //largura recebe 4 unidades
        comprimento = 6;
        resultado = largura * comprimento;
        System.out.println("Para a largura de " + largura + "M² e o comprimento de "
                + comprimento + "M² a área do tapete é de: " + resultado + "M²");
    }

    public void calcularAreaModoCompacto(){
        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + "M² e o comprimento de "
                + comprimento + "M² a área do tapete é de: " + largura * comprimento + "M²");
    }

    public static void contarAteDez(){

        System.out.println("Contagem crescente");

        for (int numero=1; numero <= 10; numero++){
            System.out.println(numero);


        }
    }

    public static void contagemRegressiva(){
        System.out.println("Contagem regressiva");
        for(int numero = 10; numero >= -1; numero--){
            System.out.println(numero);
        }
    }


}
