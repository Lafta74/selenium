import java.util.Scanner;

public class Student {
        String nom;
        int note1;
        int note2;

        Student(String nom, int note1, int note2){
            this.nom = nom;
            this.note1 = note1;
            this.note2 = note2;
        }

        int calc_moy(){
            return (note1 + note2)/2;
        }

        void show(){
            System.out.println("Étudiant: "+ nom +" \n moyenne: "+ calc_moy());
        }

        public static void main(String []args){


            Scanner in = new Scanner(System.in);

            System.out.println("Entrez votre nom : ");
            String nom = in.nextLine();

            System.out.println("Entrer la premiere note : ");
            int note1 = in.nextInt();

            System.out.println("Entrer la deuxieme note : ");
            int note2 = in.nextInt();

            heritage.Student etud;
            etud = new heritage.Student(nom, note1, note2);

            etud.show();

        }
    }

