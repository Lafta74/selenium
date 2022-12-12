import java.util.Scanner;

public class Somme {

    int n1;
    int n2;


    Somme(int n1, int  n2){
        this.n1 = n1;
        this.n2 = n2;
    }



    int sum(){
        int s=n1+n2;
        return s;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Saisir le premier nombre : ");
        int nb1 = sc.nextInt();

        System.out.println("Saisir le deuxieme nombre : ");
        int nb2 = sc.nextInt();

        Somme obj = new Somme(nb1, nb2);

        int res = obj.sum();

        System.out.println("La somme est : "+ res);



    }
}

