
import java.util.*;
import java.io.*;

class test {
    public static void main(String[] args) {
        File f = new File("./txt/1.txt");
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(f));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(reader.readLine());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
}

}