package ex45;

import org.junit.jupiter.api.Test;

public class testEx45 {
    @Test
    public String replace(String r){
        r = "Hi vincent utilizes a pencil";
        String newString = "";
        if(r.contains("utilize")){
            newString = r.replace("utilize", "use");
        }
        return newString;
    }
}
