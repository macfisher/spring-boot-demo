package com.macfisher;

import com.abc.foo.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController
{
    /*@Autowired // don't use this--not good for testing
    private NotificationService notificationService;*/

    private NotificationService notificationService;

    @Value("${pageController.msg}")
    private String pageControllerMsg;

    @Value("${my.secret}")
    private String mySecret;

    @Autowired
    public PageController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    /*@Autowired // injects NotificationService into setter function
    public void setNotificationService(NotificationService notificationService)
    {
        this.notificationService = notificationService;
    }*/

    @RequestMapping("/")
    public String home() { return notificationService.toString(); }

    @RequestMapping("message")
    public String message() { return pageControllerMsg; }

    @RequestMapping("secret")
    public String secret() { return mySecret; }
}
