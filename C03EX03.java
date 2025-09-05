package Etapa1;

import java.util.Scanner;
public class C03EX03 {
  // Função: Calcular a hipotenusa tendo como informação valores de 2 catetos
  // Autor: Luiz Felipe Schuvarz Eleutério
   public static void main(String[] args) {

//     cria as variáveis
     double hipotenusa, cateto1, cateto2;

//     abre o teclado
     Scanner teclado = new Scanner(System.in);

//     atribui às variáveis os valores inseridos
     System.out.print("Informe o valor do cateto 1: ");
      cateto1 = teclado.nextDouble();
     System.out.print("Informe o valor do cateto 1 : ");
      cateto2 = teclado.nextDouble();

//     calcula a hipotenusa
     hipotenusa = Math.pow(Math.pow(cateto1,2)+Math.pow(cateto2,2),1.0/2);

//     printa o sistema
     System.out.print("Hipotenusa = "+hipotenusa);

//     fecha o teclado
     teclado.close();
   }
}