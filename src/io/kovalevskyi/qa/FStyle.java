package io.kovalevskyi.qa;

import java.util.stream.IntStream;

/**
 * Created by b0noI on 01/08/15.
 */
public class FStyle {

    public static void main(String[] args) {
        Dot d = new Dot(0, 0);
        Thread t1 = new Thread(() -> iterate(d));
        Thread t2 = new Thread(() -> iterate(d));
        t2.start();
        t1.start();
    }

    private static void iterate(final Dot currentDot) {
        // 0 ... 10_000
        IntStream.range(0, 10_000).forEach(i -> {
            final Dot nextDot = new Dot(currentDot.getX() + i, currentDot.getY() + i);
            System.out.format("Dot - X: %d Y: %d\n", nextDot.getX(), nextDot.getY());
        });
    }

    // 0, 0; 3
    // 1, 1; 3 [0, 0]
    // 2, 2; 3 [0, 0; 1, 1]
    // 3, 3; 3 [...; 2, 2]
    //

}

class Dot {

    final int x;

    final int y;

    public Dot(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
