package prg.vereinverwaltung;

import prg.vereinverwaltung.business.api.Verwaltung;
import prg.vereinverwaltung.ui.UI;
import prg.vereinverwaltung.ui.dummi.VerwaltungDummy;


public class VereinVerwaltungApp {

	public static void main(String[] args) {

		/* ENTWEDER: Plaintext-Persister instantiieren */
		// Persister persister = new
		// prg.vereinverwaltung.persister.impl.plaintext.PersisterImpl();

		/* ODER: Serialiser-Persister instantiieren */
		// Persister persister = new
		// prg.vereinverwaltung.persister.impl.ser.PersisterImpl();

		/* Verwaltung-Komponente instantiieren */
		// Verwaltung verwaltung = new VerwaltungImpl(persister);

		/*
		 * Bis die finale Verwaltung-Implementierung zur Verfügung steht, wird mit
		 * VerwaltungDummy-Klasse gearbeitet
		 */
		Verwaltung verwaltung = new VerwaltungDummy();

		/* UI-Komponente instantieeren */
		UI ui = new UI(verwaltung);

		/* Ausführung starten */
		ui.execute();

		System.out.println("\nDie Programmausführung wird beendet.\n");

	}
}
