import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FooBarBaz {
   static File f1 = new File("d:\\foobarbaz.txt");
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
                if (f1.exists()) {
                    f1.delete();
                }
                if (f1.exists()) {
                    f1.createNewFile();
                }
                for (int i = 1; i <= num; i++) {
                    
                write_file(i);
                }
                if (num >= 110){
                    System.out.println("Invalid Input");
                };
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid Input");
            }
        }
    }
    public String replace(int num) throws IOException{
                    if (num % 3 == 0 && num % 5 == 0 && num % 7 == 0) {
                        // System.out.println("FooBarBaz");
                        return "FooBarBaz";

                    }
                    else if (num % 3 == 0 && num % 5 == 0) {
                        // System.out.println("FooBar");
                        return "FooBar";

                    }
                    else if (num % 5 == 0 && num % 7 == 0) {
                        // System.out.println("BarBaz");
                        return "BarBaz";
                    }
                    else if (num % 3 == 0 && num % 7 == 0) {
                        // System.out.println("FooBaz");
                        return "FooBaz";
                    }
                    else if (num % 3 == 0) {
                        // System.out.println("Foo");
                        return "Foo";
                    }
                    else if (num % 5 == 0) {
                        // System.out.println("Bar");
                        return "Bar";
                    }
                    else if (num % 7 == 0) {
                        // System.out.println("Baz");
                        return "Baz";
                    }
                    else {
                        return Integer.toString(num);
                    }
        }
            
    private void write_file(int num) throws IOException{
        System.out.println("=="+num);
        String l = replace(num);
        System.out.println("=lllllllllllll="+l);
       
      /*  if (f1.exists()) {
            f1.delete();
        }
        //File f = new File("d:\\foobarbaz.txt");
        if (f1.exists()) {
            f1.createNewFile();
        }*/
        FileWriter fw = new FileWriter(f1, true); // true is for append
        BufferedWriter bw = new BufferedWriter(fw);
        bw.append(l);
        bw.newLine();
        bw.close();
        fw.close();
    }
    

    public static void main(String[] args) throws IOException{
       
        FooBarBaz fbb = new FooBarBaz();
        fbb.run();
        
    }
}

