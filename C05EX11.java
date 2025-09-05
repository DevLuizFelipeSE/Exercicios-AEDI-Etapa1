package Etapa1;
import javax.swing.JOptionPane;
public class C05EX11 {

    //Autor : Luiz Felipe Schuvarz Eleutério

    public static void main(String[] args) {

//        cria as variáveis
        String chequeStr;
        int banco, agencia, sequencial;

//        solicita e transforma o cheque string em integer
        chequeStr = JOptionPane.showInputDialog(null,
                "Insira o cheque:",
                "Cheque",
                JOptionPane.QUESTION_MESSAGE);
        int cheque = Integer.valueOf(chequeStr);

//        separa os números
        banco = cheque / 1000000;
        agencia = cheque % 1000000 / 1000;
        sequencial = cheque % 1000;

//        printa os resultados
        JOptionPane.showMessageDialog(null,
                "Cheque: \nBanco: "+banco+"\nAgência: "+agencia+"\nSequencial: "+sequencial,
                "Cheque",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
