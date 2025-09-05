package Etapa1;
import javax.swing.JOptionPane;
public class C05EX03 {

    //Autor : Luiz Felipe Schuvarz Eleutério

    public static void main(String[] args) {

//        cria as variáveis
        String salarioStr, numDependentesStr;
        double liquido, impRenda;

//        solicita e transforma o salário string em double
        salarioStr = JOptionPane.showInputDialog(null,
                "Insira seu salário:",
                "salário",
                JOptionPane.QUESTION_MESSAGE);
        double salario = Double.valueOf(salarioStr);

//        solicita e transforma o numero de dependentes string em double
        numDependentesStr = JOptionPane.showInputDialog(null,
                "Insira o número de dependentes:",
                "Número de dependentes",
                JOptionPane.QUESTION_MESSAGE);
        double numDependentes = Double.valueOf(numDependentesStr);

//        calcula o líquido
        liquido = salario - (numDependentes * 60.0);

//        calcula o imposto de renda
        impRenda = liquido * 0.15;

//        printa o resultado
        JOptionPane.showMessageDialog(null,
                "Seu imposto de renda tem o valor de R$"+impRenda,
                "Imposto de Renda",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
