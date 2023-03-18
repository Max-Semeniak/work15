import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hw {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите путь к файлу");
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        String fileName =  reader.readLine();

        FileInputStream inputStream = new FileInputStream(fileName);
        int max = Integer.MIN_VALUE;
        while (inputStream.available() > 0){
            int data = inputStream.read();
            if (max < data);
            max = data;
        }
        System.out.println("Max" + max);
        inputStream.close();
    }
}
