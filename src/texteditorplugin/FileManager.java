/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texteditorplugin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 *
 * @author Cloudy
 */
public class FileManager {

    private final File currentDir = new File(System.getProperty("user.dir"));

    public String OpenFile() {
        StringBuilder fileContents = new StringBuilder();
        try {
            BufferedReader in = new BufferedReader(new FileReader(new File(currentDir + "\\test.txt")));
            String st;
            while ((st =in.readLine()) != null) {
                fileContents.append(st);
            }
        } 
        catch (Exception e) {
            System.out.println("File opening failed");
        }
        return fileContents.toString();
    }

    public void SaveFile(String fileContent) {
try (Writer writer = new BufferedWriter(new OutputStreamWriter(
              new FileOutputStream(currentDir + "\\test.txt"), "utf-8"))) {
   writer.write(fileContent);
}
catch(Exception e)
{
    
}
    }
}
