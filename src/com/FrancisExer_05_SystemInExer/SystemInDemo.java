package com.FrancisExer_05_SystemInExer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SystemInDemo {
    public static void main(String[] args) throws IOException {
        //自己实现键盘输入
        InputStream is = System.in;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        System.out.println(line);


        int i = Integer.parseInt(br.readLine());

        System.out.println(i);
        //Java包装类
        Scanner scanner = new Scanner(System.in);


    }
}
