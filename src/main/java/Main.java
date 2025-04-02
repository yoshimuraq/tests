public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Влад\n");

        Tester tester1 = new Tester();
        Tester tester2 = new Tester("Влад", "Петров");
        Tester tester3 = new Tester("Анна", "Иванова", 3, "B2", 2500.0);

        tester1.printInfo();
        tester2.printInfo(true);
        tester3.printInfo("Работает над Android проектом");

        Tester.printCompanyPolicy();
    }
}