import java.util.InputMismatchException;
import java.util.Scanner;
public class PE05 {
    Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        PE05 p = new PE05();
        p.principal();
        
    }  
    public void principal() {
    
        System.out.println("BENBINGUT");
        boolean mainMenu = true;
        do {
            System.out.println("A) Crear nova comanda");
            System.out.println("B) Actualitzar comanda anterior");
            System.out.println("C) Visualitzar últim tiquet");
            System.out.println("D) Sortir");
            System.out.println("(a/b/c/d)");
            String opcio = "";
            try {
                opcio = entrada.nextLine();
            }
            catch (InputMismatchException e) {
                System.out.println("Error: Si us plau, introdueix una opció vàlida.");}
            catch (Exception e) {
                System.out.println("Error inesperat");
            }
            switch (opcio) {
                case "a":
                    boolean menuA = true;
                    System.out.print("Introdueix el nom del client: ");
                    try {
                    String nomClient = entrada.nextLine();
                    }
                    catch (InputMismatchException e) {
                        System.out.println("Error: Si us plau, introdueix un nom vàlid.");}
                    catch (Exception e) {
                        System.out.println("Error inesperat");    
                    }
                    do {
                    novaComanda();
                    } while (menuA);
                    break;
                    
            
                
            }
        } while (mainMenu);

    }
    public void novaComanda() {
 String nomProducte = "";
double preuUnitari = 0;
int quantitat = 0;
String resposta = "";

System.out.print("Introdueix el producte: ");   
try {
    nomProducte = entrada.nextLine();
} 
catch (InputMismatchException e) {
    System.out.println("Error: Si us plau, introdueix un nom vàlid.");
    entrada.nextLine(); 
} 
catch (Exception e) {
    System.out.println("Error inesperat");    
}

// Demanar preu unitari
boolean tryCorrecte = false;
do {
    tryCorrecte = false;
System.out.print("Introdueix el preu unitari (€): ");   
try {
    preuUnitari = entrada.nextDouble();
} 
catch (InputMismatchException e) {
    System.out.println("Error: Si us plau, introdueix un número vàlid per al preu.");
    entrada.nextLine(); 
    tryCorrecte = true;
} 
catch (Exception e) {
    System.out.println("Error inesperat");
    tryCorrecte = true;
}    
} while (tryCorrecte);


do {
    tryCorrecte=false;
System.out.print("Introdueix la quantitat: ");   
try {
    quantitat = entrada.nextInt();
} 
catch (InputMismatchException e) {
    System.out.println("Error: Si us plau, introdueix un número enter vàlid per a la quantitat.");
    entrada.nextLine();
    tryCorrecte = true;
} 
catch (Exception e) {
    System.out.println("Error inesperat");
    tryCorrecte = true;
}   
} while (tryCorrecte);


System.out.print("Vols afegir un altre producte? (sí/no): ");
try {
    resposta = entrada.nextLine();
} 
catch (Exception e) {
    System.out.println("Error inesperat");
}
}
}
