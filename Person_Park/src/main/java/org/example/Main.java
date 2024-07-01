package org.example;

// Main.java
public class Main {
    public static void main(String[] args) {
        // Создание и вывод информации о сотрудниках
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        employees[1] = new Employee("Petrov Petr", "Manager", "petrov@mailbox.com", "892312313", 40000, 35);
        employees[2] = new Employee("Sidorov Sidr", "Technician", "sidorov@mailbox.com", "892312314", 25000, 28);
        employees[3] = new Employee("Kuznetsov Kuzma", "Developer", "kuznetsov@mailbox.com", "892312315", 45000, 32);
        employees[4] = new Employee("Smirnov Smirn", "Analyst", "smirnov@mailbox.com", "892312316", 35000, 29);

        for (Employee employee : employees) {
            employee.printInfo();
            System.out.println();
        }

        // Создание и вывод информации о парке аттракционов
        Park park = new Park(3);
        park.addAttraction("Диснейленд", "10:00 - 18:00", 500.50);
        park.addAttraction("Колесо обозрения", "09:00 - 21:00", 150.50);
        park.addAttraction("Дом с приведениями", "11:00 - 20:00", 1275.00);

        park.printAttractions();
    }
}
