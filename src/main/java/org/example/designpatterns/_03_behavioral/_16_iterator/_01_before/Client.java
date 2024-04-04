package org.example.designpatterns._03_behavioral._16_iterator._01_before;

import java.util.Collections;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        /*
            이터레이터 패턴 적용 전
              - Board에 있는 Post를 순회하기 위해서는 클라이언트는 Board를 구조를 알고 있어야지 순회가 가능하다.
                만약 Board 내부적으로 List<Post>가 Set<Post>으로 변경된다면, 클라이언트 코드 수정도 불가피할 수 밖에 없다.
         */
        Board board = new Board();
        board.addPost("디자인 패턴 게임");
        board.addPost("선생님, 저랑 디자인 패턴 하나 학습하시겠습니까?");
        board.addPost("지금 이 자리에 계신 여러분들은 모두 디자인 패턴을 학습하고 계신 분들입니다.");

        // TODO 들어간 순서대로 순회하기
        List<Post> posts = board.getPosts();
        for (int i = 0 ; i < posts.size() ; i++) {
            Post post = posts.get(i);
            System.out.println(post.getTitle());
        }

        // TODO 가장 최신 글 먼저 순회하기
        Collections.sort(posts, (p1, p2) -> p2.getCreatedDateTime().compareTo(p1.getCreatedDateTime()));
        for (int i = 0 ; i < posts.size() ; i++) {
            Post post = posts.get(i);
            System.out.println(post.getTitle());
        }
    }

}
