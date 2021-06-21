package ex43;
import java.util.*;
import java.io.*;

public class HtmlFile extends getWebsiteInfo{
    public String generateHtmlFile(String file){
        String htmlFile = "Created: ./website/" + file + "/index.html";
        return htmlFile;
    }
}
