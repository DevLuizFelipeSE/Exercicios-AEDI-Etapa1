package Etapa1;
import javax.swing.JOptionPane;
public class C06EX13 {

//    Aluno = Luiz Felipe Schuvar Eleutério

    public static void main(String[] args) {

//        Cria as variáveis
        String horaIStr, horaFStr, minIStr, minFStr;
        int duracaoH, duracaoM;


//        Solicita e transforma as variáveis em int
        horaIStr = JOptionPane.showInputDialog(null,
                "Insira a hora que começou:",
                "",
                JOptionPane.QUESTION_MESSAGE);
        int horaI = Integer.valueOf(horaIStr);

         minIStr = JOptionPane.showInputDialog(null,
                "Insira os minutos iniciais:",
                "",
                JOptionPane.QUESTION_MESSAGE);
        int minI = Integer.valueOf(minIStr);

         horaFStr = JOptionPane.showInputDialog(null,
                "Insira a hora que terminou:",
                "",
                JOptionPane.QUESTION_MESSAGE);
        int horaF = Integer.valueOf(horaFStr);

         minFStr = JOptionPane.showInputDialog(null,
                "Insira os minutos finais:",
                "",
                JOptionPane.QUESTION_MESSAGE);
        int minF = Integer.valueOf(minFStr);


//        Cálculos
        duracaoH = horaF - horaI;
        duracaoM = minF - minI;

//        Printa o resultado
        JOptionPane.showMessageDialog(null,
                "O tempo de duração foi "+duracaoH+"h e "+duracaoM+"m",
                "",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
