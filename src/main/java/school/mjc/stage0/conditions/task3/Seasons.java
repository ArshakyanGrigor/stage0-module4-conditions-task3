package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        switch (month) {
            case 1, 2, 12 -> {
                System.out.println("winter");
            }
            case 3, 4, 5 -> {
                System.out.println("spring");
            }
            case 6, 8, 7 -> {
                System.out.println("summer");
            }
            case 9, 10, 11 -> {
                System.out.println("autumn");
            }
            default -> {
                System.out.println("wrong number!");
            }
        }
    }
}
