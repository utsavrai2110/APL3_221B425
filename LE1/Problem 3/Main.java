public class Main {
    public static void main(String[] args) {
        Mother m1 = new Child();
//         The show() method of the Child class will be called because m1 
//          is a reference of type Mother but points to an instance of Child
//         m1.show(); 
// 2nd Case (Static in Mother Only)
//          The show() method of the Mother class will be called
//         because static methods are not overridden but hidden.
//         m1.show(); // gives error as overriden method is static

// 3rd Case (Static in Child Only)

//         The show() method of the Mother class will be called
//         because static methods are not overridden but hidden.
//         m1.show(); // gives error as overriden method is static

//4th Scenario (Static in Child and Mother )
//          The show() method of the Mother class will be 
//          called because static methods are not overridden but hidden.
            m1.show(); 
    }
}

