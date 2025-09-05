package Etapa1;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class C04EX05 {

    //Autor : Luiz Felipe Schuvarz Eleutério

    public static void main(String[] args) {

//        cria as variáveis
        String nome, cpf, ci, tituloEleitorStr, cnhStr, empresa, salarioStr;

//        cria um scanner para o arquivo txt
        Scanner arquivo = new Scanner(
                C04EX05.class.getResourceAsStream("ficha.txt"));

//        lê cada linha do arqivo
        nome = arquivo.nextLine();
        cpf = arquivo.nextLine();
        ci = arquivo.nextLine();
        tituloEleitorStr = arquivo.nextLine();
        cnhStr = arquivo.nextLine();
        empresa = arquivo.nextLine();
        salarioStr = arquivo.nextLine();

//        tranforma o salario string em salario integer
        int salario = Integer.parseInt(salarioStr);

//        printa o reultado
        JOptionPane.showMessageDialog(null,
                "Documentos:\nCPF: "+cpf+"\nC.I.: "+ci+"\nTítulo de Eleitor: "+tituloEleitorStr+"\nCarteira de Motorista: "+cnhStr+"\n\nEmpresa: "+empresa+"\nSalário: R$"+salario,
                "Ficha Funcional de "+nome,
                JOptionPane.INFORMATION_MESSAGE);
    }
}
