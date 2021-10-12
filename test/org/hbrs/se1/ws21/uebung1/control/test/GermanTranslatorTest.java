package org.hbrs.se1.ws21.uebung1.control.test;

import org.hbrs.se1.ws21.uebung1.control.GermanTranslator;
import org.hbrs.se1.ws21.uebung1.control.Translator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GermanTranslatorTest {

    //@org.junit.jupiter.api.Test
    @Test
    void translateNumber() {
        GermanTranslator germanTranslator= new GermanTranslator();
        assertEquals("Eins",germanTranslator.translateNumber(1)); //ÄK_1:[1,10]
        assertEquals("Übersetzung der Zahl "+15+" nicht\n" +
                "möglich ("+ Translator.version+")",germanTranslator.translateNumber(15)); //ÄK_2:>10
        assertEquals("Übersetzung der Zahl "+-1+" nicht\n" +
                "möglich ("+ Translator.version+")",germanTranslator.translateNumber(-1)); //ÄK_2:<0
        assertEquals("Übersetzung der Zahl "+0+" nicht\n" +
                "möglich ("+ Translator.version+")",germanTranslator.translateNumber(0)); //ÄK_2:=0

    }
}