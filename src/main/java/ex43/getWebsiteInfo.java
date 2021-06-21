package ex43;
import java.util.Scanner;
public class getWebsiteInfo {
    Scanner n = new Scanner(System.in);
    public String getSiteName(){
        System.out.print("Please enter the website name: ");
        return n.next();
    }
    public String getAuthorName(){
        System.out.print("Please enter the author name: ");
        return n.next();
    }
    public String getJSFolder(){
        System.out.print("Do you want a folder for JavaScript? ");
        return n.next();
    }
    public String getCSSFolder(){
        System.out.println("Do you want a folder for CSS? ");
        return n.next();
    }
}
