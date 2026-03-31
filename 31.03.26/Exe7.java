import java.util.Scanner;
public class  Exe7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Digite o primeiro lado: ");
        double lado1 = scanner.nextDouble();
         System.out.print("Digite o segundo lado: ");
        double lado2 = scanner.nextDouble();
        System.out.print("Digite o terceiro lado: ");
        double lado3 = scanner.nextDouble();
        
        if ( lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1)
        System.out.println("Pode formar um triângulo");
        else
        System.out.println("Não pode formar um triângulo");
     }
}