package Etapa1;
import javax.swing.JOptionPane;
public class C06EX08 {

//    Aluno = Luiz Felipe Schuvarz Eleutério

    public static void main(String[] args) {

//        Cria a variáveis
        String nome, alturaStr;
        double peso1, peso2;

//        Solicita e transforma a variável em double
        nome = JOptionPane.showInputDialog(null,
                "Insira seu nome:",
                "",
                JOptionPane.QUESTION_MESSAGE);

        alturaStr = JOptionPane.showInputDialog(null,
                "Insira sua altura:",
                "",
                JOptionPane.QUESTION_MESSAGE);
        double altura = Double.valueOf(alturaStr);


//        Cálculos
        peso1 = 20 * Math.pow(altura , 2.0);
        peso2 = 25 * Math.pow(altura , 2.0);


//        Printa os resltados
        JOptionPane.showMessageDialog(null,
                "Seu peso ideal está entre "+String.format("%1.2f", peso1)+" e "+String.format("%1.2f", peso2),
                "",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
