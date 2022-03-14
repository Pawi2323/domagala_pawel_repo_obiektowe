package pl.local.home.zadanie_kolofortuny;

public class Main {
    public static void main(String[] args) {
        String[] animationChars = {"o o", "___"};

        for (int i = 0; i <= 1; i++) {
            System.out.print(animationChars[i % 2] + "\n");

            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
