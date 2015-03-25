package com.main;

import com.one.OneService;
import com.two.TwoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zilongye on 15-3-24.
 */
@RestController
@RequestMapping("/zl")
public class Controller {

    @Autowired
    OneService oneService;
    @Autowired
    TwoService twoService;

    @RequestMapping
    public Object get(){
        System.out.println("one is :" + oneService.count());
        System.out.println("two is :" + twoService.count());
        return "ok";
    }
}
