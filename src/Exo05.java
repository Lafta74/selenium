
import java.util.Scanner;

public class Exo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrer le premier nombre:");
        int nbr1 = sc.nextInt();

        System.out.print("Entrer le deuxième nombre: ");
        int nbr2 = sc.nextInt();

        System.out.print("Entrer le troisième nombre: ");
        int nbr3 = sc.nextInt();

        System.out.println("La moyenne est: "+(nbr1 + nbr2 + nbr3) / 3);
    }
}