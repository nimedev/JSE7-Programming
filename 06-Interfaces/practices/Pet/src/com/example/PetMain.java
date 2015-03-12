package com.example;

public class PetMain {

    public static void main(String[] args) {
        Animal a;
        //test a spider with a spider reference
        Spider s = new Spider();
        s.eat();
        s.walk();
        playWithAnimal(s);
        //test a spider with an animal reference
        a = new Spider();
        a.eat();
        a.walk();
        playWithAnimal(a);

        //test fish with a fish reference
        Fish f = new Fish();
        f.eat();
        f.walk();
        playWithAnimal(f);
        //test fish with a animal reference
        a = new Fish();
        a.eat();
        a.walk();
        playWithAnimal(a);

        Pet p;
        //test cat with a cat reference
        Cat c = new Cat();
        c.eat();
        c.walk();
        playWithAnimal(c);
        //test cat with a animal reference
        a = new Cat("Pantro");
        a.eat();
        a.walk();
        playWithAnimal(a);
        // Test cat with pet reference
        p=new Cat();
        p.setName("Luna");
        p.play();
    }

    public static void playWithAnimal(Animal a) {
        if (a instanceof Pet) {
            ((Pet) a).play();
        } else {
            System.out.println("Danger! Wild Animal");
        }
    }

}
