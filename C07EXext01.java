package Etapa1;
import javax.swing.JOptionPane;
public class C07EXext01 {

//    Aluno = Luiz Felipe Schuvarz Eleutério

    public static void main(String[] args) {

//        Cria as variáveis
        int pergunta1, pergunta2, pergunta3, pergunta4, pergunta5, respostas;

//        Solicita e transforma as variáveis
        pergunta1 = JOptionPane.showConfirmDialog(null,
                "Telefonou para a vítima?",
                "",
                JOptionPane.YES_NO_OPTION);

        pergunta2 = JOptionPane.showConfirmDialog(null,
                "Esteve no local?",
                "",
                JOptionPane.YES_NO_OPTION);

        pergunta3 = JOptionPane.showConfirmDialog(null,
                "Mora perto da vítima?",
                "",
                JOptionPane.YES_NO_OPTION);

        pergunta4 = JOptionPane.showConfirmDialog(null,
                "Devia para a vítima?",
                "",
                JOptionPane.YES_NO_OPTION);

        pergunta5 = JOptionPane.showConfirmDialog(null,
                "Trabalhou para a vítima?",
                "",
                JOptionPane.YES_NO_OPTION);

//        soma os resultados das respostas
        respostas = pergunta1+pergunta2+pergunta3+pergunta4+pergunta5;

//        Cria as condições e printa os resultados
        switch (respostas){
            case 5 -> {
                JOptionPane.showMessageDialog(null,
                        "O indivíduo é inocente",
                        "",
                        JOptionPane.PLAIN_MESSAGE);
            }
            case 3 ->{
                JOptionPane.showMessageDialog(null,
                        "O indivíduo é suspeito",
                        "",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            case 2, 1 ->{
                JOptionPane.showMessageDialog(null,
                        "O indivíduo é cúmplice",
                        "",
                        JOptionPane.WARNING_MESSAGE);
            }
            case 0 ->{
                JOptionPane.showMessageDialog(null,
                        "Assassino",
                        "",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
