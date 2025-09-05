package Etapa1;
import javax.swing.JOptionPane;
public class C05EX12 {

    //Autor : Luiz Felipe Schuvarz Eleutério

    public static void main(String[] args) {

//        cria as variáveis
        String tempoStr;
        int hora, minuto, segundo;

//        solicita e transforma o tempo string em integer
        tempoStr = JOptionPane.showInputDialog(null,
                "Insira o tempo em segundos:",
                "Segundos",
                JOptionPane.QUESTION_MESSAGE);
        int tempo = Integer.valueOf(tempoStr);

//        separa a hora, minuto e segundo
        hora = tempo / 3600;
        segundo = tempo % 3600 ;
        minuto = segundo / 60;
        segundo = tempo % 60;

//        printa as variáveis
        JOptionPane.showMessageDialog(null,
                "Horas: "+hora+"\nMinutos: "+minuto+"\nSegundos: "+segundo,
                "Tempo",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
