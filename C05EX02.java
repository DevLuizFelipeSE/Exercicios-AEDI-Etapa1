package Etapa1;
import javax.swing.JOptionPane;
public class C05EX02 {

    //Autor : Luiz Felipe Schuvarz Eleutério

    public static void main(String[] args) {

//        cria as variáveis
        String raioStr;
        double area, volume;

//        solicita o valor do raio e transforma a string em double
        raioStr = JOptionPane.showInputDialog(null,
                "Insira o valor do raio:",
                "Valor do raio",
                JOptionPane.QUESTION_MESSAGE);
        double raio = Double.valueOf(raioStr);

//        calcula a área
        area = 4.0 * 3.1416 * Math.pow(raio,2.0);

//        calcula o volume
        volume = (4.0/3.0) * 3.1416 * Math.pow(raio,3.0);

//        printa o resultado
        JOptionPane.showMessageDialog(null,
                "A área da esfera é: "+area+"\nO volume da esfera é "+String.format("%1.1f", volume),
                "resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
