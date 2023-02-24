import java.util.Scanner;


public class TP2 {
    public static void main(String[] args) {
        discriminant();
        parite();
        egaliteStr();
        factorielle();
        countdown();
        tableMultiplication();
        regle();
        initialisationTableau();
    }
    public static void discriminant() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a ?");
        float a = scanner.nextFloat();
        System.out.println("Quelle est la valeur de b ?");
        float b = scanner.nextFloat();
        System.out.println("Quelle est la valeur de c ?");
        float c = scanner.nextFloat();
        float delta = (float) (Math.pow(b, 2) - 4 * a * c);

        if (delta < 0) {

        }else if (delta == 0){
            float x1 = -b / ( 2 * a );
            System.out.println("Ce polynome a une racine double :" + x1);
        }else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a) ;
            double x2 = (-b - Math.sqrt(delta)) / (2 * a) ;
            System.out.println("Ce polynome a deux racines  :" + x1 +" et " + x2);
        }
    }

    public static void parite(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entré un nombre :");
        int a = scanner.nextInt();
        if (a%2 == 0){
            System.out.println("Votre nombre est pair");
        }else {
            System.out.println("Votre nombre est impair");
        }
    }

    public static void egaliteStr(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer la première chaine de caractère : ");
        String chaine1 = sc.next();
        System.out.println("Entrer la deuxième chaine de caractère : ");
        String chaine2 = sc.next();
        boolean test = (chaine1 == chaine2);
        System.out.println("Resultat :" + test);
    }

    public static void factorielle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier positif ou nul :");
        int n = scanner.nextInt();
        while(n<0){
            System.out.println("Veuillez saisir un chiffre >= 0 :");
            int t = scanner.nextInt();
            n = t;
        }
        for (int i = 0; i <= n; i++) {
            int factorielle = 1;
            factorielle *= i;
            System.out.println(n +"!="+ (n + factorielle));
        }
    }
    public static void countdown(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrée un chiffre, nous en ferons un décompte :");
        int x = sc.nextInt();
        int t = x;
        for(int i = 0; i <= x; i++){
            int countdown = t - i;
            System.out.println(countdown);
        }
        System.out.println("BOUM");
    }
    public static void tableMultiplication() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrée un chiffre :");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
    public static void regle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer un nombre strictement positif :");
        int n = sc.nextInt();
        while(n<=0){
            System.out.println("Veuillez saisir un nombre > 0 :");
            int t = sc.nextInt();
            n = t;
        }
        for (int i = 1; i<=n;i++){
            String res = "";
            if ( i==1 ){
                System.out.print("|");
            }
            res += "-";
            System.out.print(res);
            if (i % 10 == 0) {
                System.out.print("|");
            }
        }

    }

    public static void initialisationTableau() {
        int[] tableau = new int[5];
        int max = 0;
        int min = Integer.MAX_VALUE;
        int som = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Saisir un entier :");
            int entier = scanner.nextInt();
            som += entier;
            if (entier > max ){
                max = entier;
            }
            if (entier < min ){
                min = entier;
            }
            tableau[i] = entier;
        }
        System.out.println("Le min du tableau est :" + min + " et le max est " + max);
        System.out.println("La somme des éléments du tableau est :" + som);
    }
}
