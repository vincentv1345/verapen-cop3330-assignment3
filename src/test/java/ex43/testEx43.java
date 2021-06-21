package ex43;

public class testEx43 {
    public String generateHtmlFile(String file) {
        String htmlFile = "Created: ./website/" + file + "/index.html";
        return htmlFile;
    }
    public String generateJavaScriptFile(String siteName){
        return "./website/" + siteName + "/js";
    }
    public String generateCSSFile(String siteName){
        return "./website/" + siteName + "/index.html";
    }

}
