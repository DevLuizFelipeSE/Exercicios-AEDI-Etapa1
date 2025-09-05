package Etapa1;
import javax.swing.JOptionPane;
public class C07EX03 {

//    Aluno = Luiz Felipe Schuvarz Eleutério

    public static void main(String[] args) {

//        Cria as variáveis
        String impostoStr, diasStr;
        double multa;

//        Solicita e transforma as variáveis nos respectivos valores
        impostoStr = JOptionPane.showInputDialog(null,
                "Insira o valor do imposto:",
                "",
                JOptionPane.QUESTION_MESSAGE);
        double imposto = Double.valueOf(impostoStr);

        diasStr = JOptionPane.showInputDialog(null,
                "Insira a quantidade de dias:",
                "",
                JOptionPane.QUESTION_MESSAGE);
        int dias = Integer.valueOf(diasStr);

//        Cria as condições e calcula a multa
        switch (dias){
            case 1, 2, 3, 4, 5 ->
                multa = 0 * imposto;
            case 6, 7, 8 ->
                multa = 0.2 * imposto;
            case 9, 10 ->
                multa = (0.1 + (dias * 0.005)) * imposto;
            default ->
                multa = (1.5 * imposto) + dias;
        }


//        Printa o resultado
        JOptionPane.showMessageDialog(null,
                "O valor da multa é R$"+String.format("%1.2f", multa),
                "",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
