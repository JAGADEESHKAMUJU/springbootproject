package com.jagadeeshraviteja.MallService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MallController 
{
    @Autowired
    private MallService Mallservice;
    @GetMapping("/mallservice")
    public List<MallService> list()
    {
    	return Mallservice.listAll();
    }
}
