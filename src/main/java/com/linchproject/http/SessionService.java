package com.linchproject.http;

/**
 * @author Georg Schmidl
 */
public interface SessionService {

    String getValue(String key);

    void setValue(String key, String value);
}
