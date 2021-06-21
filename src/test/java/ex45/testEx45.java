package ex45;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class testEx45 {
    public String replace(String r){
        String newString = "";
        if(r.contains("utilize")){
            newString = r.replace("utilize", "use");
        }

        return newString;
    }
    @Test
    @DisplayName("Should replace word utilize with use")
    void testReplace(){
        assertEquals("use", replace("utilize"), "use");

    }
}
