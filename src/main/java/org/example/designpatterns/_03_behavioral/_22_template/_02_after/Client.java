package org.example.designpatterns._03_behavioral._22_template._02_after;

public class Client {

    public static void main(String[] args) {
        FileProcessor fileProcessor = new Plus("number.txt");
        int result = fileProcessor.process();
        System.out.println(result); // 15

        fileProcessor = new Multiply("number.txt");
        result = fileProcessor.process();
        System.out.println(result); // 0
    }

}
