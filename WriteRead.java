import java.io.*;

public class WriteRead {

    public static void main(String[] args) {
        try {
            // writing to file
            FileWriter file = new FileWriter("testFile.txt");
            file.write("hey i'm writing to the file using character stream");
            file.close();

            // reading from file
            FileReader fileRead = new FileReader("testFile.txt");
            int i;
            while ((i = fileRead.read()) != -1) {
                System.out.println((char) i);
            }
            fileRead.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}