package Etapa1;
import java.util.Scanner;
public class C04EX03 {
    //Autor : Luiz Felipe Schuvarz Eleutério
    public static void main(String[] args) {

//        abre o scanner do teclado
        Scanner teclado = new Scanner(System.in);

//        cria as variáveis
        double emissao1, emissao2, multa1, multa2, multa3;

//        atribui às variáveis os respectivos valores inseridos
        System.out.print("Insira o primeiro valor de poluentes emitidos: ");
            emissao1 = teclado.nextDouble();
        System.out.print("Insira o segundo valor de poluentes emitidos: ");
            emissao2 = teclado.nextDouble();
        System.out.print("Insira o valor da primeira multa: ");
            multa1 = teclado.nextDouble();
        System.out.print("Insira o valor da segunda multa: ");
            multa2 = teclado.nextDouble();
        System.out.print("Insira o valor da terceira multa: ");
            multa3 = teclado.nextDouble();


//        printa o sistema
        System.out.println();
        System.out.println("=================================================================");
        System.out.println("        Quantidade de poluentes emitidos x Valor da multa        ");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Até "+emissao1+" multa de R$"+multa1);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Entre "+emissao1+" e "+emissao2+" multa de R$"+multa2);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Acima de "+emissao2+" multa de R$"+multa3);
        System.out.println("=================================================================");

//        fecha o teclado
        teclado.close();
    }
}