package com.xr.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtil {
    /*
    * 测试
    * */
    public static void main(String[] args) {
        try {

            // convert file to byte[]
            byte[] bFile = readBytesFromFile("D:/test.txt");
            System.out.println(bFile);

            //java nio
            //byte[] bFile = Files.readAllBytes(new File("test.txt").toPath());
            //byte[] bFile = Files.readAllBytes(Paths.get("test.txt"));

            // save byte[] into a file
            Path path = Paths.get("D:/test2.txt");
            Files.write(path, bFile);

            System.out.println("Done");

            //Print bytes[]
            for (int i = 0; i < bFile.length; i++) {
                System.out.print((char) bFile[i]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    /*
    * 文件转换byte数组
    * */
    public static byte[] readBytesFromFile(String filePath) {

        FileInputStream fileInputStream = null;
        byte[] bytesArray = null;

        try {

            File file = new File(filePath);
            bytesArray = new byte[(int) file.length()];

            //read file into bytes[]
            fileInputStream = new FileInputStream(file);
            fileInputStream.read(bytesArray);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

        return bytesArray;
    }
}
