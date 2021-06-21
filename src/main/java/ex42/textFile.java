package ex42;
import java.io.*;
import java.util.*;
public class textFile extends dataParser{
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
