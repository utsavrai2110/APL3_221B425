public class CrowAdapter implements Swan {
    private Crow crow;

    public CrowAdapter(Crow crow) {
        this.crow = crow;
    }

    @Override
    public void eat() {
        crow.eat(); 
    }

    @Override
    public void sing() {
        crow.cry(); 
    }

    @Override
    public void swim() {
        System.out.println("Crow: Attempting to swim but mostly splashing!");
    }
}
