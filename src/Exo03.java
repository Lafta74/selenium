import java.util.Scanner;

public class Exo03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrer le premier nombre:");
        int nbr1 = sc.nextInt();

        System.out.print("Entrer le deuxième nombre:");
        int nbr2 = sc.nextInt();

        System.out.println(nbr1 + " x " + nbr2 + " = " + nbr1 * nbr2);
    }

}