public class Tester {
    private String name; // имя
    private String surname; // фамилия
    private int experienceInYears; // опыт (в годах)
    private String englishLevel; // уровень английского
    private double salary; // зарплата

    public Tester() {
        this("Unknown", "Unknown", 0, "A1", 0.0);
    }

    public Tester(String name, String surname) {
        this(name, surname, 0, "B1", 1000.0);
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("Имя: " + name + ", Фамилия: " + surname);
    }

    public void printInfo(boolean includeSalary) {
        printInfo();
        if (includeSalary) {
            System.out.println("Зарплата: " + salary);
        }
    }

    public void printInfo(String additionalInfo) {
        printInfo();
        System.out.println("Дополнительная информация:" + additionalInfo);
    }

    public static void printCompanyPolicy() {
        System.out.println("Политика компании: Все тестировщики должны сдать экзамен по английскому языку.");
    }
}