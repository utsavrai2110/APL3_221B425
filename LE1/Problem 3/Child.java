// class Child extends Mother {
//     void show() {
//         System.out.println("Child's show()");
//     }
// }

// 3rd Scenario (Static in Child Only)
// class Child extends Mother {
//     static void show() {
//         System.out.println("Child's static show()");
//     }
// }

//4th Scenario (Static in Child and Mother )
class Child extends Mother {
    static void show() {
        System.out.println("Child's static show()");
    }
}