package ru.mephi.test.jd211;

public class Statements {

    public void ifStatement() {
        int n = (int) (Math.random() * 10);
        if (n >= 5) {
            System.out.println("Congrat");
        } else {
            System.out.println("Try again");
        }
    }

    public void whileStatement() {
        while (Math.random() > 1 / 6) {
            System.out.println("Continue");
        }
        System.out.println("Finished");
    }

    public void forStatement() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Iterate throw step " + i);
        }
    }

    public void commentsExample() {
        /*
         * int i = 5;
         * i++;
         */
        // System.out.println(i);
    }
}
