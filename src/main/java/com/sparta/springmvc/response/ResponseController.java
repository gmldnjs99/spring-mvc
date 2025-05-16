package com.sparta.springmvc.response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/response")
public class ResponseController {

    // [Response header]
    //   Content-Type: text/html
    // [Response Body]
    //   {"name":"seoungwoo", "age":99}

    @GetMapping("/json/string")
    @ResponseBody
    public String helloStringJson() {
        return "{\"name\":\"seoungwoo\",\"age\":99}";
    }

    // [Response header]
    //   Content-Type: application/json
    // [Response Body]
    //   {"name":"seoungwoo", "age":99}

    @GetMapping("/json/class")
    @ResponseBody
    public Star helloClassJson() {
        return new Star("seoungwoo", 99);
    }
}
