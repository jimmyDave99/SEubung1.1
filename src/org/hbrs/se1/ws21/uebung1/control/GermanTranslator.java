package org.hbrs.se1.ws21.uebung1.control;

public class GermanTranslator implements Translator {

	public String date = "Okt/2021"; // Default-Wert

	/**
	 * Methode zur Übersetzung einer Zahl in eine String-Repraesentation
	 */
	public String translateNumber( int number ) {
		// [ihr Source Code aus Übung 1-2]
		try {
			String[] zahlen = {"Eins", "Zwei", "Drei", "Vier", "Funf", "Sechs", "Sieben", "Acht", "Neun", "Zehn"};

			return zahlen[number - 1];
		}
		catch (Exception e){
			return "Übersetzung der Zahl "+number+" nicht\n" +
					"möglich ("+Translator.version+")";
		}
	}
		
	/**
	 * Objektmethode der Klasse GermanTranslator zur Ausgabe einer Info.
	 */
	public void printInfo(){
		System.out.println( "GermanTranslator v1.9, erzeugt am " + this.date );
	}

	/**
	 * Setzen des Datums, wann der Uebersetzer erzeugt wurde (Format: Monat/Jahr (Beispiel: Okt/2021))
	 * Das Datum sollte system-intern gesetzt werden und nicht von externen View-Klassen
	 */
	public void setDate( String date ) {
		this.date = date;
	}

}
