package Etapa1;
import javax.swing.JOptionPane;
public class C06EX05 {

//    Aluno = Luiz Felipe Schuvarz Eleutério

    public static void main(String[] args) {

//        Cria as variáveis
        String numStr;
        int resto1, resto2;


//        Solicita e transforma a variável em integer
        numStr = JOptionPane.showInputDialog(null,
                "Insira um número inteiro:",
                "",
                JOptionPane.QUESTION_MESSAGE);
        int num = Integer.valueOf(numStr);


//        Calcula os restos de divisão
        resto1 = num % 7;
        resto2 = num % 5;


//        Cria as condições e printa os resultados
        if (resto1 == 0 && resto2 ==0){
            JOptionPane.showMessageDialog(null,
                    "O número "+num+" é divisível simultaneamente por 5 e por 7",
                    "",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null,
                    "O número "+num+" não é divisível simultaneamente por 5 e por 7");
        }
    }
}
