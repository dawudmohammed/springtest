package com.example.Test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test/{id}")
    public String index(@PathVariable int id){
         String status = null;
        if(id==1){
            status = "this is dawud";
        }else if(id==2){
            status = "this is edem";
        }else if(id==3){
            status = "this is beneth";
        }
        return status;
    }
}
