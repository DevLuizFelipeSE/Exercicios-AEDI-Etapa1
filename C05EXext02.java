package Etapa1;
import javax.swing.JOptionPane;
public class C05EXext02 {

    //Autor : Luiz Felipe Schuvarz Eleutério

    public static void main(String[] args) {

//        cria as variáveis
        String timeStr, speedStr;
        double tRelativo, vLuz;

//        determina o valor da variável velociadade da luz
        vLuz = 3.0 * Math.pow(10.0 , 8.0);

//        solicita e transforma o x1 string em double
        timeStr = JOptionPane.showInputDialog(null,
                "Insira o tempo:",
                "",
                JOptionPane.QUESTION_MESSAGE);
        double time = Double.valueOf(timeStr);

        speedStr = JOptionPane.showInputDialog(null,
                "Insira a velocidade:",
                "",
                JOptionPane.QUESTION_MESSAGE);
        double speed = Double.valueOf(speedStr);

//        calcula a função
        tRelativo = time * (1.0 / Math.sqrt(1 - (Math.pow(speed , 2) / Math.pow(vLuz , 2))));

//        printa o sistema
        JOptionPane.showMessageDialog(null,
                "O tempo relativo é: "+String.format("%1.4f",tRelativo),
                "Tempo Relativo",
                JOptionPane.INFORMATION_MESSAGE);

    }
}
