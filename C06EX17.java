package Etapa1;
import javax.swing.JOptionPane;
public class C06EX17 {

//    Aluno = Luiz Felipe Schuvarz Eleutério

    public static void main(String[] args) {

//        Cria as variáveis
        int p1I = 0, p2I = 0, p3I = 0, p4I = 0, p5I = 0, p6I = 0, p7I = 0, p8I = 0, p9I = 0;
        boolean aptidao;


//        Solicita o valor de cada variável
        p1I = JOptionPane.showConfirmDialog(null,
                "Você tem curso técnico de programação?[V/F]",
                "",
                JOptionPane.YES_NO_OPTION);
        boolean p1 = Boolean.valueOf("p1I");

        p2I = JOptionPane.showConfirmDialog(null,
                "Você tem curso superior de programação?[V/F]",
                "",
                JOptionPane.YES_NO_OPTION);
        boolean p2 = Boolean.valueOf("p2I");

        p3I = JOptionPane.showConfirmDialog(null,
                "Você tem menos de 3 anos de experiência em programação?[V/F]",
                "",
                JOptionPane.YES_NO_OPTION);
        boolean p3 = Boolean.valueOf("p3I");

        p4I = JOptionPane.showConfirmDialog(null,
                "Você se considera uma pessoa criativa?[V/F]",
                "",
                JOptionPane.YES_NO_OPTION);
        boolean p4 = Boolean.valueOf("p4I");

        p5I = JOptionPane.showConfirmDialog(null,
                "Você prefere liderar a ser liderado?[V/F]",
                "",
                JOptionPane.YES_NO_OPTION);
        boolean p5 = Boolean.valueOf("p5I");

        p6I = JOptionPane.showConfirmDialog(null,
                "Você prefere trabalhar sozinho a trabalhar em equipe?[V/F]",
                "",
                JOptionPane.YES_NO_OPTION);
        boolean p6 = Boolean.valueOf("p6I");

        p7I = JOptionPane.showConfirmDialog(null,
                "Você é autodidata (aprende sozinho)?[V/F]",
                "",
                JOptionPane.YES_NO_OPTION);
        boolean p7 = Boolean.valueOf("p7I");

        p8I = JOptionPane.showConfirmDialog(null,
                "Você aceitaria uma remuneração inicial de R$1500?[V/F]",
                "",
                JOptionPane.YES_NO_OPTION);
        boolean p8 = Boolean.valueOf("p8I");

        p9I = JOptionPane.showConfirmDialog(null,
                "Você só aceitaria trabalhar em escritórios da empresa dentro da grande BH?[V/F]",
                "",
                JOptionPane.YES_NO_OPTION);
        boolean p9 = Boolean.valueOf("p9I");


//        cria as condições
        if (p1 && !p2 && !p3) {
            aptidao = false;
        } else if (!p4) {
            aptidao = false;
        } else if (p5 && !p8) {
            aptidao = false;
        } else if (!p6) {
            aptidao = false;
        } else if (!p7) {
            aptidao = false;
        } else if (!p9) {
            aptidao = false;
        }

//        Printa o resultado
        if (aptidao = true){
            JOptionPane.showMessageDialog(null,
                    "Você está apto para ser programador na empresa",
                    "",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Você não está apto para ser programador na empresa",
                    "",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
