// Note: This class will not compile yet.

import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class TryCatchFinally {

    private List<Integer> list;
    private static final int SIZE = 10;

    public static void main(String[] args) {
        TryCatchFinally test = new TryCatchFinally(10);
        TryCatchFinally test2 = new TryCatchFinally(100);

        test.writeList("File.txt");
        test2.writeList("Filezzz.txt");
        test2.writeList("Filez.txt");
    }

    public TryCatchFinally(int startValue) {
        list = new ArrayList<>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            list.add(i + startValue);
        }
    }

    public void writeList(String fileName) {
        PrintWriter out = null;

        // The FileWriter constructor throws IOException, which must be caught.
        try {

            out = new PrintWriter(new FileWriter(fileName));


            for (int i = 0; i < SIZE; i++) {
                // The get(int) method throws IndexOutOfBoundsException, which must be caught.
                out.println("Value at: " + i + " = " + list.get(i));
            }
            out.println("Chrck this outy");
        } catch (IndexOutOfBoundsException ex) {

            System.out.println("Oops you went too far with the array index " + ex);
        } catch (IOException ex) {
            System.out.println("Something bad happened: " + ex);
        } catch (Exception ex) {
            System.out.println("Everybody Stops here! " + ex);
        } finally {
            if (out != null) {
                System.out.println("String not empty!");
                out.close();
            }

        }
    }
}

