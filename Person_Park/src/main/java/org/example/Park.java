package org.example;

// Park.java
public class Park {
    private Attraction[] attractions;
    private int count;

    public Park(int size) {
        attractions = new Attraction[size];
        count = 0;
    }

    public void addAttraction(String name, String workingHours, double cost) {
        if (count < attractions.length) {
            attractions[count++] = new Attraction(name, workingHours, cost);
        } else {
            System.out.println("Парк переполнен.");
        }
    }

    public void printAttractions() {
        for (int i = 0; i < count; i++) {
            attractions[i].printInfo();
        }
    }

    private class Attraction {
        private String name;
        private String workingHours;
        private double cost;

        public Attraction(String name, String workingHours, double cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public void printInfo() {
            System.out.println("Attraction: " + name);
            System.out.println("Working Hours: " + workingHours);
            System.out.println("Cost: " + cost);
        }
    }
}
