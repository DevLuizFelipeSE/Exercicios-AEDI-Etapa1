package Etapa1;
import javax.swing.JOptionPane;
public class C06EX07 {

//    Aluno = Luiz Felipe Schuvarz Eleutério

    public static void main(String[] args) {

//        Cria as variáveis
        String salarioStr;
        double pLBruto, pLLiq, iR;

//        Solicita e converte a variável em double
        salarioStr = JOptionPane.showInputDialog(null,
                "Insira o valor do salário",
                "",
                JOptionPane.QUESTION_MESSAGE);
        double salario = Double.valueOf(salarioStr);


//       Cria as condições e printa o resultado
        if (salario <= 300){
            pLBruto = 500 + (0.7 * salario);
            iR = pLBruto * 0.25;
            pLLiq = pLBruto - iR;
            JOptionPane.showMessageDialog(null,
                    "O PL líquido é "+String.format("%1.2f", pLLiq),
                    "",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            if (salario <= 1000){
                pLBruto = 200 + (0.5 * salario);
                iR = pLBruto * 0.25;
                pLLiq = pLBruto - iR;
                JOptionPane.showMessageDialog(null,
                        "O PL líquido é "+String.format("%1.2f", pLLiq),
                        "",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                pLBruto = (0.3 * salario);
                iR = pLBruto * 0.25;
                pLLiq = pLBruto - iR;
                JOptionPane.showMessageDialog(null,
                        "O PL líquido é "+String.format("%1.2f", pLLiq),
                        "",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
