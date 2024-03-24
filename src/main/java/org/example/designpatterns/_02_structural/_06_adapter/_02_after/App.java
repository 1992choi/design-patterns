package org.example.designpatterns._02_structural._06_adapter._02_after;

import org.example.designpatterns._02_structural._06_adapter._02_after.security.LoginHandler;
import org.example.designpatterns._02_structural._06_adapter._02_after.security.UserDetailsService;

public class App {

    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String login = loginHandler.login("choi", "choi");
        System.out.println(login);
    }

}
