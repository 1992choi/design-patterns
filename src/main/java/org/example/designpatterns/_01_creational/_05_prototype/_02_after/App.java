package org.example.designpatterns._01_creational._05_prototype._02_after;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();
        repository.setUser("whiteship");
        repository.setName("live-study");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가.");

        String url = githubIssue.getUrl();
        System.out.println(url);

        GithubIssue clone = (GithubIssue) githubIssue.clone();
        System.out.println(clone.getUrl());

        /*
            clone의 특징
              - x.clone() != x
              - x.clone().getClass() == x.getClass()
              - x.clone().equals(x)
              - 얕은 복사로 인하여 GithubRepository는 동일. (깊은 복사를 위해서는 clone() 재정의 필요)
         */
        System.out.println(clone != githubIssue);
        System.out.println(clone.getClass() == githubIssue.getClass());
        System.out.println(clone.equals(githubIssue));
        System.out.println(clone.getRepository() == githubIssue.getRepository());
    }

}
