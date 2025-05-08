public class Client {
    private DatePlanner datePlanner;

    public Client(DatePlanner datePlanner) {
        this.datePlanner = datePlanner;
    }

    public void arrangeDateWithAdapter(String princessGestures, Swan swan, String partnerType) {
        datePlanner.arrangeDate("Princess " + princessGestures, partnerType);

        // Swan-like behavior during the date (real swan or adapted crow)
        swan.eat();
        swan.sing();
        swan.swim();
    }
}
