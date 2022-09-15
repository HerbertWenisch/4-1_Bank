/**
 * @author (Herbert Wenisch)
 * @version (14.09.22)
 */

public class Konto {
  double kontostand;
  int kontonummer; 
  int pin;
  
  Konto(int eineNummer, int einePin){
      kontostand = 100;
      kontonummer = eineNummer;
      pin = einePin;
  }

  
  void erhoeheKontostand(double betrag){
      kontostand += betrag;
  }
    
  void zeigeKontostand(int pinEingabe){
      if (pinEingabe == pin) System.out.println("Kontostand: " + kontostand);
      else System.out.println("falsche Pin!");
  }
}
