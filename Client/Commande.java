package Client;

import java.sql.Date;
import java.util.List;

public class Commande {

    private Date date;
    private List<DetailCommande> details;

    public Commande(Date date, Produit produit) {
	this.setDate(date);
    }

    public Date getDate() {
	return date;
    }

    public void setDate(Date date) {
	this.date = date;
    }

    public void addproduit(Produit produit, int qte) { // ajoutez les produits a la liste de commande.
	details.add(new DetailCommande(produit, qte)); // Liste de detail qui possède les produits & la QTE
    }

    public float getMontant(Produit pu, DetailCommande Qte, float Result) {
	Result = Produit.getPu() * DetailCommande.getQte();
	return Result;
    }
}