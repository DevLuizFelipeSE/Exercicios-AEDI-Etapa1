package Etapa1;
import javax.swing.JOptionPane;
public class C05EX04 {

    //Autor : Luiz Felipe Schuvarz Eleutério

    public static void main(String[] args) {

//        cria as variáveis
        String x1Str, y1Str, x2Str, y2Str;
        double distancia;

//        solicita e transforma o x1 string em double
        x1Str = JOptionPane.showInputDialog(null,
                "Insira o ponto x¹:",
                "X¹",
                JOptionPane.QUESTION_MESSAGE);
        double x1 = Double.valueOf(x1Str);

//        solicita e transforma o y1 string em double
        y1Str = JOptionPane.showInputDialog(null,
                "Insira o ponto y¹:",
                "y¹",
                JOptionPane.QUESTION_MESSAGE);
        double y1 = Double.valueOf(y1Str);

//        solicita e transforma o x2 string em double
        x2Str = JOptionPane.showInputDialog(null,
                "Insira o ponto x²:",
                "X²",
                JOptionPane.QUESTION_MESSAGE);
        double x2 = Double.valueOf(x2Str);

//        solicita e transforma o y2 string em double
        y2Str = JOptionPane.showInputDialog(null,
                "Insira o ponto y²:",
                "y²",
                JOptionPane.QUESTION_MESSAGE);
        double y2 = Double.valueOf(y2Str);

//        calcula a distância
        distancia = Math.sqrt(Math.pow((x1 - x2), 2.0) + Math.pow((y1 - y2), 2.0));

//        prnta o sistema
        JOptionPane.showMessageDialog(null,
                "A distância entre as duas coordenadas é: "+distancia,
                "distância",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
