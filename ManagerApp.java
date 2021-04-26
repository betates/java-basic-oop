package main;

class ManagerApp {
    public static void main(String[] args) {
        Manager manager = new Manager("Rofiq", " Gojek");
        manager.sayHello("Jhon");

        VicePresident vp = new VicePresident("Axel");
        vp.sayHello("Rofiq");

        System.out.println(manager);
        System.out.println(vp);
        System.out.println(vp.toString());
    }
}
