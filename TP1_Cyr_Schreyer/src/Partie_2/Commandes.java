package Partie_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Commandes {

	private static final String FILENAME = "listeCommandes.txt";

	public static void main(String[] args) {

		BufferedReader BufferFic = null;
		FileReader LectureFic = null;
		String TabClient[] = null;
		String TabPlats[] = null;
		String TabCommandes[] = null;

		try {

			LectureFic = new FileReader(FILENAME);
			BufferFic = new BufferedReader(LectureFic);

			String sCurrentLine;

			while ((sCurrentLine = BufferFic.readLine()) != null) {
				System.out.println(sCurrentLine);
			}

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
		
		for (int i = 0; i < TabCommandes.length; i++) {
			
		}
		
		

	}
}
