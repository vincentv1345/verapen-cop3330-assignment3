package ex43;

import org.junit.jupiter.api.Test;

public class testEx43 {
    @Test
    public String generateHtmlFile(String file) {
        file = "testFile";
        String htmlFile = "Created: ./website/" + file + "/index.html";
        return htmlFile;
    }
    public String generateJavaScriptFile(String siteName){
        siteName = "testSite";
        return "./website/" + siteName + "/js";
    }
    public String generateCSSFile(String siteName){
        siteName = "testSiteName";
        return "./website/" + siteName + "/index.html";
    }

}
