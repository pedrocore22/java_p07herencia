package rrhh;

public class Main {
    public static void main(String[] args) {
        SalesDirector directorCC = new SalesDirector("Juan", "Pérez", "Cáceres", "Electronica", "PCs");
        System.out.println(directorCC.getName());
        // Aunque no fuera común podemos usar
        // la superclase Employee
        Employee empleado = new Employee("Lucía", "Gómez", "Badajoz");
        System.out.println(empleado.getSurname());
    }
}

