package com.linchproject.http;

/**
 * @author Georg Schmidl
 */
public interface SessionService {

    String getValue();

    void setValue(String key);
}
