package com.mh;

abstract class Monkey {
    public void Jump() {
        System.out.println("Monkey Jump");
    }

    public void Bite() {
        System.out.println("Monkey Bite");
    }

    abstract public void eat();

    abstract public void sleep();

}

class Human extends Monkey {
    @Override
    public void eat() {
        System.out.println("Human Eats");
    }

    @Override
    public void sleep() {
        System.out.println("Human sleep");
    }
}

public class Abstract1 {
    public static void main(String[] args) {

        Monkey monkey = new Monkey() {
            @Override
            public void eat() {
                System.out.println("Monkey eats");
            }

            @Override
            public void sleep() {
                System.out.println("Monkey sleeps");
            }
        };
        monkey.eat();
        monkey.sleep();
        monkey.Bite();
        monkey.Jump();
        Human human = new Human();
        human.eat();
        human.sleep();
    }
}
