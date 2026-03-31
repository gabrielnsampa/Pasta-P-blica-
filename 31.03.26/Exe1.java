import java.util.Scanner;
public class  Exe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Digite um numero: ");
        double numero = scanner.nextDouble();
        if (numero >= 0)
        System.out.println("Numero positivo");
        else
        System.out.println("Numero negativo");
    }
}