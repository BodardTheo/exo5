package fr.dampierre;
 
import java.util.Random;
import java.util.Scanner;

public class DevinezLeNombre {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Générer un nombre aléatoire entre 1 et 100
        int nombreADeviner = random.nextInt(100) + 1;

        System.out.println("Je pense à un nombre entre 1 et 100 inclus. Devinez lequel.");
        System.out.print("Entrez un nombre : ");
        
        // Lire la proposition du joueur
        int proposition = scanner.nextInt();
        System.out.println("Vous proposez : " + proposition);
        System.out.println("Le nombre auquel je pensais était : " + nombreADeviner);
       
    
        // Calculer la différence
         int difference = Math.abs(nombreADeviner - proposition);
         System.out.println("Vous étiez à " + difference + " de la bonne réponse.");
 
         // Fermer le scanner
         scanner.close();
     }
 }