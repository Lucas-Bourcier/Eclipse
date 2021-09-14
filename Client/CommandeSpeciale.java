package Client;

import java.sql.Date;

public class CommandeSpeciale extends Commande {
    public CommandeSpeciale(Date date, Produit produit) {
	super(date, produit);
    }

    private float Promo;
    private Client Client;

    public void commandeSpeciale(float Promo) {
	this.setPromo(Promo);
    }

    public float getPromo() {
	return Promo;
    }

    public void setPromo(float promo) {
	Promo = promo;
    }

    public Client getClient() {
	return Client;
    }

    public void setClient(Client client) {
	Client = client;
    }

    public void commandeSpeciale(Client Client, float promo) {

    }

    @Override
    public float getMontant(Produit pu, DetailCommande Qte, float Result) {
	Result = Produit.getPu() * DetailCommande.getQte();
	return Result;
    }
}
