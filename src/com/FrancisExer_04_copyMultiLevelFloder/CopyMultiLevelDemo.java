package com.FrancisExer_04_copyMultiLevelFloder;

import java.io.*;

public class CopyMultiLevelDemo {
    public static void main(String[] args) throws IOException {
        File srcFile = new File("C:\\Users\\liume\\Desktop\\hrmup\\JavaExer");

        File destFile = new File("C:\\Users\\liume\\Desktop\\hrmup");

        copyfolder(srcFile, destFile);

    }

    private static void copyfolder(File srcFile, File destFile) throws IOException {
        if (srcFile.isDirectory()) {
            String srcFileName = srcFile.getName();
            File newFolder = new File(destFile, srcFileName);
            if (!newFolder.exists()) {
                newFolder.mkdir();
            }

            File[] fileArray = srcFile.listFiles();

            for (File file : fileArray) {
                copyFile(file, newFolder);
            }

        } else {
            File newFile = new File(destFile, srcFile.getName());
            copyFile(srcFile, newFile);
        }
    }

    private static void copyFile(File srcFile, File destFile) throws IOException {

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));

        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read()) != -1) {

        }

    }
}
