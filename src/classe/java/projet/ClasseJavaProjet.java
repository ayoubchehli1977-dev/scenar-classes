/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classe.java.projet;

/**
 *
 * @author Houda
 */
public class ClasseJavaProjet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Pneu p1 = new Pneu(205, 55, 16, "Ete");
Voiture v1 = new Voiture("Peugeot", "208", 2021, 14500.0, p1);
Voiture v2 = new Voiture("Toyota", "Yaris", 2015, 9800.0, p1); 
Voiture v3 = new Voiture("Renault", "clio", 2000, 3500.0, p1); 
   
   System.out.println("Voiture 1 : " + v1.marque + " " + v1.modele + " " + v1.annee + " "+v1.prix + " " + v1.pneu.type);
   System.out.println("Voiture 1 : " + v2.marque + " " + v2.modele + " " + v2.annee + " "+v2.prix + " "+  v2.pneu.type);
   System.out.println("Voiture 2 : " + v3.marque + " " + v3.modele + " " + v3.annee + " "+v3.prix + " " + v3.pneu.type);
   
   
   
   
   
   
    
   
   
   
   
  

    }
}
    
    

