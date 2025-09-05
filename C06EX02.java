package Etapa1;
import javax.swing.JOptionPane;
public class C06EX02 {

//    Aluno = Luiz Felipe Schuvarz Eleutério

    public static void main(String[] args) {

//        cria as variáveis
        String poluenteStr;
        double multa;

//        Define e converte as variáveis
        poluenteStr = JOptionPane.showInputDialog(null,
                "Insira a quantidade de poluentes emitidos:",
                "",
                JOptionPane.QUESTION_MESSAGE);
        double poluentes = Double.valueOf(poluenteStr);

//        Define as condições e faz os cálculos
        if (poluentes <= 1500){
            multa = 0;
        }
        else {
            if (poluentes <=3500){
                multa = 3000;
            }
            else
                multa = 5000 * poluentes;
        }

        JOptionPane.showMessageDialog(null,
                "O valor da multa é de R$"+String.format("%1.2f", multa),
                "",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
