package Etapa1;
import javax.swing.JOptionPane;
public class C06EX01 {

    //Autor : Luiz Felipe Schuvarz Eleutério

    public static void main(String[] args) {

//        cria as variáveis
        String xStr;
        double fX;

//        solicita e transforma o x string em double
        xStr = JOptionPane.showInputDialog(null,
                "Insira o valor de x:",
                "x",
                JOptionPane.QUESTION_MESSAGE);
        double x = Double.valueOf(xStr);

//        determina as condições
        if (x < 4.0) {
            fX = (5.0 * x + 3) / Math.sqrt(16 - Math.pow(x, 2.0));
        }
        else {
            if (x == 4.0) {
                fX = 0;
            }
            else {
                fX = (5.0 * x + 3) / Math.sqrt(Math.pow(x, 2.0) - 16);
            }
        }
//            printa o resultado
        JOptionPane.showMessageDialog(null,
                "O valor de F(x) é: "+fX,
                "F(x)",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
