package Pokemon;

import com.opencsv.CSVReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
public class Combat {
    public static void main(String[] args) {
        CSVReader reader = null;
        System.out.println("reader =" + reader);
        try {
            reader = new CSVReader(new FileReader("C:\\Users\\Soulainah\\IdeaProjects\\Java_fondamentaux\\Pokemon.csv"));
            System.out.println("reader 2=" + reader);
            String [] nextLine;
            while ((nextLine = reader.readNext()) != null){
                for (String token : nextLine){
                    System.out.println(token);
                }
                System.out.print("\n");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
