package com.FrancisExer_08_PrintWriterExer;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintwriterDemo {
    public static void main(String[] args) throws IOException {
        PrintWriter pw=new PrintWriter("C:\\Users\\liume\\Desktop\\hrmup\\JavaIOExer\\ps.txt");

        pw.write("HELLO");
        pw.flush();
        pw.write("\r\n");
        pw.write("WORLD");
        pw.flush();
        pw.write("\r\n");

        pw.println("hello");
        pw.flush();

//        PrintWriter pw1=new PrintWriter(new FileWriter("C:\\Users\\liume\\Desktop\\hrmup\\JavaIOExer\\ps.txt"),true);//autoFlush:true自动刷新
//        pw.println("hello");

    }
}
