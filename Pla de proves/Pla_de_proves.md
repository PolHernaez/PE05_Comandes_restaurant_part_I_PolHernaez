# Pla de proves unitàries - PE05 
/*Fet amb chat GPT*/
| Id | Prova (descripció) | Valor entrada | Valor sortida | Resultat esperat | Estat de la prova |
|----|-------------------|---------------|---------------|-----------------|-----------------|
| 1  | Crear comanda amb un producte correcte | Nom client: Pol, Producte: Hernaez, Preu: 1.0, Quantitat: 3 | Tiquet generat amb subtotal 3.0€ | Total correcte 3.0€, IVA 0.3€, Total final 3.3€ | OK |
| 2  | Crear comanda amb diversos productes | Producte1: Poma 1€, 2u; Producte2: Llet 0.9€, 3u | Tiquet amb tots els productes i subtotals | Subtotals i total correctes | OK |
| 3  | Introduir preu unitari no numèric | Preu: "abc" | Error missatge | Missatge: "Error: Si us plau, introdueix un número vàlid per al preu." | OK |
| 4  | Introduir quantitat no numèrica | Quantitat: "x" | Error missatge | Missatge: "Error: Si us plau, introdueix un número enter vàlid per a la quantitat." | OK |
| 5  | Vols afegir un altre producte: resposta no vàlida | Resposta: "potser" | Error missatge | Missatge: "Resposta no vàlida." | OK |
| 6  | Actualitzar comanda anterior | Ja hi ha una comanda, afegir Producte3: Pa, 2€, 5u | Tiquet actualitzat amb el nou producte | Total i IVA actualitzats correctament | OK |
| 7  | Visualitzar últim tiquet sense comandes prèvies | Cap comanda creada | Missatge error | "No hi ha cap comanda anterior per actualitzar." | OK |
| 8  | Crear comanda amb preu decimal | Producte: Sucre, Preu: 1.25, Quantitat: 4 | Subtotal 5.0€ | Total i IVA correctes | OK |
| 9  | Crear comanda amb producte amb nom llarg | Nom client: Anna, Producte: "Xocolata amb llet 200g", Preu: 2.5, Quantitat: 2 | Tiquet alineat correctament | Columnes correctament alineades | OK |
| 10 | Sortir del menú principal | Opressió "d" | Programa finalitza | Missatge: "Fins aviat!" | OK |
