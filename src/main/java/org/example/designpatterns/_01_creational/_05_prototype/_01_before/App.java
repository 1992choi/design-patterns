package org.example.designpatterns._01_creational._05_prototype._01_before;

public class App {

    public static void main(String[] args) {
        GithubRepository repository = new GithubRepository();
        repository.setUser("whiteship");
        repository.setName("live-study");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가.");

        String url = githubIssue.getUrl();
        System.out.println(url);

        /*
            프로토타입 패턴 적용 전
              - 새로운 이슈를 등록하기 위해서는 생성자를 통해 아래와 같이 동일한 코드를 작성해야한다.
              - 지금은 ID와 Title 필드 밖에 없지만, 여러 필드가 존재한다고 가정하고 주차별로 ID와 Title만 변경된다면, 다른 필드들은 중복되는 값임에도 불구하고 계속 작성을 해줘야할 것이다.
                만약 프로토타입 패턴을 적용한다면 이런 문제를 보완할 수 있다.
         */
        GithubIssue newGithubIssue = new GithubIssue(repository);
        newGithubIssue.setId(2);
        newGithubIssue.setTitle("2주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가. (2)");

        String newUrl = newGithubIssue.getUrl();
        System.out.println(newUrl);

    }

}
