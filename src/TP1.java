import java.util.Scanner;

public class TP1 {
    public static void main(String[] args){
        Ex1();
        somme();
        division();
        volume();
    }

    public static void Ex1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer le premier entier :");
        int unEntier = scanner.nextInt();
        System.out.println("Entrer le deuxième entier :");
        float unReel = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("J’ai recupere un entier: " + unEntier);
        System.out.println("J’ai aussi recupere un reel: " + unReel);
        System.out.println("Bonjour, quelle est votre prenom ?");
        String prenom = scanner.nextLine();
        System.out.println("Bonjour," + prenom);
    }

    public static void somme() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier de la somme :");
        int premierEntier = sc.nextInt();
        System.out.println("Veuillez saisir le deuxieme entier de la somme :");
        int deuxiemeEntier = sc.nextInt();
        int somme = premierEntier + deuxiemeEntier;
        System.out.println("La somme de " + premierEntier + " avec " + deuxiemeEntier +
                " est egale a " + somme);
    }

    public static void division() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier de la division :");
        double premierEntier = sc.nextDouble();
        System.out.println("Veuillez saisir le deuxieme entier de la division :");
        double deuxiemeEntier = sc.nextDouble();
        double div = premierEntier / deuxiemeEntier;
        System.out.println("La division de " + premierEntier + " avec " + deuxiemeEntier +
                " est egale a " + div);
    }

    public static void volume() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir la longueur :");
        double logeur = sc.nextDouble();
        System.out.println("Veuillez saisir la largeur :");
        double lageur = sc.nextDouble();
        System.out.println("Veuillez saisir la hauteur :");
        double haut = sc.nextDouble();
        double volume = logeur * lageur * haut;
        System.out.println("Le volume est de " + volume);
    }

}