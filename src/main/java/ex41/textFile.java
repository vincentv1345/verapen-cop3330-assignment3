package ex41;
import java.io.*;
import java.util.*;
import java.io.FileNotFoundException;
public class textFile extends sortFile{
    sortFile n = new sortFile();
    public void newFile(){
        List<String> namesArr = new ArrayList<>();
        try{
        File readFile = new File("exercise41_input.txt");
        Scanner fileReader = new Scanner(readFile);
        while (fileReader.hasNextLine()){
            String names = fileReader.nextLine();
            namesArr.add(names);
            System.out.println(names);
        }
        fileReader.close();
        String []namesArray = namesArr.toArray(new String[0]);
        n.sortString(namesArr);
        }catch (FileNotFoundException file){
            System.out.println("File not found.");
            file.printStackTrace();
        }
    }
}
