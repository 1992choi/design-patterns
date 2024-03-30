package org.example.designpatterns._03_behavioral._22_template._01_before;

public class Client {

    public static void main(String[] args) {
        /*
            템플릿 메소드 패턴 적용 전
              - 기존 덧셈 기능 이외에 곱셈 기능을 추가하고자 할 때,
                덧셈 코드와 대부분이 중복되는 곱셈 기능의 클래스가 추가되었다.
         */
        FileProcessor fileProcessor = new FileProcessor("number.txt");
        int result = fileProcessor.process();
        System.out.println(result); // 15

        MultuplyFileProcessor multuplyFileProcessor = new MultuplyFileProcessor("number.txt");
        result = multuplyFileProcessor.process();
        System.out.println(result); // 120
    }

}
