package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = 1; i <= height; i++) {
            if (i < height / 2 + 1) {
                for (int j = 1; j <= height; j++) {
                    if (j >= i) {
                        if (j >= height - i + 2)
                            System.out.print(" ");
                        else
                            System.out.print(8);
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            } else {
                for (int j = 1; j <= height; j++) {
                    if (j > height - i) {
                        if (j > i)
                            System.out.print(" ");
                        else
                            System.out.print(8);
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
