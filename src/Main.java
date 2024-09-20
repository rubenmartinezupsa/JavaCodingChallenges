import java.time.Month;
import java.time.Year;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year = 0;
        boolean failure = false;
        System.out.print("Anho de nacimiento: ");
        year = sc.nextInt();
        System.out.print("Mes de nacimiento: ");
        month = sc.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Error: mes inválido");
        } else {
            System.out.print("Dia de nacimiento: ");
            day = sc.nextInt();
            if (!checkDay(day, month, year)) {
                System.out.println("Error: dia supera el nº de dias del mes introducido");
            } else {
                int total = day + month + year;
                String totalStr = String.valueOf(total);
                System.out.println(day + " + " + month + " + " + year + " = " + totalStr);
                int luckNum = 0;
                for (int i = 0; i < totalStr.length(); i++) {
                    int oldLuckNum = luckNum;
                    int value = Integer.parseInt(totalStr.substring(i, i + 1));
                    luckNum += value;
                    System.out.println(oldLuckNum + " + " + value + " = " + luckNum);
                }
                System.out.println("El número de la suerte es el: " + luckNum);
            }
        }
    }

    public static boolean checkDay(int day, int month, int year)   {
        int maxDays = 0;
        boolean isLeap = false;
        if (Year.of(year).isLeap()) {
            isLeap = true;
        }
        maxDays = Month.of(month).length(isLeap);
        if (day <= maxDays) {
            return true;
        }
        return false;
    }
}