public class TestClass {

    public static void main(String[] args) {


        System.out.println("Testing Person");

        Person p1 = new Person("Nazrin", "Jalilova", "Female");
        Person p2 = new Person("Arthur", "Conan", "Male");
        Person p3 = new Person("Agatha", "Christie", "Female");

        System.out.println(p1.toString());
        System.out.println(p3.toString());

        System.out.println("p1=p2? " + p1.equals(p2));
        System.out.println("p1=p3? " + p1.equals(p3));


        System.out.println("\nTesting Teacher");

        String[] courses1 = {"PP2", "IT systems"};
        String[] courses2 = {"Web & Mobile", "Intro to Network"};
        String[] courses3 = {"Calculus", "Physics"};

        Teacher t1 = new Teacher("May", "White", "Female",
                "Information Technologies", courses1);

        Teacher t2 = new Teacher("Wulf", "Dorn", "Male",
                "Computer Science", courses2);

        Teacher t3 = new Teacher("Alex", "Turner", "Male",
                "Computer Engineering", courses3);

        System.out.println(t1.toString());
        System.out.println(t3.toString());

        System.out.println("t1=t2? " + t1.equals(t2));
        System.out.println("t1=t3? " + t1.equals(t3));
    }
}