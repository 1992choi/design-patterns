package org.example.designpatterns._02_structural._06_adapter._01_before.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
