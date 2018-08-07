package com.abc.foo;

import org.springframework.stereotype.Service;

@Service // can give a service name, else class name is default
public class NotificationService
{
    public NotificationService() {}
    public void send() {}
    public void sendAsync() {}

    @Override
    public String toString() { return "NotificationService{}"; }
}
