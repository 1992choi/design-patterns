package org.example.designpatterns._02_structural._09_decorator._01_before;

public class Client {

    private CommentService commentService;

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    private void writeComment(String comment) {
        commentService.addComment(comment);
    }

    public static void main(String[] args) {
        /*
            데코레이터 패턴 적용 전
              - trim 기능이 있는 서비스와 스팸필터 기능이 있는 서비스를 동시에 사용하려고 할 경우,
                두 개 기능을 조합한 서비스가 추가로 나와야하며
                기능이 다양해질수록 조합 수 만큼 클래스의 숫자가 늘어난다는 이슈가 발생한다.

                --> 상속의 문제점 발생
         */
        Client client = new Client(new SpamFilteringCommentService());
        client.writeComment("오징어게임");
        client.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
        client.writeComment("http://whiteship.me");
    }

}
