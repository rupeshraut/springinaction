package com.dev.web.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * The Class AuthenticationCtrl.
 */
@Controller
public class AuthenticationCtrl {

    /**
     * Login.
     * 
     * @return the string
     */
    @RequestMapping("/login")
    public String login() {
        // UserDetailsImpl user = new UserDetailsImpl();
        // GrantedAuthority authority = new SimpleGrantedAuthority("manager");
        // user.getAuthorities().add(authority);
        // Authentication auth = new UsernamePasswordAuthenticationToken(user,
        // null, user.getAuthorities());
        // SecurityContextHolder.getContext().setAuthentication(auth);
        return "login";
    }


    /**
     * Welcome.
     * 
     * @return the string
     */
    @RequestMapping("/welcome")
    public String welcome() {
        return "welcome";
    }
    
    /**
     * Private page.
     *
     * @return the string
     */
    @RequestMapping("private/access")
    public String privatePage(){
        return "private/access";
    }
    
    /**
     * Private page.
     *
     * @return the string
     */
    @RequestMapping("public/access")
    public String publicPage(){
        return "public/access";
    }
}
