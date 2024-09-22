import java.util.Scanner;

public class Ej03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero de puntos a generar: ");
        int pointsNum = sc.nextInt();


    }

    public static double generateRandomPoint(int min, int max) {
        int range = max - min + 1;
        return Math.random() * range + min;
    }

    public static boolean isInsideCircumference(int x, int y) {
        return x * x + y * y <= 1;
    }

    public static double getPi()    {
        double result = 0;
        return 0;
    }
}
