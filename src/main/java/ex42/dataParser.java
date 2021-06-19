package ex42;

public class dataParser {
    public void parseData(String data) {
        System.out.println("Last \t First \t Salary");
        System.out.println("------------------------------");
        for(int i = 0; i<data.length(); i++){
            String[]splitData = data.split(",",5);
            System.out.print(splitData[i]);
            System.out.println("");
        }
    }
}
