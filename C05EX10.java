package Etapa1;
import javax.swing.JOptionPane;
public class C05EX10 {

    //Autor : Luiz Felipe Schuvarz Eleutério

    public static void main(String[] args) {

//        cria as variáveis
        String numeroStr;
        int d1, d2, d3, d4, d5;

//        solicita e transforma o número string em integer
        numeroStr = JOptionPane.showInputDialog(null,
                "Insira um número inteiro de 5 caracteres:",
                "Número",
                JOptionPane.QUESTION_MESSAGE);
        int numero = Integer.valueOf(numeroStr);

//        separa os números
        d1 = numero / 10000;
        d2 = numero / 1000 % 10;
        d3 = numero / 100 % 10;
        d4 = numero / 10 % 10;
        d5 = numero % 10;

//        printa o resultado
        JOptionPane.showMessageDialog(null,
                "Impressão = \n"+d1+"\n"+d2+"\n"+d3+"\n"+d4+"\n"+d5,
                "Número",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
