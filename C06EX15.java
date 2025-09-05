package Etapa1;
import javax.swing.JOptionPane;
public class C06EX15 {

//    Aluno = Luiz Felipe Schuvarz Eleutério

    public static void main(String[] args) {

//        Cria as variáveis
        String codigoStr, diasStr, servicoStr, cidade;
        double conta, diaria, valorFixo, imposto, impostoTot;

//        Solicita e transforma as variáveis nos respectivos valores
        codigoStr = JOptionPane.showInputDialog(null,
                "Insira o código do pacote:",
                "",
                JOptionPane.QUESTION_MESSAGE);
        double codigo = Double.valueOf(codigoStr);

        diasStr = JOptionPane.showInputDialog(null,
                "Insira o número de dias que o pacote foi usado:",
                "",
                JOptionPane.QUESTION_MESSAGE);
        double dias = Double.valueOf(diasStr);

        servicoStr = JOptionPane.showInputDialog(null,
                "Insira o valor dos serviços extra do pacote:",
                "",
                JOptionPane.QUESTION_MESSAGE);
        double servico = Double.valueOf(servicoStr);

        cidade = JOptionPane.showInputDialog(null,
                "Insira a cidade:",
                "",
                JOptionPane.QUESTION_MESSAGE);


//        Cria as condições e define valores
        if (codigo == 1){
            valorFixo = 65;
            if (dias > 54){
                diaria = 65;
            }
            else {
                diaria = 1.2 * dias;
            }
        } else if (codigo == 2) {
            valorFixo = 104;
            diaria = dias * 2.1;
        } else {
            valorFixo = 137;
            diaria = 0;
        }
        if (cidade.equalsIgnoreCase("Belo Horizonte")) {
            imposto = 0;
        } else if (cidade.equalsIgnoreCase("São Paulo")) {
            imposto = 0.01;
        } else if (cidade.equalsIgnoreCase("Rio de Janeiro")) {
            imposto = 0.015;
        } else {
            imposto = 0.02;
        }


//        Calcula o imposto
        impostoTot = imposto * (valorFixo + diaria + servico);

//        Calcula a conta
        conta = valorFixo + diaria + servico + impostoTot;


//        Printa o resultado
        JOptionPane.showMessageDialog(null,
                "O valor da conta é R$"+String.format("%1.2f", conta),
                "",
                JOptionPane.INFORMATION_MESSAGE);

    }
}
