package Etapa1;
import javax.swing.JOptionPane;
public class C07EX01 {

//    Aluno = Luiz Felipe Schuvarz Eleutério

    public static void main(String[] args) {

//        Cria as variáveis
        String nome, acertosStr;
        double premio = 0;


//        Solicita e transforma a variável acertos em int
        nome = JOptionPane.showInputDialog(null,
                "Insira o nome do apostador:",
                "",
                JOptionPane.QUESTION_MESSAGE);

        acertosStr = JOptionPane.showInputDialog(null,
                "Insira a quantidade de acertos:",
                "",
                JOptionPane.QUESTION_MESSAGE);
        int acertos = Integer.valueOf(acertosStr);

//        Cria as condições
        switch (acertos){
            case 1, 2, 3, 4, 5 -> {
                premio = 0;
            }
            case 6, 7, 8, 9, 10 ->
                JOptionPane.showMessageDialog(null,
                        "Seu prêmio foi outro cartão",
                        "",
                        JOptionPane.INFORMATION_MESSAGE);
            case 11 ->{
                premio = 100;
            }
            case 12 ->{
                premio = 1000;
            }
            case 13->{
                premio = 50000;
            }
        }

//        Printa o resultado
        JOptionPane.showMessageDialog(null,
                "Seu prêmio foi de R$"+premio,
                "",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
