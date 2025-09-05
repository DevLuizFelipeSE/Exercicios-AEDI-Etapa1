package Etapa1;
import javax.swing.JOptionPane;
public class C07EX04 {

//    Aluno = Luiz Felipe Schuvarz Eleutério

    public static void main(String[] args) {

//        Cria as variáveis
        Object equipeObj;
        String estado = "a";
        String[] opcoes = {"Atlético","América","Cruzeiro","Villa Nova","Botafogo","Flamengo","Fluminense","Vasco","Corinthians","Palmeiras","Santos","São Paulo","Grêmio","Internacional","Juventude","Náutico","Santa Cruz","Sport"};


//        Solicita a informação
        equipeObj = JOptionPane.showInputDialog(null,
                "Selecione o nome da equipe:",
                "",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                "Atlético");
        String equipe = String.valueOf(equipeObj);


//        Cria as condições e define o resultado
        switch (equipe){
            case "Atlético","América","Cruzeiro","Villa Nova" ->
                estado = "Minas Gerais";
            case "Botafogo","Flamengo","Fluminense","Vasco" ->
                estado = "Rio de Janeiro";
            case "Corinthians","Palmeiras","Santos","São Paulo" ->
                estado = "São Paulo";
            case "Grêmio","Internacional","Juventude" ->
                estado = "Rio Grande do Sul";
            case "Náutico","Santa Cruz","Sport" ->
                estado = "Pernambuco";
        }

//        Printa o Resultado
        JOptionPane.showMessageDialog(null,
                "A equipe "+equipe+" pertence ao estado "+estado,
                "",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
