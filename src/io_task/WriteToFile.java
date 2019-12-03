package io_task;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WriteToFile {
    public static void writeWithOutputStream(String inputData) throws IOException {
        OutputStream outStream = null;
        try {
            outStream = new FileOutputStream(new File("C:\\Users\\oprijilevskaia\\IdeaProjects\\practice\\files\\Test1.txt"));
            outStream.write(inputData.getBytes());
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            try {
                outStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void writeWithFiles(String inputData){
        try{
            Files.write(Paths.get("C:\\Users\\oprijilevskaia\\IdeaProjects\\practice\\files\\Test2.txt"),inputData.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeWithBufferedWriter(String inputData, int nrOfLines){
        File file = new File("C:\\Users\\oprijilevskaia\\IdeaProjects\\practice\\files\\Test3.txt");
        FileWriter fw = null;
        BufferedWriter bw =null;
        String inputDataWithNewLine = inputData+System.getProperty("line.separator");
        try {
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            for (int i = nrOfLines; i > 0; i--) {
                bw.write(inputDataWithNewLine);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try {
                bw.close();
                fw.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void writeWithFileOutputStrean(String inputData) throws IOException {
        FileOutputStream fous = new FileOutputStream("C:\\Users\\oprijilevskaia\\IdeaProjects\\practice\\files\\Test4.txt");
        FileChannel fc = fous.getChannel();
        byte[] byteArray = new byte[inputData.length()];
        byteArray = inputData.getBytes();
        ByteBuffer bBuffer = ByteBuffer.allocate(1024);
        for (int i = 0; i < byteArray.length; i++) {
            bBuffer.put(byteArray[i]);
        }
        bBuffer.flip();
        fc.write(bBuffer);
    }
    public static void writeWithFileWriter(String inputData) throws IOException {
        File file = new File("C:\\Users\\oprijilevskaia\\IdeaProjects\\practice\\files\\Test5.txt");
        FileWriter fw = null;
        fw = new FileWriter(file);
        fw.write(inputData);
        fw.close();
    }
}


