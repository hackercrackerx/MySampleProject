/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bigdata.controllers;

import java.security.Principal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class IndexController {
    @GetMapping("/Hello")
    @RequestMapping(method=RequestMethod.GET, value="/Hello")
    
    public String hello(){
        return "hello";
    }
     @RequestMapping("/user")
  public Principal user(Principal principal) {
    return principal;
  }
    
}
