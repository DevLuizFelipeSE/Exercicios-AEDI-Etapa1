package Etapa1;
import javax.swing.JOptionPane;
public class C05EXext03 {

    //Autor : Luiz Felipe Schuvarz Eleutério

    public static void main(String[] args) {

//        cria as variáveis
        String mudasStr, papelaoStr, madeiraStr, freteStr, perdaStr;
        double caminhoes, caixaPap, caixaMad, producao, precoPap, precoMad, precoFrete, precoTot;

//      Solicita e converte as variáveis
        mudasStr = JOptionPane.showInputDialog(null,
                "Insira o número de mudas:",
                "",
                JOptionPane.QUESTION_MESSAGE);
        double mudas = Double.valueOf(mudasStr);

        perdaStr = JOptionPane.showInputDialog(null,
                "Insira o número de perdas:",
                "",
                JOptionPane.QUESTION_MESSAGE);
        double perda = Double.valueOf(perdaStr);

        papelaoStr = JOptionPane.showInputDialog(null,
                "Insira o valor do papelão:",
                "",
                JOptionPane.QUESTION_MESSAGE);
        double papelao = Double.valueOf(papelaoStr);

        madeiraStr = JOptionPane.showInputDialog(null,
                "Insira o valor da madeira:",
                "",
                JOptionPane.QUESTION_MESSAGE);
        double madeira = Double.valueOf(madeiraStr);

        freteStr = JOptionPane.showInputDialog(null,
                "Insira o valor do frete:",
                "",
                JOptionPane.QUESTION_MESSAGE);
        double frete = Double.valueOf(freteStr);

//        faz os respectivos cálculos
        producao = mudas - perda;
        caixaPap = Math.ceil(producao/7.0);
        caixaMad = Math.ceil(caixaPap/15.0);
        caminhoes = Math.ceil(caixaMad/50.0);

        precoPap = caixaPap * papelao;
        precoMad = caixaMad * madeira;
        precoFrete = caminhoes * frete;
        precoTot = precoMad + precoPap + precoFrete;

//        printa o resultado
        JOptionPane.showMessageDialog(null,
                "O custo total foi de "+String.format("%1.2f", precoTot),
                "",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
