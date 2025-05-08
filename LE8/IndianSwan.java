public class IndianSwan implements Swan {
    @Override
    public void swim() {
        System.out.println("Swan: Gliding elegantly across the lake.");
    }

    @Override
    public void sing() {
        System.out.println("Swan: Singing a melodious tune.");
    }

    @Override
    public void eat() {
        System.out.println("Swan: Eating pearls gracefully.");
    }
}
