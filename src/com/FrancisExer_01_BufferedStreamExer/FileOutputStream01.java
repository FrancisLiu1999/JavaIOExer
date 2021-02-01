package com.FrancisExer_01_BufferedStreamExer;

import java.io.*;

public class FileOutputStream01 {
    public static void main(String[] args) throws IOException {

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\liume\\Desktop\\hrmup\\myByteStream\\fos.txt", true));

        bos.write("hello\r\n".getBytes());
        bos.write("world\r\n".getBytes());
        bos.close();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\liume\\Desktop\\hrmup\\myByteStream\\fos.txt"));

        //一次读取一个字节数据
        int by;
        while ((by=bis.read())!=-1){
            System.out.print((char)by);
        }

        //一次读取一个字节数组数据


//        String s="中国";
//        byte[] bytes = s.getBytes("GBK");
//
//        System.out.println(Arrays.toString(bytes));
//
//        String ss=new String(bytes,"GBK");
//        System.out.println(ss);

//
//        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("C:\\Users\\liume\\Desktop\\hrmup\\myByteStream\\fos.txt", true),"GBK");
//        outputStreamWriter.write("中国");
//        outputStreamWriter.close();
//
//        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("C:\\Users\\liume\\Desktop\\hrmup\\myByteStream\\fos.txt"));
//
//        int i;
//        while ((i = inputStreamReader.read()) != -1) {
//            System.out.print((char) i);
//        }
//
//        inputStreamReader.close();


//        ArrayList<String> arrayList=new ArrayList<String>();
//
//        arrayList.add("hello");
//        arrayList.add("world");
//        arrayList.add("java");
//
//        BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\\\Users\\\\liume\\\\Desktop\\\\hrmup\\\\myByteStream\\\\fos.txt"));
//
//        for (String s:arrayList){
//            bw.write(s);
//            bw.newLine();
//            bw.flush();
//        }
//        BufferedReader br = new BufferedReader(new FileReader("C:\\\\Users\\\\liume\\\\Desktop\\\\hrmup\\\\myByteStream\\\\fos.txt"));
//
//        ArrayList<String> arrayList = new ArrayList<String>();
//        String line;
//        while ((line = br.readLine()) != null) {
//            arrayList.add(line);
//        }
//        br.close();
//        for (String s : arrayList) {
//            System.out.print(s);
//        }



    }
}
