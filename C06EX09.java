package Etapa1;
import javax.swing.JOptionPane;
public class C06EX09 {

//    Aluno = Luiz Felipe Schuvarz Eleutério

    public static void main(String[] args) {

//        Cria as variáveis
        String alturaStr, sexo;
        double pesoM, pesoF;


//        Solicita e converte a variável em long
        alturaStr = JOptionPane.showInputDialog(null,
                "Insira sua altura em metros:",
                "",
                JOptionPane.QUESTION_MESSAGE);
        double altura = Double.valueOf(alturaStr);

        sexo = JOptionPane.showInputDialog(null,
                "Digite M para masculino e F para feminino",
                "",
                JOptionPane.QUESTION_MESSAGE);


//        Cria as condições  e printa o resultado
        if (sexo.equalsIgnoreCase("M")){
            pesoM = 72.7 * altura - 58;
            JOptionPane.showMessageDialog(null,
                    "O peso ideal para a sua altura é "+String.format("%1.2f", pesoM),
                    "",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            pesoF =62.1 * altura - 44.7;
            JOptionPane.showMessageDialog(null,
                    "O peso ideal para a sua altura é "+String.format("%1.2f", pesoF),
                    "",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
