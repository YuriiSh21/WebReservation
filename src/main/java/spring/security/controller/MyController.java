package spring.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class MyController {
    @GetMapping("/")
    public String getInfoForAllUsers() {
        return "view_for_all_users";
    }
    @GetMapping("/user_interface")
    public String getInterfaceOnlyForUsers(Model model) {
        Date correctDate = new Date();
        model.addAttribute("correctDate", correctDate);
        return "view_for_users";
    }
    @GetMapping("/admin_interface")
    public String getInterfaceOnlyForAdmins() {
        return "view_for_admins";
    }
}
