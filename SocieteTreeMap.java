import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SocieteTreeMap implements InterfaceSociete {
    private Map<Employe, Set<Departement>> empDepMap;

    public SocieteTreeMap() {
        this.empDepMap = new TreeMap<>();
    }

    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        empDepMap.computeIfAbsent(e, k -> new HashSet<>()).add(d);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        empDepMap.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        for (Map.Entry<Employe, Set<Departement>> entry : empDepMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

    @Override
    public void afficherLesEmployes() {
        for (Employe e : empDepMap.keySet()) {
            System.out.println(e);
        }
    }

    @Override
    public void afficherLesDepartements() {
        Set<Departement> lesDepartements = new HashSet<>();
        for (Set<Departement> departements : empDepMap.values()) {
            lesDepartements.addAll(departements);
        }

        for (Departement d : lesDepartements) {
            System.out.println(d);
        }
    }

    @Override
    public void afficherDepartement(Employe e) {
        Set<Departement> departements = empDepMap.get(e);
        if (departements != null) {
            for (Departement d : departements) {
                System.out.println(e.getNom() + " " + d);
            }
        }
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return empDepMap.containsKey(e);
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        for (Set<Departement> departements : empDepMap.values()) {
            if (departements.contains(d)) {
                return true;
            }
        }
        return false;
    }
}