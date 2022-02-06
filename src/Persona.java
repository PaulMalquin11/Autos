public class Persona {

    private String nom, apll;

    public Persona(String nom, String apll) {
        this.nom = nom;
        this.apll = apll;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApll() {
        return apll;
    }

    public void setApll(String apll) {
        this.apll = apll;
    }

    @Override
    public String toString() {
        return "%s %s".formatted(nom,apll);
    }
}
