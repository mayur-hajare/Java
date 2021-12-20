package com.mh;

import java.util.Scanner;

class BaseRoom {
    int length, breadth;

    BaseRoom(int x, int y) {
        length = x;
        breadth = y;
    }

    public void Area() {
        System.out.println(length * breadth);
    }
}

class SubclassRoom extends BaseRoom {
    int height;

    SubclassRoom(int x, int y, int z) {
        super(x, y);
        height = z;
    }

    public void hello() {
        System.out.println("Hello Mayur..!");
    }

    public void Volume() {
        System.out.println(length * breadth * height);
    }
}


class Room extends SubclassRoom {
    int num;

    Room(int x, int y, int z, int a) {
        super(x, y, z);
        num = a;
    }

    public void Display() {
        System.out.println("l : " + length);
        System.out.println("a :" + num);
        System.out.println("b :" + breadth);
        System.out.println("h :" + height);
    }


}

public class SingleInheritance {
    public static void main(String[] args) {
        System.out.println("Enter Length ,Breath and Height :");
        Scanner scanner = new Scanner(System.in);
        int l, b, h, a;
        l = scanner.nextInt();
        b = scanner.nextInt();
        h = scanner.nextInt();
        a = scanner.nextInt();


        Room room = new Room(l, b, h, a);
        room.Area();
        room.Volume();
        room.Display();
        room.hello();

    }
}
