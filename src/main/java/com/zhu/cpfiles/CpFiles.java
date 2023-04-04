package com.zhu.cpfiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CpFiles {
    float aFloat = 0.1f;
    double aDoubleFloat = 0.1;
    byte aByte = 127;
    public static void main(String[] args) {
        try {
            copyMoreDirectory();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static void copyMoreDirectory() throws IOException {
        long startTime = System.currentTimeMillis();
        final String source = "此电脑\\Apple iPhone\\Internal Storage\\DCIM";
        final String target = "D:\\zn-iPhone720221225\\DCIM";
        Files.walk(Paths.get(source)).forEach(path ->{
            String targetName = path.toString().replace(source,target);
            if (Files.isDirectory(path)){
                try{
                    Files.createDirectories(Paths.get(targetName));
                }catch (Exception e){
                    e.printStackTrace();
                }
            }

            if (Files.isRegularFile(path)){
                try {
                    Files.copy(path,Paths.get(targetName));
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
        long endTime = System.currentTimeMillis();
        System.out.println("拷贝文件用时 = " + (endTime - startTime) + "ms");
    }
}
