/**
 * @author (Herbert Wenisch)
 * @version (14.09.22)
 */

public class Konto {
  double kontostand;
  
  Konto(){
      kontostand = 100;
  }

  
  void erhoeheKontostand(double betrag){
      kontostand += betrag;
  }
    
}
