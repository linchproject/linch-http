package com.linchproject.http;

/**
 * @author Georg Schmidl
 */
public interface CookieService {

    void addCookie(String name, String value, int maxAge);

    void removeCookie(String name);

    String getCookieValue(String name);
}
