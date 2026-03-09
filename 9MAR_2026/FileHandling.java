import java.util.*;
import java.io.*;

public class FileHandling {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name :");
        String Name = sc.nextLine();

        System.out.println("Enter your roll number :");
        Integer Roll_no = sc.nextInt();

        System.out.println("Enter your branch :");
        String Branch = sc.next();
        
        File file = new File("student.txt");

        try {
            if(file.createNewFile())
            {
                System.out.println("File created");
            }
            else
            {
                System.out.println("File already exists");
            }
        }
        catch(IOException e)
        {
            System.out.println("An error occurred");
        }

        try {
            FileWriter w = new FileWriter("student.txt");
            w.write("Name: " + Name + "\n");
            w.write("Roll number: " + Roll_no + "\n");
            w.write("Branch: " + Branch);
            w.close();
            System.out.println("File closed");
        }
        catch(IOException e)
        {
            System.out.println("An error occurred");
        }

        try{
            Scanner filer = new Scanner(new File("student.txt"));
            while(filer.hasNextLine())
            {
                String data = filer.nextLine();
                System.out.println(data);
            }
            filer.close();
        }
        catch(IOException e)
        {
            System.out.println("An error occurred");
        }

    }

}
