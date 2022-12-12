package Voiture;

public class Voiture1 {
    public class Voiture {

        //Attribut de l'objet
        private int id;
        private String marque;
        private double vitesse;
        private int puissance;

        public static int count = 0;

        public Voiture(String marque, double vitesse, int puissance) {
            this.id = ++count;
            this.marque = marque;
            this.vitesse = vitesse;
            this.puissance = puissance;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setMarque(String marque) {
            this.marque = marque;
        }

        public void setVitesse(double vitesse) {
            this.vitesse = vitesse;
        }

        public void setPuissance(int puissance) {
            this.puissance = puissance;
        }

        public int getId() {
            return id;
        }

        public String getMarque() {
            return marque;
        }

        public double getVitesse() {
            return vitesse;
        }

        public int getPuissance() {
            return puissance;
        }

        public static int getCount() {
            return count;
        }

        @Override
        public String toString() {
            return "id=" + id + ", marque=" + marque + ", vitesse=" + vitesse
                    + ", puissance=" + puissance;
        }


        public static void main(String[] args) {
            Voiture[] voitures = new Voiture[3];

            voitures[0] = new Voiture("BMW", 220, 8);
            voitures[1] = new Voiture("Ford", 200, 6);
            voitures[2] = new Voiture("Audi", 240, 8);

            for (Voiture v : voitures) {
                System.out.println(v);
            }


            System.out.println("Le nombre des voitures est : " + Voiture.count);

        }


