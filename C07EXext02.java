package Etapa1;
import javax.swing.JOptionPane;
public class C07EXext02 {

//    Aluno = Luiz Felipe Schuvarz Eleutério

    public static void main(String[] args) {

//        Cria as variáveis e listas
        String quantidadeStr, descontoStr, cartao, tipoCarneStr;
        int tipoCarne;
        double preco,precoCarne, desconto;
        String[] botoes = {"Filé Duplo", "Alcatra", "Picanha"};
        String[] tipoCartao = {"Tabajara", "Outro"};


//        Solicita as informações para preencher as variáveis
        tipoCarne = JOptionPane.showOptionDialog(null,
                "Qual o tipo da carne?",
                "",
                0,
                JOptionPane.QUESTION_MESSAGE,
                null,
                botoes,
                "Filé Duplo");

        quantidadeStr = JOptionPane.showInputDialog(null,
                "Insira a quantidade de carne (Kg):",
                "",
                JOptionPane.QUESTION_MESSAGE);
        double quantidade = Double.valueOf(quantidadeStr);

        cartao = JOptionPane.showInputDialog(null,
                "Qual cartão irá usar para realizar o pagamento?",
                "",
                JOptionPane.QUESTION_MESSAGE);


//        Cria as condicionais do preço da carne
        if (tipoCarne == 0){
            tipoCarneStr = "Filé Duplo";
            if (quantidade <= 5){
                precoCarne = 4.9;
            } else {
                precoCarne = 5.8;
            }
        } else if (tipoCarne == 1) {
            tipoCarneStr = "Alcatra";
            if (quantidade <= 5){
                precoCarne = 5.9;
            } else {
                precoCarne = 6.8;
            }
        } else {
            tipoCarneStr = "Picanha";
            if (quantidade <= 5){
                precoCarne = 6.9;
            } else {
                precoCarne = 7.8;
            }
        }


//        Cria as condicionais do desconto
        if (cartao.equalsIgnoreCase("Tabajara")){
            desconto = (quantidade * precoCarne) * 0.05;
        } else {
            descontoStr = "Sem desconto";
            desconto = 0;
        }


//        calcula o preço total
        preco = quantidade * precoCarne - ((quantidade * precoCarne) * desconto);


//        Imprime os resultados
        JOptionPane.showMessageDialog(null,
                "Tipo da carne: "+tipoCarneStr+"\n\nQuantidade de carne: "+quantidade+" Kg\n\nDesconto: R$"+String.format("%1.2f", desconto)+"\n\nPreço Total: R$"+String.format("%1.2f", preco)+"\n\nTipo de Cartão: "+cartao,
                "CUPOM FISCAL",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
