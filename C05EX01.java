package Etapa1;
import javax.swing.JOptionPane;
public class C05EX01 {

    //Autor : Luiz Felipe Schuvarz Eleutério

    public static void main(String[] args) {

//        cria as variáveis
        String valorXStr;
        double funcao;

//        solicita o valor de x
        valorXStr = JOptionPane.showInputDialog(null,
                "Insira o valor de x: ",
                "Cálculo de função",
                JOptionPane.QUESTION_MESSAGE);

//        transforma o x string em x double
        double valorX = Double.valueOf(valorXStr);

//        calcula a função
        funcao = Math.pow(valorX, 3.0) + 4.0*valorX + 10.0;

//        printa o resultado
        JOptionPane.showMessageDialog(null,
                "O resultado da função é "+funcao,
                "Valor da função",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
