import java.util.Objects;

public class Employe {
    private int cin;
    private String Matricule;
    private String Nom;
    private String Prenom;

    public Employe(){}

    public Employe(int cin, String Matricule, String Nom, String Prenom){
        this.cin = cin;
        this.Matricule = Matricule;
        this.Nom = Nom;
        this.Prenom = Prenom;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public String getMatricule() {
        return Matricule;
    }

    public void setMatricule(String matricule) {
        Matricule = matricule;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "cin=" + cin +
                ", Matricule='" + Matricule + '\'' +
                ", Nom='" + Nom + '\'' +
                ", Prenom='" + Prenom + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return cin == employe.cin && Objects.equals(Matricule, employe.Matricule) && Objects.equals(Nom, employe.Nom) && Objects.equals(Prenom, employe.Prenom);
    }

}
