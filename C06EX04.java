package Etapa1;
import javax.swing.JOptionPane;
public class C06EX04 {

//    Aluno = Luiz Felipe Schuvarz Eleutério

    public static void main(String[] args) {

//        Cria as variáveis
        String nome, alturaStr, pesoStr;
        double imc;


//        Solicita e transforma as variáveis string em double
        nome = JOptionPane.showInputDialog(null,
                "Insira seu nome:",
                "",
                JOptionPane.QUESTION_MESSAGE);

        alturaStr = JOptionPane.showInputDialog(null,
                "Insira sua altura em metros:",
                "",
                JOptionPane.QUESTION_MESSAGE);
        double altura = Double.valueOf(alturaStr);

        pesoStr = JOptionPane.showInputDialog(null,
                "Insira seu peso em quilos:",
                "",
                JOptionPane.QUESTION_MESSAGE);
        double peso = Double.valueOf(pesoStr);

        imc = peso / Math.pow(altura , 2.0);


//        Define as condições e printa o resultado
        if (imc < 18){
            JOptionPane.showMessageDialog(null,
                    "Seu imc é "+imc+". Você, "+nome+", está desnutrido.",
                    "",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            if (imc < 20){
                JOptionPane.showMessageDialog(null,
                        "Seu imc é "+String.format("%1.2f", imc)+". Você, "+nome+", está abaixo do peso.",
                        "",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                if (imc <= 25){
                    JOptionPane.showMessageDialog(null,
                            "Seu imc é "+String.format("%1.2f", imc)+". Você, "+nome+", está no peso ideal.",
                            "",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    if (imc <= 27){
                        JOptionPane.showMessageDialog(null,
                                "Seu imc é "+String.format("%1.2f", imc)+". Você, "+nome+", está acima do peso.",
                                "",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,
                                "Seu IMC é "+String.format("%1.2f", imc)+". Você, "+nome+", está obeso",
                                "",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        }
    }
}
