package org.hbrs.se1.ws21.uebung1.view;

import org.hbrs.se1.ws21.uebung1.control.Factory.TranslateFactory;
import org.hbrs.se1.ws21.uebung1.control.Translator;

public class Client {

	/*
	 * Methode zur Ausgabe einer Zahl auf der Console
	 */
	public void display( int aNumber ){
		// In dieser Methode soll die Methode translateNumber 
		// mit dem übergegebenen Wert der Variable aNumber 
		// aufgerufen werden.
		//
		// Strenge Implementierung gegen das Interface Translator gewuenscht!

		// Verwendung Design Patter: Factory Method
		//Problem: Inkonsistente Objekt-Erzeugung
		// Lösung / Vorteil: Konsistente und zentrale Stelle zur Objekterzeugung

		Translator translator = TranslateFactory.createGermanTranslator();
		String result = translator.translateNumber(aNumber);
		System.out.println("Das Ergebnis der Berechnung: " +
				"[das Ergebnis an dieser Stelle]" + result );

	}
}




