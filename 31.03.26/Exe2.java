import java.util.Scanner;
public class  Exe2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Digite a idade do nadador: ");
        double numero = scanner.nextDouble();
        if (numero >= 18)
        System.out.println("Categoria Adulta");
        else
        System.out.println("Categoria Infantil");
    }
}