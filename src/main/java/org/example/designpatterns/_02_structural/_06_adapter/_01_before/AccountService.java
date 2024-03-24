package org.example.designpatterns._02_structural._06_adapter._01_before;

/**
 * 어댑터패턴 적용 전
 *   - 현재 앱에서 사용되는 Account 패키지의 클래스와 security 패키지에 존재하는 클래스는 상호 호환되지 않는 상태이다.
 */
public class AccountService {

    public Account findAccountByUsername(String username) {
        Account account = new Account();
        account.setName(username);
        account.setPassword(username);
        account.setEmail(username);
        return account;
    }

    public void createNewAccount(Account account) {

    }

    public void updateAccount(Account account) {

    }

}
