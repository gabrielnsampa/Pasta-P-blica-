import java.util.Scanner;
public class  Exe6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Digite o ano que voce nasceu: ");
        double nasceu = scanner.nextDouble();
        System.out.print("Digite o ano em que estamos: ");
        double ano = scanner.nextDouble();
        double anos = ano - nasceu;
        if (anos >= 18)
        System.out.println("Pode dirigir e pode votar");
        if (anos >= 16)
        System.out.println("Pode votar");
        if (anos < 16)
        System.out.println("Não pode nada");
    }
}