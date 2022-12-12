import java.util.Scanner;

    public class Somme{



        public static void main(String[] args) {
            int n = 5;
            int i;
            float somme = 0;
            int tab[] = new int[n];
            Scanner x = new Scanner(System.in);

            System.out.println("Donnez les valeurs à saisir dans le tableau : ");


            for (i = 0; i < n; i++) {
                System.out.println("Saisissez la valeur num "+(i+1)+" : ");
                tab[i] = x.nextInt();
            }
            for (i = 0; i < n; i++) {
                somme = somme + tab[i];
            }
            System.out.println("La somme est : " + somme);

        }

    }


