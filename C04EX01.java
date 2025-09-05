package Etapa1;
import java.util.Scanner;
public class C04EX01 {
    //Autor : Luiz Felipe Schuvarz Eleutério
    public static void main(String[] args) {

//        abre o teclado
        Scanner teclado = new Scanner(System.in);

//        cria as variáveis
        String nome, nomMeio, sobreNom;
        long idade;

//        atribui às variáveis os valores inseridos
        System.out.print("Insira seu nome: ");
            nome = teclado.nextLine();
        System.out.print("Insira seu primeiro nome: ");
            nomMeio = teclado.nextLine();
        System.out.print("Insira seu segundo nome: ");
            sobreNom = teclado.nextLine();
        System.out.print("Insira sua idade: ");
            idade = teclado.nextLong();

//        printa o sistema
        System.out.println();
        System.out.println(sobreNom+" ,"+nome+" "+nomMeio);
        System.out.println(idade+" anos.");

//        fecha o teclado
        teclado.close();
    }
}
