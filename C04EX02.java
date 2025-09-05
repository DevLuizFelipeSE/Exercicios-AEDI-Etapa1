package Etapa1;
import java.util.Scanner;
public class C04EX02 {
    //Autor : Luiz Felipe Schuvarz Eleutério
    public static void main(String[] args) {

//        abre o teclado
        Scanner teclado = new Scanner(System.in);

//        cria as variaveis
        String nome, cpf, ci, empresa;
        long tituloEleitor, cnh;
        double salario;

//        atribui às variáveis os valores inseridos
        System.out.print("Insira seu nome: ");
            nome = teclado.nextLine();
        System.out.print("Insira seu CPF: ");
            cpf = teclado.nextLine();
        System.out.print("Insira seu C.I.: ");
            ci = teclado.nextLine();
        System.out.print("Insira a empresa que você faz parte: ");
            empresa = teclado.nextLine();
        System.out.print("Insira seu Título de Eleitor: ");
            tituloEleitor = teclado.nextLong();
        System.out.print("Insira sua CNH: ");
            cnh = teclado.nextLong();
        System.out.print("Insira o valor que você recebe de salário: ");
            salario = teclado.nextDouble();

//        printa o sistema
        System.out.println();
        System.out.println();
        System.out.println("FICHA FUNCIONAL DE: "+nome);
        System.out.println();
        System.out.println("Documentos:");
        System.out.println("CPF ..................................... "+cpf);
        System.out.println("C.I. .................................... "+ci);
        System.out.println("Título de Eleitor  ...................... "+tituloEleitor);
        System.out.println("Carteira de Motorista ................... "+cnh);
        System.out.println();
        System.out.println("Empresa: "+empresa);
        System.out.println("salário: R$"+salario);

//        fecha o teclado
        teclado.close();
    }

}
