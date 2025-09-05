package Etapa1;
import javax.swing.JOptionPane;
public class C06EX14 {

//    Aluno = Luiz Felipe Schuvarz Eleutério

    public static void main(String[] args) {

//        Cria as variáveis
        String numStr;
        int n1, n2, n3, n4, n5;


//        Solicita e transforma a variável em int
        numStr = JOptionPane.showInputDialog(null,
                "Insira um número de 4 dígitos:",
                "",
                JOptionPane.QUESTION_MESSAGE);
        int num = Integer.valueOf(numStr);


//        Decompõe o número
        n1 = num % 10;
        n2 = num / 10 % 10;
        n3 = num / 100 % 10;
        n4 = num / 1000 % 10;
        n5 = num / 10000;


//        Cria as condições e printa o resultado
        if (n5 == 0){
            JOptionPane.showMessageDialog(null,
                    n1 + "" + n2 + "" + n3 + "" + n4,
                    "",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null,
                    "O número não pode exceder 4 dígitos",
                    "",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
