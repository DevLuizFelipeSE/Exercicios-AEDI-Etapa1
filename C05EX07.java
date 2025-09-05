package Etapa1;
import javax.swing.JOptionPane;
public class C05EX07 {

    //Autor : Luiz Felipe Schuvarz Eleutério

    public static void main(String[] args) {

//        cria as variáveis
        String xStr;
        double fX;

//        solicita e transforma o x string em double
        xStr = JOptionPane.showInputDialog(null,
                "Insira o valor de X",
                "X",
                JOptionPane.QUESTION_MESSAGE);
        double x = Double.valueOf(xStr);

//        calcula a função
        fX = Math.sqrt(Math.pow((x / 4.0 + 1) , 2) + (1.0 / 5.0) * x);

//        printa o resultado
        JOptionPane.showMessageDialog(null,
                "O resultado da função é: "+fX,
                "F(x)",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
