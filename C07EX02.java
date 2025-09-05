package Etapa1;
import javax.swing.JOptionPane;
public class C07EX02 {

//    Aluno = Luiz Felipe Schuvarz Eleutério

    public static void main(String[] args) {

//        Cria as variáveis
        String nota1Str, nota2Str, nota3Str;
        int media;
        char conceito = 0;


//        Solicita e transforma as variáveis em int
        nota1Str = JOptionPane.showInputDialog(null,
                "Insira a primeira nota:",
                "",
                JOptionPane.QUESTION_MESSAGE);
        int nota1 = Integer.valueOf(nota1Str);

        nota2Str = JOptionPane.showInputDialog(null,
                "Insira a segunda nota:",
                "",
                JOptionPane.QUESTION_MESSAGE);
        int nota2 = Integer.valueOf(nota2Str);

        nota3Str = JOptionPane.showInputDialog(null,
                "Insira a terceira nota:",
                "",
                JOptionPane.QUESTION_MESSAGE);
        int nota3 = Integer.valueOf(nota3Str);


//        Calcula a média
        media = (nota1 + nota2 + nota3) / 3;


//        Cria as cases das condições e printa o resultado
        switch (media){
            case 1, 2, 3, 4 ->{
                conceito = 'E';
            }
            case 5, 6 ->
                conceito = 'D';
            case 7 ->
                conceito = 'C';
            case 8 ->
                conceito = 'B';
            case 9, 10 ->
                conceito = 'A';
        }

//        Printa o resultado
        JOptionPane.showMessageDialog(null,
                "Seu conceito foi "+conceito,
                "",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
