package Etapa1;
import javax.swing.JOptionPane;
public class C04EX04 {

    //Autor : Luiz Felipe Schuvarz Eleutério

    public static void main(String[] args) {

//        cria as variáveis
        String nome, segundoNome, sobrenome, idadeStr;

//        Solicita as informações por meio do JOptionPane
        nome = JOptionPane.showInputDialog(null,
                "Qual seu nome?",
                "",
                JOptionPane.QUESTION_MESSAGE);
        segundoNome = JOptionPane.showInputDialog(null,
                "Qual seu segundo nome?",
                "",
                JOptionPane.QUESTION_MESSAGE);
        sobrenome = JOptionPane.showInputDialog(null,
                "Qual seu sobrenome?",
                "",
                JOptionPane.QUESTION_MESSAGE);
        idadeStr = JOptionPane.showInputDialog(null,
                "Qual a sua idade?",
                "",
                JOptionPane.QUESTION_MESSAGE);

//        transforma a string idade em interger idade
        int idade = Integer.valueOf(idadeStr);

//        printa o resultado
        JOptionPane.showMessageDialog(null,
                sobrenome+", "+nome+" "+segundoNome+"\n Idade: "+idade,
                "",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
