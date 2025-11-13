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
double total = 0;
static String comandaGuardada = "";
int espaiTicket =  0;
    public static void main(String[] args) {
        PE05 p = new PE05();
        p.principal();
    }  
    
    public void principal() {
    
        System.out.println("BENVINGUT");
        boolean mainMenu = true;
        boolean A = false;
        do {
            System.out.println("A) Crear nova comanda");
            System.out.println("B) Actualitzar comanda anterior");
            System.out.println("C) Visualitzar últim tiquets");
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
            
            if ((opcio.equalsIgnoreCase("b") || opcio.equalsIgnoreCase("c")) && !A){
                System.out.println("No hi ha cap comanda anterior per actualitzar.");
                continue;
            }
            switch (opcio) {
                case "a":
                    A = true;
                     total = 0;
                    comandaGuardada = "";
                     linea = "";
                     numeroTicket = 1;
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
                    comandaGuardadaM(nomClient, linea, total);
                    break;
                    
                case "c":
                    
                    System.out.println(comandaGuardada);
                    
                    break;
                case "b":
                do {
                    novaComanda();
                    guardarComanda();
                    } while (menuA);
                    comandaGuardadaM(nomClient, linea, total);                
                    break;
                case "d":
                    mainMenu = false;
                
            }
        } while (mainMenu);
        System.out.println("Fins aviat!");
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
    System.out.println("");   
} while (!siNoCorrecte);

}
public void guardarComanda() {
        
        double subtotal = (preuUnitari * quantitat);
        total = total + subtotal;
        
    linea =linea + "\n" +numeroTicket+ "\t"+ nomProducte + igualarTicket(nomProducte) + preuUnitari + "€"+ igualarTicket(preuUnitari+"") + quantitat +igualarTicket(quantitat+"")+ subtotal + "€"+"\n" ;
    numeroTicket++;
   }public void comandaGuardadaM(String nomClient, String linea, double total) {
                        comandaGuardada =comandaGuardada+ "\n" + "TICKET" + "\n" + "Client: "+ nomClient + "\n" + "============================================================================" + "\n" + "NUM\tPRODUCTE            PREU UNITARI        QUANTITAT           SUBTOTAL" + "\n" +  linea + "============================================================================"+ "\n" + "TOTAL SENSE IVA: " + total + "€" +"\n" + "IVA (10%):\t"+(total*0.1)+"€"+"\n"+"TOTAL:\t"+ (total+(total*0.1))+"€"+"\n"+"============================================================================";
    
   }
   public String igualarTicket(String paraula){
    String blanc = "";
   for (int i = paraula.length(); i < 20 ; i++) {
    blanc = blanc + " ";
    }
    return blanc;
   } }