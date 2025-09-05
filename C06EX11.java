package Etapa1;
import javax.swing.JOptionPane;
public class C06EX11 {

//    Aluno = Luiz Felipe Schvarz Eleutério

    public static void main(String[] args) {

//        Cria as variáveis
        String equipe1, equipe2, sets1Str, sets2Str;
        int pontos1, pontos2;
        pontos1 = 0;
        pontos2 = 0;


//        Solicita e transforma as variáveis em int
        equipe1 = JOptionPane.showInputDialog(null,
                "Insira o nome da equipe 1:",
                "",
                JOptionPane.INFORMATION_MESSAGE);

        sets1Str = JOptionPane.showInputDialog(null,
                "Insira os sets da equipe 1:",
                "",
                JOptionPane.INFORMATION_MESSAGE);
        int sets1 = Integer.valueOf(sets1Str);

        equipe2 = JOptionPane.showInputDialog(null,
                "Insira o nome da equipe 2:",
                "",
                JOptionPane.INFORMATION_MESSAGE);


        sets2Str = JOptionPane.showInputDialog(null,
                "Insira os sets da equipe 2:",
                "",
                JOptionPane.INFORMATION_MESSAGE);
        int sets2 = Integer.valueOf(sets2Str);


//        Cria as condições para definir os pontos
        if (sets1 == 3){
            pontos1 = 3;
        } else if (sets2 ==3) {
            pontos2 = 3;
        } else if (sets1 == 2) {
            pontos1 = 2;
            pontos2 = 1;
        } else if (sets2 == 2) {
            pontos1 = 1;
            pontos2 = 2;
        }

        JOptionPane.showMessageDialog(null,
                "Equipe 1: "+equipe1+"\nSets equipe 1: "+sets1+"\nPontos: "+pontos1+
                "\n\n\nEquipe 2: "+equipe2+"\nSets equipe 2: "+sets2+"\nPontos: "+pontos2,
                "",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
