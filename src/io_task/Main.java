package io_task;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
//IO Streaming Task: de implementat 5 variante diferite de citire/scriere in fisiere (io/nio libraries)
public class Main {
    public static void main(String[] args) throws IOException {
//--------------------------------------------Write Methods-------------------------------------------------------------------
        String inputData = "Hello world";
        WriteToFile.writeWithOutputStream(inputData);
        WriteToFile.writeWithFiles(inputData);
        WriteToFile.writeWithBufferedWriter(inputData, 5);
        WriteToFile.writeWithFileOutputStrean("It is winter");
        WriteToFile.writeWithFileWriter("So cold");
//--------------------------------------------Read Methods-------------------------------------------------------------------
        ReadFromFile.readWithInputStream();
        ReadFromFile.readWithFiles();
        ReadFromFile.readWithBufferedReader();
        ReadFromFile.readWithScanner();
        ReadFromFile.readWithFileReader();
    }
}