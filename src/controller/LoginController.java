
package controller;


import service.LoginService;

public class LoginController {
    private final LoginService loginService;

    public LoginController() {
        this.loginService = new LoginService();   
}
}
