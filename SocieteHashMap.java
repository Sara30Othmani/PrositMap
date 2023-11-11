import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SocieteHashMap implements InterfaceSociete{

    private Map<Employe, Set<Departement>> EmpdepMap;

    public SocieteHashMap() {
        this.EmpdepMap = new HashMap<>();
    }
    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        EmpdepMap.put(e,d);
    }
    @Override
    public void supprimerEmploye(Employe e) {
        EmpdepMap.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        for (Map.Entry<Employe, Set<Departement>> entry : EmpdepMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

    @Override
    public void afficherLesEmployes() {
        for (Employe e : EmpdepMap.keySet()) {
            System.out.println(e);
        }
    }

    @Override
    public void afficherLesDepartements() {
        Set<Departement> LesDepartements = new HashSet<>();
        for (Set<Departement> departements : EmpdepMap.values()) {
            LesDepartements.addAll(departements);
        }

        for (Departement d : LesDepartements) {
            System.out.println(d);
        }
    }

    @Override
    public void afficherDepartement(Employe e) {
        Set<Departement> departements = EmpdepMap.get(e);
        if (departements != null) {
            for (Departement d : departements) {
                System.out.println(e.getNom() + " " + d);
            }
        }
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return EmpdepMap.containsKey(e);
    }

    @Override
    public boolean rechercherDepartement(Departement e) {
        for (Set<Departement> departements : EmpdepMap.values()) {
            if (departements.contains(d)) {
                return true;
            }
        }
        return false;
    }
}
