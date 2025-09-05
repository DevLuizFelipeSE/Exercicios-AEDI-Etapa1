package Etapa1;
import java.util.Scanner;
public class C03EX05 {
    // Função : Calcula a idade de uma pessoa baseado no ano em que nasceu e o ano atual
    // Autor : Luiz Felipe Schuvarz Eleutério
    public static void main(String[] args) {

//        cria as variáveis
        String nome;
        int anoNasc, anoAtual, idade;

//        abre o teclado
        Scanner teclado = new Scanner(System.in);

//        atribui às variáveis os valores inseridos
        System.out.print("Digite se nome: ");
            nome = teclado.nextLine();
        System.out.print("Digite o ano em que você nasceu; ");
            anoNasc = teclado.nextInt();
        System.out.print("Digite o ano em que estamos: ");
            anoAtual = teclado.nextInt();

//        faz a conta da idade baseada no ano em que nasceu e o ano atual
        idade = anoAtual - anoNasc;

//        printa o sistema
        System.out.println(nome+", você tem/terá "+idade+" anos em "+anoAtual);

//        fecha o teclado
        teclado.close();
    }
}