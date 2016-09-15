package cn.wanglijie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mating on 2016/9/15.
 */

@RestController
@EnableAutoConfiguration

public class Example {

    @RequestMapping("/")
    String home() {
        return "Hello Word Wanglijie !";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class,args);


    }
}
