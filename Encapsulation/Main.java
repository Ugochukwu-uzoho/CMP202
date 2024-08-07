package Encapsulation;

public class Main {
    
    public static void main(String[] args) {

        Person student = new Person("Bingham","Ugochukwu","may","bhu/20/04/05/0130", 0);
        Person staff = new Person("Bingham","Ugochukwu","may","bhu/20/04/05/0130", 0);
        
        // person.setName("U");
        // person.setPassword("may");
        System.out.println(staff);

        Physics calvelocity = new Physics();
        System.out.println(calvelocity.calculateVelocity(50,10));
        System.out.println(calvelocity.calculateVelocity(50,20,10));



    }
}
