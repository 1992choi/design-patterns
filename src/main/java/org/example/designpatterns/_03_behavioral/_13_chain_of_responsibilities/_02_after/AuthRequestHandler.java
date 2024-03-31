package org.example.designpatterns._03_behavioral._13_chain_of_responsibilities._02_after;

import org.example.designpatterns._03_behavioral._13_chain_of_responsibilities._01_before.Request;

public class AuthRequestHandler extends RequestHandler {

    public AuthRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("인증이 되었는가?");
        super.handle(request);
    }

}
