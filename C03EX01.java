package Etapa1;
import java.util.Scanner;
public class C03EX01 {
    // Função : Calcular Fatorial de um Número
    // Nome   : Luiz Felipe Schuvarz Eleutério
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("informe um número");

        long numero = teclado.nextLong();

        long fatorial = 1L;
        for(long contador = 2; contador <= numero; contador++) {
            fatorial = fatorial * contador;

        }
        System.out.println("Fatorial = " + fatorial);

        teclado.close();
    }
}
