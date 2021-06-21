package ex42;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class testEx42 {
    @Test
    public void parseData(String data) {
        data = "data,information";
        String[]splitData = data.split(",",5);
        for(String d : splitData){
            System.out.print(d + "\t");
        }
    }
    @Test
    public void makeFile(){
        File textFileData = new File("exercise42_input.txt");
        try {
            Scanner dataReader = new Scanner(textFileData);
            System.out.println("Last \t First \t Salary");
            System.out.println("------------------------------");
            while (dataReader.hasNextLine()) {
                String data = dataReader.nextLine();
                int i = 0;
                parseData(data);
                while(i%3 == 0){
                    System.out.println();
                    i++;
                }

            }
            dataReader.close();
        }
        catch(FileNotFoundException file){
            System.out.println("File not found.");
            file.printStackTrace();
        }
    }
}
