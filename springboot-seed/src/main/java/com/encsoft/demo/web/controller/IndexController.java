package com.encsoft.demo.web.controller;

import com.encsoft.demo.annotation.Authenticated;
import com.encsoft.demo.model.User;
import com.encsoft.demo.service.UserService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Authenticated
@RequestMapping("/user")
public class IndexController extends BaseController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String find(Model model) {
        List<User> userList = userService.listAllUser();
        model.addAttribute("userList" , userList);
        return "index";
    }

}
