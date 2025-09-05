package Etapa1;
import javax.swing.JOptionPane;
public class C05EX08 {

    //Autor : Luiz Felipe Schuvarz Eleutério

    public static void main(String[] args) {

//        cria as variáveis
        String areaStr, anguloStr;
        double raio, pi;

//        determina a variável pi
        pi = 3.1416;

//        solicita e transforma a área string em double
        areaStr = JOptionPane.showInputDialog(null,
                "Insira a área do setor circular:",
                "Área",
                JOptionPane.QUESTION_MESSAGE);
        double area = Double.valueOf(areaStr);

//        solicita e transforma o angulo string em double
        anguloStr = JOptionPane.showInputDialog(null,
                "Insira o valor do ângulo: ",
                "Ângulo",
                JOptionPane.QUESTION_MESSAGE);
        double angulo = Double.valueOf(anguloStr);

//        calcula o raio
        raio = Math.sqrt((area * 360.0) / (angulo * pi));

//        printa o resultado
        JOptionPane.showMessageDialog(null,
                "O raio do setor é: "+raio,
                "Raio",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
