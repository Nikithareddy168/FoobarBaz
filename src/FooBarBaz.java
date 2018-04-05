import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FooBarBaz {
    static File f1 = new File("foobarbaz.txt");

    public void run() throws IOException {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter a number : ");
            String entry = scanner.next();
            exit_or_continue(entry);
            validate(entry);
        }
    }

    public String validate(String entry) {
        int num = Integer.parseInt(entry);
        if (num <= 0) {
            return "Enter Positive integer value";
        }
        else{
            return "isnum";
        }
        
    }

    private void exit_or_continue(String entry) throws IOException {
        if ("stop".equalsIgnoreCase(entry)) {
            System.exit(0);
        }
        else {
            try {
                int num = Integer.parseInt(entry);
                if (f1.exists()) {
                    f1.delete();
                }
                if (f1.exists()) {
                    f1.createNewFile();
                }
                for (int i = 1; i <= num; i++) {
                    write_file(i);
                }
                if (num >= 110 || num < 0) {
                    System.out.println("Invalid Input");
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid Input");
            }
        }
    }

    public String replace(int num) throws IOException {
        if (num % 3 == 0 && num % 5 == 0 && num % 7 == 0) {
            return "FooBarBaz";
        }
        else if (num % 3 == 0 && num % 5 == 0) {
            return "FooBar";
        }
        else if (num % 5 == 0 && num % 7 == 0) {
            return "BarBaz";
        }
        else if (num % 3 == 0 && num % 7 == 0) {
            return "FooBaz";
        }
        else if (num % 3 == 0) {
            return "Foo";
        }
        else if (num % 5 == 0) {
            return "Bar";
        }
        else if (num % 7 == 0) {
            return "Baz";
        }
        else {
            return Integer.toString(num);
        }
    }

    private void write_file(int num) throws IOException {
        String l = replace(num);
        FileWriter fw = new FileWriter(f1, true); // true is for append
        BufferedWriter bw = new BufferedWriter(fw);
        bw.append(l);
        bw.newLine();
        bw.close();
        fw.close();
    }

    public static void main(String[] args) throws IOException {

        FooBarBaz fbb = new FooBarBaz();
        fbb.run();

    }
}
