package com.acm.ServiceRibbon.Controller;

import com.acm.ServiceRibbon.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author anchunming
 * @create 2018/9/7 0007 下午 5:16
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;


    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){

        return helloService.hiService(name);
    }


}
