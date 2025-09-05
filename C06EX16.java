package Etapa1;
import javax.swing.JOptionPane;
public class C06EX16 {

//    Aluno = Luiz Felipe Schuvarz Eleutério

    public static void main(String[] args) {

//        Cria as variáveis
        String faltasStr, notaTFStr, notaP1Str, notaP2Str, notaP3Str, idadeStr;
        double media, mediaP, n1 = 0, n2 = 0;
        int peso1, peso2;


//        Solicita e transforma as variáveis em double
        faltasStr = JOptionPane.showInputDialog(null,
                "Insira o número de faltas:",
                "",
                JOptionPane.INFORMATION_MESSAGE);
        double faltas = Double.valueOf(faltasStr);

        notaP1Str = JOptionPane.showInputDialog(null,
                "Insira o valor da primeira prova:",
                "",
                JOptionPane.INFORMATION_MESSAGE);
        double notaP1 = Double.valueOf(notaP1Str);

        notaP2Str = JOptionPane.showInputDialog(null,
                "Insira o valor da segunda prova:",
                "",
                JOptionPane.INFORMATION_MESSAGE);
        double notaP2 = Double.valueOf(notaP2Str);

        notaP3Str= JOptionPane.showInputDialog(null,
                "Insira o valor da terceira prova:",
                "",
                JOptionPane.INFORMATION_MESSAGE);
        double notaP3 = Double.valueOf(notaP3Str);

        notaTFStr = JOptionPane.showInputDialog(null,
                "Insira o valor do trabalho final:",
                "",
                JOptionPane.INFORMATION_MESSAGE);
        double notaTF = Double.valueOf(notaTFStr);

        idadeStr = JOptionPane.showInputDialog(null,
                "Insira a idade:",
                "",
                JOptionPane.INFORMATION_MESSAGE);
        double idade = Double.valueOf(idadeStr);


//        Cria as condições do peso 1
        if (faltas <= 5) {
            peso1 = 3;
        } else if (faltas <= 10) {
            peso1 = 2;
        } else {
            peso1 = 1;
        }

//        Cria as condições do peso 2
        if (idade <= 17) {
            peso2 = 1;
        } else if (idade <= 50) {
            peso2 = 2;
        } else {
            peso2 = 3;
        }

//        Encontra as notas de maior valor
        if (notaP1 > notaP3 && notaP2 > notaP3){
            n1 = notaP1;
            n2 = notaP2;
        } else if (notaP1 > notaP2 && notaP3 > notaP2) {
            n1 = notaP1;
            n2 = notaP3;
        } else if (notaP2 > notaP1 && notaP3 > notaP1) {
            n1 = notaP2;
            n2 = notaP3;
        }

//        Calcula a media de provas
        mediaP =(n1 + n2) / 2;
//        Calcula o valor total dos pontos
        media = mediaP * peso1 + notaTF * peso2;

//        Define as condições de resultado final
            if (media <= 50){
                JOptionPane.showMessageDialog(null,
                        "Reprovado\nNota:"+media,
                        "",
                        JOptionPane.ERROR_MESSAGE);
            } else if (media <=70) {
                JOptionPane.showMessageDialog(null,
                        "Regular\nNota:"+media,
                        "",
                        JOptionPane.INFORMATION_MESSAGE);
            } else if (media <= 80) {
                JOptionPane.showMessageDialog(null,
                        "Bom\nNota:"+media,
                        "",
                        JOptionPane.INFORMATION_MESSAGE);
            } else if (media <= 90) {
                JOptionPane.showMessageDialog(null,
                        "Muito Bom\nNota:"+media,
                        "",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null,
                        "Excelente\nNota:"+media,
                        "",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
}
