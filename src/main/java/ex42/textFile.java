package ex42;
import java.io.*;
import java.util.*;
public class textFile extends dataParser{
    public void makeFile(){
        File textFileData = new File("exercise42_input.txt");
        try {
            Scanner dataReader = new Scanner(textFileData);
            while (dataReader.hasNextLine()) {
                String data = dataReader.nextLine();
                parseData(data);
            }
        }
        catch(FileNotFoundException file){
            System.out.println("File not found.");
            file.printStackTrace();
            }
    }
}
