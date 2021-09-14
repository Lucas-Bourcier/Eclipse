package Client;

public class Produit {
    private String ref;
    private static float pu;

    public Produit(String ref, float pu) {
	this.setRef(ref);
	this.setPu(pu);
    }

    public String getRef() {
	return ref;
    }

    public void setRef(String ref) {
	this.ref = ref;
    }

    public static float getPu() {
	return pu;
    }

    public void setPu(float pu) {
	Produit.pu = pu;
    }
}
