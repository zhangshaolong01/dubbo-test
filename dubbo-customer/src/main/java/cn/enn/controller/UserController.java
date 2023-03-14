package cn.enn.controller;

import java.util.List;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.enn.bean.User;
import cn.enn.service.ProviderService;

@RestController
@RequestMapping("/user")
public class UserController {

	@DubboReference
    private ProviderService providerService;

    @RequestMapping(value = "/get", method = RequestMethod.POST)
    public List<User> getUsers(){
        return providerService.getUser();
    }
    
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public void insert(@RequestBody User user){
        providerService.insert(user);
    }

}
