package com.bookee.bookee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookee.bookee.entity.UserEo;
import com.bookee.bookee.properities.LibraryProperities;
import com.bookee.bookee.properities.WebSite;
import com.bookee.bookee.service.MessageService;
import com.bookee.bookee.service.UserService;
import com.bookee.event.MessagePublisher;
import com.bookee.factory.MessageServiceStrategyFactory;

@RestController
@RequestMapping(value = "/system/user")
public class UserController {
    @Autowired
    UserService userService;
    
    @Autowired
    MessagePublisher messagePublisher;
    
    @Autowired
    LibraryProperities libraryProperities;
    
    @Autowired
    WebSite webSite;

    @RequestMapping("selectOne")
    public List<UserEo> selectOne(UserEo userEo){
        return userService.selectOne(userEo);
    }
    
    @RequestMapping("sendMessage")
    public String sendMessage(String userType,String taskTypeCode) throws Exception{
        MessageService service =  MessageServiceStrategyFactory.getMessageByUserType(userType);
        return service.sendMessage(taskTypeCode);
    }
    
    @RequestMapping("publishMessage")
    public void publishMessage(String message){
    	System.out.println(libraryProperities.getLocation());
    	System.out.println(libraryProperities.getBooks());
    	System.out.println(webSite.getUrl());
    	messagePublisher.publish(message);
    }
    
    @RequestMapping("oldLogin")
    public String oldLogin(){
    	return "oldLogin";
    }
    
    @RequestMapping("login")
    public String login(){
    	return "login";
    }
}
