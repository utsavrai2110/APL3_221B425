public class Main {
    public static void main(String[] args) {
        Crow crow = new IndianCrow(); // Create a Crow instance
        Swan swan = new IndianSwan(); // Create a Swan instance
        Swan crowAdapter = new CrowAdapter(crow); // Adapt the Crow to behave as a Swan

        // Arrange dates
        System.out.println("Let's Arrange The Date!");
        client(swan);        // Date with the Swan
        client(crowAdapter); // Date with the adapted Crow
    }

    // Princess interacts with the swan-like behaviors
    public static void client(Swan swan) {
        swan.eat();  // Swan eats (or adapted crow pecks at grains)
        swan.swim(); // Swan swims (or adapted crow splashes awkwardly)
        swan.sing(); // Swan sings melodiously (or adapted crow caws)
    }
}
