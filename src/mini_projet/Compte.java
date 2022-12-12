package mini_projet;

 public class Compte {
        int solde = 0;

        void deposer(int montant) {
            solde = solde + montant;
        }

        void retrier(int montant) {
            solde = solde - montant;
        }

        void vireVers(int montant, Compte destination) {
            this.retrier(montant);
            destination.deposer(montant);
        }

        void afficher() {
            System.out.println("solde" + solde);}
    }



















