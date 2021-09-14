package Client;

public class DetailCommande {
    private Produit produit;
    private static int Qte;

    public DetailCommande(Produit produit, int qte) {
	// TODO Auto-generated constructor stub
    }

    public static int getQte() {
	return Qte;
    }

    public void setQte(int qte) {
	Qte = qte;
    }

    public Produit getProduit() {
	return produit;
    }

    public void setProduit(Produit produit) {
	this.produit = produit;
    }
}