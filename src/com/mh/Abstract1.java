package com.mh;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;

abstract class Monkey {
    public void Jump() {
        System.out.println("Monkey Jump");
    }

    public void Bite() {
        System.out.println("Monkey Bite");
    }


}

interface BasicAnimal {
    abstract public void eat();

    abstract public void sleep();
}

class Human extends Monkey implements BasicAnimal {
    @Override
    public void eat() {
        System.out.println("Human Eats");
    }

    @Override
    public void sleep() {
        System.out.println("Human sleep");
    }

    public void speak() {
        System.out.println("Speaking...");
    }
}

public class Abstract1 {
    public static void main(String[] args) {

        Human human = new Human();

        Monkey monkey = new Human();
        monkey.Jump();
        monkey.Bite();
        // monkey.speak();  --> Error
       /* monkey.eat();
        monkey.sleep();*/
        human.Bite();
        human.Jump();
        human.eat();
        human.sleep();

    }
}
