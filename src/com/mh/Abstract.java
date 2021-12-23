package com.mh;

abstract class Pen {
    abstract public void write();

    abstract public void refill();
}

class FountainPen extends Pen {
    public void ChangeNib() {

    }

    @Override
    public void write() {
        System.out.println("Write FountainPen");
    }

    @Override
    public void refill() {
        System.out.println("Refill FountainPen");
    }
}

class BallPen extends FountainPen {
    public void ChangeNib() {

    }

    @Override
    public void write() {
        System.out.println("Write BallPen");
    }

    @Override
    public void refill() {
        System.out.println("Refill BallPen");
    }
}

abstract class TelePhone {

    abstract public void ring();

    abstract public void lift();

    abstract public void disconnect();
}

class SmartPhone {

    public void ring() {
        System.out.println("Phone Ringing...");
    }

    public void lift() {
        System.out.println("Phone Connected...");
    }

    public void disconnected() {
        System.out.println("Phone Disconnected...");
    }
}

public class Abstract {
    public static void main(String[] args) {
        FountainPen p = new FountainPen();
        BallPen b = new BallPen();

        p.write();
        p.refill();
        b.write();
        b.refill();

        SmartPhone sm = new SmartPhone();
        sm.ring();
        sm.lift();
        sm.disconnected();

    }
}
