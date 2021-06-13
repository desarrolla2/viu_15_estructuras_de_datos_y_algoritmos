package UC4.Exercise_01;

import java.util.Scanner;

public class Input {

    public static float readFloat() {
        Scanner scanner = new Scanner(System.in);
        float value;

        try {
            value = scanner.nextFloat();
        } catch (Exception exception) {
            return 0f;
        }
        return value;
    }

    public static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        int integer;

        try {
            integer = scanner.nextInt();
        } catch (Exception exception) {
            return 0;
        }
        return integer;
    }

    public static String readString() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        String string;

        try {
            string = scanner.hasNext() ? scanner.next() : "";
        } catch (Exception exception) {
            return "";
        }
        return string.trim();
    }
}
