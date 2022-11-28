/*
 * File: FileHandler.java
 * Created Date: 2020-09-15
 * Author: Nagy János
 * Github: https://github.com/andteki
 * Copyright (c) 2020-2022 Nagy János
 * Refaktorálva: Sánta Renáta Diána, 2022-11-28, Szoft II N
 * Github: https://github.com/SantaRenata 
 * GNU GPL v2
 */

package models;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class FileHandler {
    String fileName;
    
    public FileHandler() {
        this.fileName = "adat.txt";
    }
    
    public void tryWriteFile(String line) throws IOException{
        FileWriter fileWriter = new FileWriter(this.fileName, true);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        
        printWriter.println(line);
        printWriter.close();
    }

    public void writeFile(String line){
        try {
            tryWriteFile(line);
        } catch (IOException e) {
            System.err.println("Hiba! A fájlbaírás sikertelen!");
        }
    }

}
