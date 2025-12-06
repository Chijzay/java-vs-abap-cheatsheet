import java.util.ArrayList;   // dynamische Liste (wie List in vielen Fällen)
import java.util.List;
import java.util.Scanner;

public class GrundlagenDemo {

    // Konstanten: final = nicht veränderbar
    private static final int PERSON_STANDARDALTER = 25;

    // Einstiegspunkt des Programms
    public static void main(String[] args) {

        System.out.println("Willkommen zur Java-Grundlagendemo!");

        // Primitive Datentypen + Referenztypen (String ist ein Objekt)
        int zahl = 5;                  // ganze Zahl
        double preis = 19.99;          // Kommazahl
        boolean istAktiv = true;       // true/false
        char buchstabe = 'A';          // einzelnes Zeichen
        String name = "unbekannt";     // Referenztyp (Objekt)

        // String-Verkettung mit +
        System.out.println("Name: " + name + ", Preis: " + preis);

        // Scanner liest von der Konsole
        try (Scanner scanner = new Scanner(System.in)) { // try-with-resources: schließt automatisch

            System.out.print("Gib eine Zahl ein: ");
            int eingabe = scanner.nextInt(); // kann Exception werfen, wenn keine Zahl

            System.out.print("Gib deinen Namen ein: ");
            name = scanner.next(); // liest ein Wort (für ganze Zeile: nextLine())

            // if/else: Bedingungen
            if (eingabe > 10) {
                System.out.println("Die Zahl ist größer als 10.");
            } else {
                System.out.println("Die Zahl ist kleiner oder gleich 10.");
            }

            // Arrays: feste Größe
            int[] zahlen = {1, 2, 3, 4, 5};
            System.out.print("Array: ");
            for (int z : zahlen) { // foreach über Array
                System.out.print(z + " ");
            }
            System.out.println();

            // while-Schleife: läuft, solange Bedingung gilt
            int i = 0;
            while (i < 3) {
                System.out.println("while-Zähler: " + i);
                i++;
            }

            // switch: Auswahl (hier modernes switch mit ->)
            switch (eingabe) {
                case 1 -> System.out.println("Du hast Eins eingegeben.");
                case 2 -> System.out.println("Du hast Zwei eingegeben.");
                default -> System.out.println("Eine andere Zahl wurde eingegeben.");
            }

            // Methodenaufruf (static): gehört zur Klasse, kein Objekt nötig
            int summe = berechneSumme(zahl, eingabe);
            System.out.println("Summe von " + zahl + " + " + eingabe + " = " + summe);

            // Ternary Operator: kurze if-else Form
            String aktivText = istAktiv ? "aktiv" : "inaktiv";
            System.out.println("Status: " + aktivText + ", Buchstabe: " + buchstabe);

            // List (ArrayList): dynamisch erweiterbar
            List<String> namen = new ArrayList<>();
            namen.add(name);
            namen.add("Anna");
            namen.add("Ben");
            System.out.println("Liste: " + namen);

            // String vergleichen: NIE mit ==, sondern equals()
            if ("unbekannt".equals(name)) {
                System.out.println("Name ist noch unbekannt.");
            } else {
                System.out.println("Name ist gesetzt.");
            }

            // Objektorientierung: Objekt erstellen und Methoden aufrufen
            Person person = new Person(name, PERSON_STANDARDALTER);
            person.begruesse();                 // Instanzmethode
            person.hatGeburtstag();             // Zustand ändern
            System.out.println(person);         // toString() wird genutzt

            // null-Grundlage: vermeiden, aber prüfen können
            Person maybeNull = null;
            if (maybeNull == null) {
                System.out.println("maybeNull ist null (kein Objekt).");
            }

        } catch (Exception e) { // einfache Fehlerbehandlung
            System.out.println("Eingabefehler: Bitte gültige Werte eingeben.");
        }

        System.out.println("Programm beendet.");
    }

    // Methode mit Parametern und Rückgabewert
    public static int berechneSumme(int a, int b) {
        return a + b;
    }
}

// Eigene Klasse: Kapselung über private Felder
class Person {
    private String name;
    private int alter;

    // Konstruktor: wird beim new-Aufruf ausgeführt
    public Person(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    // Getter/Setter Basics (Kapselung)
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public void begruesse() {
        System.out.println("Hallo, ich bin " + name + " und " + alter + " Jahre alt.");
    }

    // Instanzmethode: verändert den Zustand des Objekts
    public void hatGeburtstag() {
        alter++;
    }

    // toString: sinnvolle Textdarstellung eines Objekts
    @Override
    public String toString() {
        return "Person{name='" + name + "', alter=" + alter + "}";
    }
}
