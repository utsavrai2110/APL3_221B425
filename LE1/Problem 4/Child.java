class Child extends Mother {
    Child(String x) {
        super(x); // to rectiy the error Call to the superclass constructor
        System.out.println("Child's constructor with parameter: " + x);
    }
}
