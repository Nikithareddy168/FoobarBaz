import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FooBarBaz {
   public void run() throws IOException{
       while(true){
           Scanner scanner = new Scanner(System.in);
           System.out.println("enter a number : ");
           String entry = scanner.next();
           validateinput(entry);
       }
     
    
   }

    private void validateinput(String entry) throws IOException {
        if ("stop".equalsIgnoreCase(entry)) {
            System.exit(0);
        }
        else {
            try {
                int num = Integer.parseInt(entry);
                replace(num);
                if (num >= 110){
                    System.out.println("Invalid Input");
                };
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid Input");
            }
        }
    }
    private void replace(int num) throws IOException{
        File f1 = new File("d:\\foobarbaz.txt");
        if (f1.exists()) {
            f1.delete();
        }
        File f = new File("d:\\foobarbaz.txt");
        if (f.exists()) {
            f.createNewFile();
        }
        FileWriter fw = new FileWriter(f, true); // true is for append
        BufferedWriter bw = new BufferedWriter(fw);
        for (int i = 1; i <= num; i++) {
      
                // code for "FooBarBaz"
                try {
                    if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                        // System.out.println("FooBarBaz");
                        bw.append("FooBarBaz");
                        bw.newLine();
                    }
                    else if (i % 3 == 0 && i % 5 == 0) {
                        // System.out.println("FooBar");
                        bw.append("FooBar");
                        bw.newLine();

                    }
                    else if (i % 5 == 0 && i % 7 == 0) {
                        // System.out.println("BarBaz");
                        bw.append("BarBaz");
                        bw.newLine();
                    }
                    else if (i % 3 == 0 && i % 7 == 0) {
                        // System.out.println("FooBaz");
                        bw.append("FooBaz");
                        bw.newLine();
                    }
                    else if (i % 3 == 0) {
                        // System.out.println("Foo");
                        bw.append("Foo");
                        bw.newLine();
                    }
                    else if (i % 5 == 0) {
                        // System.out.println("Bar");
                        bw.append("Bar");
                        bw.newLine();
                    }
                    else if (i % 7 == 0) {
                        // System.out.println("Baz");
                        bw.append("Baz");
                        bw.newLine();
                    }
                    else {
                        // System.out.println(i);
                        bw.append(Integer.toString(i));
                        bw.newLine();
                    }
                }
                catch (Exception ex) {

                    ex.printStackTrace();

                }
            }
            bw.close();
        }
            
        
    

    public static void main(String[] args) throws IOException{
       
        FooBarBaz fbb = new FooBarBaz();
        fbb.run();
        
    }

}
