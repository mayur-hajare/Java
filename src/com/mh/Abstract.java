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


public class Abstract {
    public static void main(String[] args) {
        FountainPen p = new FountainPen();
        BallPen b = new BallPen();

        p.write();
        p.refill();
        b.write();
        b.refill();

    }
}
