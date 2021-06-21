package ex45;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.nio.*;
public class createTextFile extends replaceJavaLines{
    List<String> text = new ArrayList<>();
    public List<String> textFileData(){
        String x1 = "";
        String x2 = "";
        String x3 = "";
        try {
            File data = new File("/Users/vilmacanales/IdeaProjects/verapen-cop3330-assignment3/exercise45_input.txt");
            Scanner file = new Scanner(data);
            while(file.hasNextLine()){
                String fileData1 = file.next();
                x1 = replace(fileData1);
                text.add(x1);
            }
            file.close();
        }
        catch (IOException file){
            System.out.println("File doesn't exist");
            file.printStackTrace();
        }
        return text;
    }
    public void newTextFile(List<String> b, String outPutFile){
        boolean check;
        try {
            File newFile = new File("/Users/vilmacanales/IdeaProjects/verapen-cop3330-assignment3/" + outPutFile + ".txt");
            if(!newFile.exists()){
                newFile.createNewFile();
                PrintWriter pf = new PrintWriter(newFile);
                for(int i =0; i <b.toArray().length; i++){
                    pf.println(b.get(i));
                }
                pf.close();
            }
        }
        catch (IOException n){
            System.out.println("File does not exist");
        }
    }
    public String getOutputFile(){
        Scanner get = new Scanner(System.in);
        System.out.print("Please enter name of output file: ");
        return get.next();
    }
}
