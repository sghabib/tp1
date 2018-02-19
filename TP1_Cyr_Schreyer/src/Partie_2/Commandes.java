//Programmation: Nathan Cyr et Michel Schreyer
package Partie_2;

public class Commandes {

	private String client;
	private String plat;
	private int qte;

	public Commandes(String client, String plat, int qte) {
		this.client = client;
		this.plat = plat;
		this.qte = qte;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getClient() {
		return client;
	}

	public void setPlat(String plat) {
		this.plat = plat;
	}

	public String getPlat() {
		return plat;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}

	public int getQte() {
		return qte;
	}

}
