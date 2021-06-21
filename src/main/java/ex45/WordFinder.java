package ex45;
import java.util.ArrayList;
import java.util.*;
/**
 *  UCF COP3330 Summer 2021 Assignment 3 Solutions
 *  Copyright 2021 Vincent Verapen
 */
public class WordFinder {
    public static void main(String []args){
        createTextFile b = new createTextFile();
        List<String> n = b.textFileData();
        String outPutFileName = b.getOutputFile();
        b.newTextFile(n, outPutFileName);
    }
}
