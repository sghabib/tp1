package Partie_2;

public class Plats {
	private double prixCommande;
	private String clientCommande;

	public Plats(double prixCommande, String clientCommande) {
		this.prixCommande = prixCommande;
		this.clientCommande = clientCommande;
	}

	public double getPrixCommande() {
		return prixCommande;
	}

	public void setPrixCommande(double prixCommande) {
		this.prixCommande = prixCommande;
	}

	public String getClientCommande() {
		return clientCommande;
	}

	public void setClientCommande(String clientCommande) {
		this.clientCommande = clientCommande;
	}

}
