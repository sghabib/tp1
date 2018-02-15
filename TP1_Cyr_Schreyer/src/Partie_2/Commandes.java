//Programmation: Nathan Cyr et Michel Schreyer
package Partie_2;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Commandes {

	private static final String fichier = "listeCommandes.txt";
	public static String[][] tabFactures;

	public static void main(String[] args) {

		BufferedReader BufferFic = null;
		FileReader LectureFic = null;
		String tabClients[] = null;
		String tabPlats[][] = null;
		String tabCommandes[][] = null;

		try {

			LectureFic = new FileReader(fichier);
			BufferFic = new BufferedReader(LectureFic);

			String sCurrentLine;

			ArrayList<String> liste = new ArrayList<>();
			while ((sCurrentLine = BufferFic.readLine()) != null) {
				liste.add(sCurrentLine);

			}
			String[] arr = new String[liste.size()];
			arr = liste.toArray(arr);
			for (String s : arr)
				System.out.println(s);

		} catch (IOException e) {

			System.out.println("Fichier inexistant");

		} finally {

			try {

				if (BufferFic != null)
					BufferFic.close();

				if (LectureFic != null)
					LectureFic.close();

			} catch (IOException ex) {

				System.out.println("Fichier inexistant");
			}
		}

	}
}
