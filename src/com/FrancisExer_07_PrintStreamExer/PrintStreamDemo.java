package com.FrancisExer_07_PrintStreamExer;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamDemo {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps=new PrintStream("C:\\Users\\liume\\Desktop\\hrmup\\JavaIOExer\\ps.txt");

        ps.write(97);
        ps.print(97);

        ps.close();//释放资源

    }
}
