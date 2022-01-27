package Test;

import java.util.Random;

public class test {
    public static void main(String[] args) {
        Random rn = new Random();
        for (int i = 0; i < 100; i++) {
            int answer = rn.nextInt(5) - 2;
            System.out.println(answer);
        }
    }
}
