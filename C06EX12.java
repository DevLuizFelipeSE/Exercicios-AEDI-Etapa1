package Etapa1;
import javax.swing.JOptionPane;
public class C06EX12 {

//    Aluno = Luiz Felipe Schuvarz Eleutério

    public static void main(String[] args) {

//        Cria as variáveis
        String bolasStr, bolasDefStr, precoCaixaPStr, tempoCopaStr, aluguelStr;
        double custoTotal;
        long caixaP, galpao, bolasTot;


//        Solicita e converte as variáveis nos respectivos valores
        bolasStr = JOptionPane.showInputDialog(null,
                "Insira o número de bolas produzidas:",
                "",
                JOptionPane.QUESTION_MESSAGE);
        long bolas = Long.valueOf(bolasStr);

        bolasDefStr = JOptionPane.showInputDialog(null,
                "Insira o número de bolas com defeito:",
                "",
                JOptionPane.QUESTION_MESSAGE);
        long bolasDef = Long.valueOf(bolasDefStr);

        aluguelStr = JOptionPane.showInputDialog(null,
                "Insira o valor do aluguel mensal do galpão:",
                "",
                JOptionPane.QUESTION_MESSAGE);
        double aluguel = Double.valueOf(aluguelStr);

        precoCaixaPStr = JOptionPane.showInputDialog(null,
                "Insira o valor das caixas de papelão:",
                "",
                JOptionPane.QUESTION_MESSAGE);
        double precoCaixaP = Double.valueOf(precoCaixaPStr);

        tempoCopaStr = JOptionPane.showInputDialog(null,
                "Insira o tempo até a copa em meses:",
                "",
                JOptionPane.QUESTION_MESSAGE);
        long tempoCopa = Long.valueOf(tempoCopaStr);


//        Cálculos e condições
        bolasTot = bolas - bolasDef;
        caixaP = bolasTot / 10;
        if (bolasTot % 10 != 0) {
            caixaP++;
        }
        galpao = caixaP / 850;
        if (caixaP % 850 != 0) {
            galpao++;
        }


//        Cálculo total
        custoTotal = (precoCaixaP * caixaP) + (aluguel * galpao * tempoCopa);


//        printa o resultado
        JOptionPane.showMessageDialog(null,
                "O valor total é R$: "+String.format("%1.2f", custoTotal),
                "",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
