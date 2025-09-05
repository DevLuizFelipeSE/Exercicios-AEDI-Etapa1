package Etapa1;
import javax.swing.JOptionPane;
public class C05EXext01 {

    //Autor : Luiz Felipe Schuvarz Eleutério

    public static void main(String[] args) {

//        cria as variáveis
        String numeroStr;
        int n1, n2, n3, n4;

//        solicita e transforma o numero string em integer
        numeroStr = JOptionPane.showInputDialog(null,
                "Insira um número de 4 dígitos:",
                "Palíndromo",
                JOptionPane.QUESTION_MESSAGE);
        int numero = Integer.valueOf(numeroStr);

//        separa os números
        n1 = numero /1000;
        n2 = numero /100 % 10;
        n3 = numero /10 % 10;
        n4 = numero % 10;

//        cria as condicionais e printa o resultado
        if (n1 == n4 && n2 == n3) {
            JOptionPane.showMessageDialog(null,
                    "O número " + numero + " é um palíndromo",
                    "Palíndromo",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null,
                    "O número " + numero + " não é um palíndromo",
                    "Não Palindromo",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
