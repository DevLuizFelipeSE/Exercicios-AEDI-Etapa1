package Etapa1;
import javax.swing.JOptionPane;
public class C05EX09 {

    //Autor : Luiz Felipe Schuvarz Eleutério

    public static void main(String[] args) {

//        cria as variáveis
        String nota1Str, nota2Str, nota3Str;
        double media, peso1, peso2, peso3;

//        solicita e transforma as notas string em double
        nota1Str = JOptionPane.showInputDialog(null,
                "Insira sua primeira nota:",
                "nota 1",
                JOptionPane.QUESTION_MESSAGE);
        double nota1 = Double.valueOf(nota1Str);

        nota2Str = JOptionPane.showInputDialog(null,
                "Insira sua segunda nota:",
                "nota 2",
                JOptionPane.QUESTION_MESSAGE);
        double nota2 = Double.valueOf(nota2Str);

        nota3Str = JOptionPane.showInputDialog(null,
                "Insira sua terceira nota:",
                "nota 3",
                JOptionPane.QUESTION_MESSAGE);
        double nota3 = Double.valueOf(nota3Str);

//        calcula as notas baseadas no peso
        peso1 = nota1 * 2.0;
        peso2 = nota2 * 3.0;
        peso3 = nota3 * 5.0;

//        calcula a média
        media = (peso1 + peso2 + peso3) / 10.0;

//        printa o resultado
        JOptionPane.showMessageDialog(null,
                "A sua média ponderada é "+media,
                "media",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
