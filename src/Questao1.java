import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args){
    Scanner num = new Scanner(System.in);

    System.out.print("Digite o primeiro número: ");
    int num1 = num.nextInt();

    System.out.print("Digite o segundo número: ");
    int num2 = num.nextInt();
        if (num1 > num2) {
            System.out.printf("O maior número entre %d e %d é: " + num1, num1, num2);
        } else if (num2 > num1) {
            System.out.printf("O maior número entre %d e %d é: " + num2, num1, num2);
        } else {
            System.out.print("Esses números são iguais.");
        }
    }
}
