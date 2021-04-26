package main;

class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Rofiq");
        employee.sayHello("Budi");

        employee = new Manager("Axel", " Gojek");
        employee.sayHello("Budi");

        employee = new VicePresident("Rizky");
        employee.sayHello("Budi");

        sayHello(new Employee("Rofiq"));
        sayHello(new Manager("Axel"));
        sayHello(new VicePresident("Budi"));
    }

    static void sayHello(Employee employee){
        if(employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello Vice President " + vicePresident.name);
        }else if(employee instanceof Manager){
            Manager manager = (Manager) employee;
            System.out.println("Hello main.Manager " + manager.name);
        }else{
            System.out.println("Hello main.Employee " + employee.name);
        }
    }
}
