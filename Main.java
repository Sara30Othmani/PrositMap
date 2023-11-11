public class Main {
    public static void main(String[] args){
        Employe emp1 = new Employe (12371403, "EMP001", "Othmani", "Sara");
        Employe emp2 = new Employe (12345678, "EMP002", "Ghalleb", "Siwar");

        System.out.println(emp1);
        System.out.println(emp2);

        Departement departement1 = new Departement(1, "Data");
        Departement departement2 = new Departement(2, "RH");

        System.out.println(departement1);
        System.out.println(departement2);


    }
}