class Test{
    public static void main (String[] args) {
        Offering offering = new Coffee();
        offering = new Rum(offering);
        
        System.out.println(offering.getName() + " " + offering.getPrice());
        
        Offering offering1 = new Tea();
        offering1 = new Rum(offering1);
        
        System.out.println(offering1.getName() + " " + offering1.getPrice());
        
        Offering offering2 = new Tea();
        offering2 = new Gin(offering2);
        
        System.out.println(offering2.getName() + " " + offering2.getPrice());
        
        Offering offering3 = new Coffee();
        offering3 = new Gin(offering3);
        
        System.out.println(offering3.getName() + " " + offering3.getPrice());
        
        Offering offering4 = new Coffee();
        offering4 = new Rum(offering4);
        offering4 = new Gin(offering4);
        
        System.out.println(offering4.getName() + " " + offering4.getPrice());
    }
}