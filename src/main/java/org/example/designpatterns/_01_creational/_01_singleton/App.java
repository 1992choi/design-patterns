package org.example.designpatterns._01_creational._01_singleton;

import java.io.*;

public class App {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*
            Settings4 클래스는 리플렉션 및 직렬화/역직렬화에 안전하지 못하다.
            Settings5 클래스와 같이 Enum을 사용할 경우, 리플렉션 및 직렬화/역직렬화에 안전하게 된다.
            (아래 코드는 직렬화/역직렬화에 안전함을 증명하는 코드이며, Settings5 대신에 4를 사용할 경우 결과값이 true에서 false로 바뀌는 것을 확인할 수 있다.
         */
        Settings5 settings = Settings5.INSTANCE;

        Settings5 settings1 = null;
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings1 = (Settings5) in.readObject();
        }

        System.out.println("result : " + (settings == settings1));
    }

}
