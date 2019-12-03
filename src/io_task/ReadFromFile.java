package io_task;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;
import static java.nio.file.Files.*;
public class ReadFromFile {
    public static void readWithInputStream() throws IOException {
        File file = new File("C:\\Users\\oprijilevskaia\\IdeaProjects\\practice\\files\\Test5.txt");
        InputStream in = new FileInputStream(file);
        int content;
        while ((content = in.read()) != -1) {
            System.out.print((char)content);
        }
    }
    public static void readWithFiles() {
        try{
            System.out.println(readAllLines(Paths.get("C:\\Users\\oprijilevskaia\\IdeaProjects\\practice\\files\\Test2.txt")));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public static void readWithBufferedReader() throws IOException {
        File file = new File("C:\\Users\\oprijilevskaia\\IdeaProjects\\practice\\files\\Test3.txt");
        StringBuilder sb = new StringBuilder();
        InputStream in = new FileInputStream(file);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String textFromFile;
        while ((textFromFile = br.readLine()) !=null ) {
            sb.append(textFromFile + System.lineSeparator());
        }
        System.out.println(sb.toString());
    }
    public static void readWithScanner() throws FileNotFoundException {
        File file = new File("C:\\Users\\oprijilevskaia\\IdeaProjects\\practice\\files\\Test4.txt");
        Scanner in = new Scanner(file);
        while (in.hasNextLine()) {
            System.out.print(in.nextLine() + System.lineSeparator());
        }
    }
    public static void readWithFileReader() throws IOException {
        FileReader fr = new FileReader("C:\\Users\\oprijilevskaia\\IdeaProjects\\practice\\files\\Test5.txt");
        int content;
        while ((content = fr.read()) != -1) {
            System.out.print((char) content);
        }
    }
}


