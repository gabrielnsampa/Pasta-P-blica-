import java.util.Scanner;
public class  Exe5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Digite um numero: ");
        double numero = scanner.nextDouble();
        if (numero % 5.0 == 0 && numero % 3.0 == 0)
        System.out.println("É multiplo de 5 e 3 ");
        else
        System.out.println("Não é multiplo de 5 e 3");
    }
}