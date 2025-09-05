package Etapa1;
import javax.swing.JOptionPane;
public class C05EX05 {

    //Autor : Luiz Felipe Schuvarz Eleutério

    public static void main(String[] args) {

//        cria as variáveis
        String celsiusStr;
        double fahrenheit, kelvin;

//        solicita e transforma a temperatura string em double
        celsiusStr = JOptionPane.showInputDialog(null,
                "Insira a temperatura em celcius:",
                "Cº",
                JOptionPane.QUESTION_MESSAGE);
        double celsius = Double.valueOf(celsiusStr);

//        transforma celsius em kelvin
        kelvin = celsius + 273.0;

//        transforma celsius em fahrenheit
        fahrenheit = (9.0 * celsius + 160)/ 5.0;

//        printa o resultado
        JOptionPane.showMessageDialog(null,
                "O valor de "+celsius+"ºC em farenheit é "+fahrenheit+"ºF\nO valor de "+celsius+"ºC em kelvin é "+kelvin+"ºK",
                "Conversão",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
