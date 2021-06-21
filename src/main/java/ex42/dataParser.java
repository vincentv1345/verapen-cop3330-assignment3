package ex42;

public class dataParser {
    public void parseData(String data) {
            String[]splitData = data.split(",",5);
            for(String d : splitData){
                System.out.print(d + "\t");
            }
        }
    }
