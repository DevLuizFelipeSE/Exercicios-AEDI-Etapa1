package Etapa1;
import javax.swing.JOptionPane;
public class C05EX06 {

    //Autor : Luiz Felipe Schuvarz Eleutério

    public static void main(String[] args) {

//        cria as variáveis
        String pontoAStr, pontoBStr, pontoCStr, xStr, yStr;
        double reta, distancia;

//        solicita e transforma os valores dos pontos string em double
        pontoAStr = JOptionPane.showInputDialog(null,
                "Insira o ponto A da reta:",
                "ponto A",
                JOptionPane.QUESTION_MESSAGE);
        double pontoA = Double.valueOf(pontoAStr);

        pontoBStr = JOptionPane.showInputDialog(null,
                "Insira o ponto B da reta:",
                "ponto B",
                JOptionPane.QUESTION_MESSAGE);
        double pontoB = Double.valueOf(pontoBStr);

        pontoCStr = JOptionPane.showInputDialog(null,
                "Insira o ponto C da reta:",
                "ponto C",
                JOptionPane.QUESTION_MESSAGE);
        double pontoC = Double.valueOf(pontoCStr);

        xStr = JOptionPane.showInputDialog(null,
                "Insira o ponto X:",
                "X",
                JOptionPane.QUESTION_MESSAGE);
        double x = Double.valueOf(xStr);

       yStr = JOptionPane.showInputDialog(null,
                "Insira o ponto Y:",
                "Y",
                JOptionPane.QUESTION_MESSAGE);
        double y = Double.valueOf(yStr);

//        calcula a reta
        reta = pontoA * x + pontoB * y +pontoC;

//        calcula a distância
        distancia = reta / Math.sqrt(Math.pow(pontoA , 2.0) + Math.pow(pontoB , 2.0));

//        printa o resultado
        JOptionPane.showMessageDialog(null,
                "A distância entre o ponto e a reta "+distancia,
                "distância",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
