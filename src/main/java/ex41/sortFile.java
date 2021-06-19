package ex41;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sortFile {
    public void sortString(List<String> array){
        array.toArray();
        String[] newArray = array.toArray(new String[0]);
        System.out.println("Total of: " + newArray.length + " names");
        System.out.println("---------------------------------------");
        Arrays.sort(newArray);
        for(int i = 0; i<newArray.length; i++){
            System.out.printf(newArray[i] +"\n");
        }
    }
}
