package Viikko4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWriteIO {

    public void readAndWrite(String input, String output) {

        try {
            BufferedReader br = new BufferedReader(new FileReader(input));
            BufferedWriter bw = new BufferedWriter(new FileWriter(output));
            String line = "";

                while ((line = br.readLine()) != null) {
                    if (line.trim().length() < 30) {
                        if (line.trim().length() > 0) {
                            if (line.contains("v") == true) {
                                bw.write(line + "\n");
                            }
                        }
                    }
                }
                br.close();
                bw.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}