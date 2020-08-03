public class LapYear {
    public static void main(String[] args) {
        int yearNumber = 2019;
        System.out.println(yearNumber);

        if (yearNumber % 4 > 0) {
            System.out.println("To nie jest rok przestępny");
        } else if (yearNumber % 100 > 0) {
            System.out.println("To jest rok przestępny");
        } else if (yearNumber % 400 > 0) {
            System.out.println("To nie jest rok przestępny");
        } else {
            System.out.println("To jest rok przestępny");
        }
    }
}


