package Etapa1;
import javax.swing.JOptionPane;
public class C06EX06 {

    //    Aluno = Luiz Felipe Schuvarz Eleutério

    public static void main(String[] args) {


//        Cria as variáveis
        String aStr, bStr, cStr;
        double raiz1, raiz2, delta;


//        Solicita e transforma as variáveis em double
        aStr = JOptionPane.showInputDialog(null,
                "Insira o valor de A:",
                "",
                JOptionPane.QUESTION_MESSAGE);
        long valorA = Long.valueOf(aStr);

        bStr = JOptionPane.showInputDialog(null,
                "Insira o valor de B:",
                "",
                JOptionPane.QUESTION_MESSAGE);
        long valorB = Long.valueOf(bStr);

        cStr = JOptionPane.showInputDialog(null,
                "Insira o valor de C:",
                "",
                JOptionPane.QUESTION_MESSAGE);
        long valorC = Long.valueOf(cStr);


//        calcula o delta
        delta = Math.pow(valorB , 2) -4 * (valorA * valorC);

//        cria as condições e faz os cálculos
        if (delta < 0) {
            JOptionPane.showMessageDialog(null,
                    "Não existem raizes",
                    "",
                    JOptionPane.INFORMATION_MESSAGE);
        }
            else{
                if (delta == 0){
                    raiz1 = (valorB * -1.0) /( 2.0 * valorA);
                    JOptionPane.showMessageDialog(null,
                            "Apresenta a somente raiz "+raiz1,
                            "",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else {
                    raiz1 = (valorB * -1.0 + Math.sqrt(delta)) / (2.0 * valorA);
                    raiz2 = (valorB * -1.0 - Math.sqrt(delta)) / (2.0 * valorA);
                    JOptionPane.showMessageDialog(null,
                            "Apresenta duas raizes: "+raiz1+", "+raiz2,
                            "",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }

    }
}
