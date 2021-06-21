package ex45;
import java.util.ArrayList;
import java.util.*;
public class WordFinder {
    public static void main(String []args){
        createTextFile b = new createTextFile();
        List<String> n = b.textFileData();
        String outPutFileName = b.getOutputFile();
        b.newTextFile(n, outPutFileName);
    }
}
