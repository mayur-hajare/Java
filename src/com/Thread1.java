package com;

import java.util.SortedMap;

class Welcome extends Thread {

    public void run() {
        // while (1 == 1)
        System.out.println("Welcome");
    }

}

class GM extends Thread {
    public void run() {
        // while (1 == 1)
        System.out.println("Good Morning...!");
    }
}

public class Thread1 {
    public static void main(String[] args) {

        Welcome welcome = new Welcome();
        GM gm = new GM();
        gm.setPriority(Thread.MAX_PRIORITY);
        welcome.setPriority(Thread.NORM_PRIORITY);
        welcome.start();
        System.out.println(welcome.getState());
        gm.start();
        try {
            welcome.wait(300); //welcome.sleep(200);

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
