package org.example.designpatterns._02_structural._10_facade._02_after;

public class Client {

    public static void main(String[] args) {
        /*
            퍼사드 패턴 적용
              - 현재는 메일을 호출하는 클라이언트가 1개 밖에 없어서 패턴의 장점이 없는 것 같지만 (=단순히 클라이언트에 있던 코드를 뒷편으로 빼낸 것처럼 보임),
                메일을 보내는 클라이언트가 다수라면 퍼사드 패턴은 의미가 있게 된다.
                가령 설정 정보를 셋팅하는 로직이 변경된다고 가정했을 때, 패턴이 적용되어 있지 않다면 반복적으로 코드 수정을 해야할 수도 있게 된다.
         */
        EmailSettings emailSettings = new EmailSettings();
        emailSettings.setHost("127.0.0.1");

        EmailSender emailSender = new EmailSender(emailSettings);

        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setFrom("keesun");
        emailMessage.setTo("whiteship");
        emailMessage.setCc("일남");
        emailMessage.setSubject("오징어게임");
        emailMessage.setText("밖은 더 지옥이더라고..");

        emailSender.sendEmail(emailMessage);
    }
}
