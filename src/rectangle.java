import java.util.Scanner;

public class Rectangle {

    int a,b;

    int surface(){
        return a*b;
    }

    public static void main(String []args){

        Rectangle rec = new Rectangle();
        Scanner in = new Scanner(System.in);

        System.out.println("Donnez la largeur du rectangle : ");
        int largeur = in.nextInt();

        System.out.println("Donner la longueur du rectangle : ");
        int longueur = in.nextInt();

        rec.a=largeur;
        rec.b=longueur;
        int surf = rec.surface();

        System.out.println("la surface du rectangle est : "+ surf);

    }
}






