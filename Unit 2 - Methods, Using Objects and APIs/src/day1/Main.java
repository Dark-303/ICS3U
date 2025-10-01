package day1;

public class Main {
    public void main(String[] args) {
        /*
        Dog dog1 = new Dog("Steve", 6);
        Dog dog2 = new Dog("Coco", 9);

        dog2.bark(12);
        dog1.eat("Chicken Tacos");
        dog2.eat("people");

        System.out.println(dog1);
        System.out.println(dog2);

        dog1 = dog2;

        System.out.println(dog1);
        System.out.println(dog2);
        */
        Dog dog1 = new Dog("Coco", 9);
        dog1.bark(37);
        dog1.eat("Chicken, Eggs, and Rice");   
        Owner dogMan = new Owner("Steve", dog1);
    }
}
