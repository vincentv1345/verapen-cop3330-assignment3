package ex45;

public class replaceJavaLines {
    public String replace(String r){
        String newString = "";
        if(r.contains("utilize")){
            newString = r.replace("utilize", "use");
        }
        return newString;
    }
}
