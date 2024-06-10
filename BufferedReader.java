import java.io.*;

public class Main {
    public static void main(String[] args) {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        try {
            String input = br.readLine(); 
            System.out.print(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
