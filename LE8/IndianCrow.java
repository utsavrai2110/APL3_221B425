public class IndianCrow implements Crow {
    @Override
    public void cry() {
        System.out.println("Crow: Cawing loudly to get attention!");
    }

    @Override
    public void fly() {
        System.out.println("Crow: Flying high and gracefully.");
    }

    @Override
    public void eat() {
        System.out.println("Crow: Pecking at grains enthusiastically.");
    }
}
