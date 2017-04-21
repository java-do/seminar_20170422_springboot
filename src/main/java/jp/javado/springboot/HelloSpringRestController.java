package jp.javado.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ueno on 2017/04/17.
 */
@RestController
public class HelloSpringRestController {

    @RequestMapping("/api/hello")
    public String hello() {
        return "Hello, JavaDo Spring-Boot World!";
    }
}
