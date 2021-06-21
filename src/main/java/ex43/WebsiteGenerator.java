package ex43;
import java.io.*;

public class WebsiteGenerator {
    public static void main(String []args){
        HtmlFile h = new HtmlFile();
        JavaScriptFile j = new JavaScriptFile();
        CSSFile c = new CSSFile();
        getWebsiteInfo w = new getWebsiteInfo();
        String website = w.getSiteName();
        String author = w.getAuthorName();
        String newHtmlFile = h.generateHtmlFile(website);
        String jsFile = j.generateJavaScriptFile(website);
        String cssFile = c.generateCSSFile(website);
        String htmlFile = "<html><title>" + website + "</title><author>" +  author + "</author><p1>" + newHtmlFile + "</p1><p2>" + jsFile + "</p2>" + cssFile + "</p3></html>";
        File html = new File("/Users/vilmacanales/IdeaProjects/verapen-cop3330-assignment3/htmlFile.html");
        try{//tries to see if import file works
            BufferedWriter file = new BufferedWriter(new FileWriter(html));
            file.write(htmlFile);
            file.close();
        }
        catch (IOException file){//catches error for file
            System.out.println("File does not exist");
            file.printStackTrace();
        }
    }
}
