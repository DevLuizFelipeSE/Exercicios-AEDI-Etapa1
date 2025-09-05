package Etapa1;
import javax.swing.JOptionPane;
public class C06EX10 {

//    Aluno = Luiz Felipe Schuvarz Eleutério

    public static void main(String[] args) {

//        Cria as variáveis
        String capitalAplicStr, numDiasStr, taxaDiariaStr;
        double rendimento, iR, valorResgate, taxaDiariaPC;


//        Solicita e transforma as variáveis em double
        capitalAplicStr = JOptionPane.showInputDialog(null,
                "Insira o capital aplicado:",
                "",
                JOptionPane.QUESTION_MESSAGE);
        double capitalAplic = Double.valueOf(capitalAplicStr);

        numDiasStr = JOptionPane.showInputDialog(null,
                "Insira o número de dias aplicados:",
                "",
                JOptionPane.QUESTION_MESSAGE);
        double numDias = Double.valueOf(numDiasStr);

        taxaDiariaStr = JOptionPane.showInputDialog(null,
                "Insira taxa diária:",
                "",
                JOptionPane.QUESTION_MESSAGE);
        double taxaDiaria = Double.valueOf(taxaDiariaStr);


//        Calcula e printa o resultado
        taxaDiariaPC = taxaDiaria / 100;
            rendimento = capitalAplic * taxaDiariaPC * numDias;
            iR = rendimento * 0.15;
            valorResgate = capitalAplic + rendimento - iR - 10;
            JOptionPane.showMessageDialog(null,
                    "O valor resgatado é R$"+String.format("%1.2f", valorResgate),
                    "",
                    JOptionPane.INFORMATION_MESSAGE);
    }
}
