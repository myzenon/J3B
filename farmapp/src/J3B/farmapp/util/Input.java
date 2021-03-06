package J3B.farmapp.util;

import java.io.*;
import java.util.StringTokenizer;

public class Input {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer stringTokenizer = new StringTokenizer("");

    public static String readString() {
        try {
            return reader.readLine();
        }
        catch(Exception e) {}
        return "error";
    }

    public static String readToken() {
        try {
            if(!stringTokenizer.hasMoreTokens()) {
                stringTokenizer = new StringTokenizer(readString());
            }
            return stringTokenizer.nextToken();
        }
        catch (Exception e) {}
        return "error";
    }

    public static int readInt() {
        try {
            return Integer.parseInt(readToken());
        }
        catch (Exception e) {}
        return -1;
    }

    public static void pressEnterKey() {
        System.out.println("\nPress enter to continue ...");
        readString();
    }

    public static void setSystemInput(InputStream inputStream) {
        // Used for test
        reader = new BufferedReader(new InputStreamReader(inputStream));
    }

}
