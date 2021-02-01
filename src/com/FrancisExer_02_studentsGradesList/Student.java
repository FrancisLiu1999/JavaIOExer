package com.FrancisExer_02_studentsGradesList;

public class Student {

    private String name;
    private int Chinese;
    private int Math;
    private int English;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return Chinese;
    }

    public void setChinese(int chinese) {
        Chinese = chinese;
    }

    public int getMath() {
        return Math;
    }

    public void setMath(int math) {
        Math = math;
    }

    public int getEnglish() {
        return English;
    }

    public void setEnglish(int english) {
        English = english;
    }

    public int getSum() {
        return this.Chinese + this.Math + this.English;
    }

    public Student(String name, int chinese, int math, int english) {
        this.name = name;
        Chinese = chinese;
        Math = math;
        English = english;
    }

    public Student() {
    }
}
