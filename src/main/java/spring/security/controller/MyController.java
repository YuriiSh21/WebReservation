package spring.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    @GetMapping("/")
    public String getInfoForAllUsers() {
        return "view_for_all_users";
    }
    @GetMapping("/user_interface")
    public String getInterfaceOnlyForUsers() {
        return "view_for_users";
    }
    @GetMapping("/admin_interface")
    public String getInterfaceOnlyForAdmins() {
        return "view_for_admins";
    }
}
