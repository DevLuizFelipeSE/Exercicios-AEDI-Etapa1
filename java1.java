import java.util.Scanner;

public class java1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Double raio, area, volume;

        System.out.print("Digite o raio do círculo: ");
        raio = teclado.nextDouble();

        area = (3.14*(raio*raio));;
        volume = (4.0*3.14*(raio*raio*raio))/3.0;

        System.out.println("A área do círculo é: "+area);
        System.out.println("O volume da esfera é: "+volume);

        teclado.close();

    }
}
