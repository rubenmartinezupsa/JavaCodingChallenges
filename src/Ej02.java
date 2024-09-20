import java.util.Scanner;

public class Ej02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca su DNI (Sin letra): ");
        String dni = String.valueOf(sc.nextInt());
        if (dni.length() != 8)  {
            System.out.println("Error. Compruebe que ha introducido 8 numeros");
        } else {
            int dniNum = Integer.parseInt(dni);
            int result = dniNum % 23;
            System.out.println(STR."NIF => \{dni}\{getNifLetter(result)}");
        }
    }

    public static String getNifLetter(int result) {
        switch (result)   {
            case 0:
                return "T";
            case 1:
                return "R";
            case 2:
                return "W";
            case 3:
                return "A";
            case 4:
                return "G";
            case 5:
                return "M";
            case 6:
                return "Y";
            case 7:
                return "F";
            case 8:
                return "P";
            case 9:
                return "D";
            case 10:
                return "X";
            case 11:
                return "B";
            case 12:
                return "N";
            case 13:
                return "J";
            case 14:
                return "Z";
            case 15:
                return "S";
            case 16:
                return "Q";
            case 17:
                return "V";
            case 18:
                return "H";
            case 19:
                return "L";
            case 20:
                return "C";
            case 21:
                return "K";
            case 22:
                return "E";
        }
        return "";
    }
}
