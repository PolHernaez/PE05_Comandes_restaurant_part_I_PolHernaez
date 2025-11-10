import java.util.InputMismatchException;
import java.util.Scanner;
public class PE05 {
    Scanner entrada = new Scanner(System.in);
    boolean menuA = true;
    String linea = "";
     String nomProducte = "";
     String nomClient = "";
     int numeroTicket = 1;
double preuUnitari = 0;
int quantitat = 0;
String resposta = "";
    public static void main(String[] args) {
        PE05 p = new PE05();
        p.principal();
        
    }  
    public void principal() {
    
        System.out.println("BENVINGUT");
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
                    
                    System.out.print("Introdueix el nom del client: ");
                    try {
                    nomClient = entrada.nextLine();
                    }
                    catch (InputMismatchException e) {
                        System.out.println("Error: Si us plau, introdueix un nom vàlid.");}
                    catch (Exception e) {
                        System.out.println("Error inesperat");    
                    }
                    do {
                    novaComanda();
                    guardarComanda();
                    } while (menuA);
                    break;
                    
                case "c":
                Ticketinfo();
                System.out.println(linea);
                    break;
                case "b":
                
                break;
                
            }
        } while (mainMenu);

    }
    public void novaComanda() {


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
boolean siNoCorrecte = false;
entrada.nextLine();
do {
    
System.out.print("Vols afegir un altre producte? (si/no): ");
try {
    resposta = entrada.nextLine();
} 
catch (Exception e) {
    System.out.println("Error inesperat");
}


if (resposta.equalsIgnoreCase("no")) {
    menuA = false;
    siNoCorrecte = true;
} else if (resposta.equalsIgnoreCase("si")) {
    menuA = true;
    siNoCorrecte = true;
}
else {
    System.out.println("Resposta no vàlida. ");
    }   
} while (!siNoCorrecte);

}
public void guardarComanda() {
    
    linea =linea + "\n" +numeroTicket+ "\t"+nomClient+ "\t"+ nomProducte + "\t" + preuUnitari + "€ \t" + quantitat + "\n";
    numeroTicket++;

   }
public void Ticketinfo() {
    System.out.println("TICKET");
    System.out.println("------------------------------------------------------");
    System.out.println("NUM\tCLIENT\tPRODUCTE\tPREU UNITARI\tQUANTITAT");

}}