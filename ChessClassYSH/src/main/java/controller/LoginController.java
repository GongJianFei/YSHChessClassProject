package controller;

import com.sun.org.apache.xpath.internal.SourceTree;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import service.LoginService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Created by Jeff on 2018/11/13.
 */
@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/a/login")
    public String login(Model model, HttpServletResponse response, HttpServletRequest request)
                       /*, @PathVariable("id") Integer id)*/ {
        User u = loginService.login();
        model.addAttribute("name",u.getName());
        System.out.println("conconcn"+u.getName());
        return "a";
    }
}
