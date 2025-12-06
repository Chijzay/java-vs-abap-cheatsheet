## Was dieses ABAP-Programm zeigt:

| Konzept                | Beispiel im Code                                    |
| ---------------------- | --------------------------------------------------- |
| Einstiegspunkt         | `REPORT`, `START-OF-SELECTION`                      |
| Datentypen & Variablen | `TYPE i`, `TYPE string`, `TYPE abap_bool`           |
| Benutzer-Eingabe       | `PARAMETERS`                                        |
| Bedingungen            | `IF`, `ELSE`, `CASE`, `WHEN`                        |
| Schleifen & Arrays     | `LOOP AT`, `APPEND` mit interner Tabelle            |
| Methoden               | `FORM`, später `METHOD` in Klasse                   |
| Klassen & Konstruktor  | `CLASS ... DEFINITION / IMPLEMENTATION`             |
| Objekte & Aufrufe      | `NEW lcl_person(...)`, `->` Methodenaufruf          |
| Ausgabe                | `WRITE`, auch mit `NO-GAP` für kompakte Zahlenzeile |


## Hinweise

- Das Programm läuft direkt in der SAP GUI oder in Eclipse mit ABAP Development Tools, sofern man ein System mit Report-Rechten hat.
- Anders als in Java wird die Benutzereingabe über `PARAMETERS` realisiert (automatisch generierter Eingabebildschirm).
- `FORM` simuliert hier eine freie Funktion. Man kann alternativ auch eine Methode schreiben.
- `START-OF-SELECTION` markiert im klassischen Report den Startpunkt der Verarbeitung (optional, aber sauber).
