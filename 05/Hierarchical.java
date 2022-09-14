class Country {
    Country() {
        System.out.println("Country constructor called");
    }
}

class State extends Country {
    State() {
        System.out.println("State constructor called");
    }
}

class City extends State {
    City() {
        System.out.println("City constructor called");
    }
}

class Village extends State {
    Village() {
        System.out.println("Village constructor called");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        System.out.println("Creating a city object...");
        new City();
        System.out.println("\nCreating a village object...");
        new Village();

    }
}
