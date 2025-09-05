package Etapa1;
import javax.swing.JOptionPane;
public class C06EX03 {

//    Aluno = Luiz Felipe Schuvar Eleutério

    public static void main(String[] args) {

//        Crias as variáveis
        String vendasStr;
        double salario, comissao;

//        Solicita e converte a variável
        vendasStr = JOptionPane.showInputDialog(null,
                "Insira o valor mensal de vendas:",
                "",
                JOptionPane.QUESTION_MESSAGE);
        double vendas = Double.valueOf(vendasStr);

//        cria as condições e faz os cálculos
        if (vendas <= 1000){
            comissao = 0;
        }
        else {
            if (vendas <= 10000){
                comissao = vendas * 0.10;
            }
            else {
                comissao = 1000;
            }
        }

//        calcula o salário
        salario = 240.0 + comissao;

//        printa o resultado
        JOptionPane.showMessageDialog(null,
                "O salário é igual a R$"+salario,
                "",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
