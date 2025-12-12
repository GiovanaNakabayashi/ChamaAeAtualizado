
package service;

import dao.LoginDAO;

public class LoginService {
    
  private final LoginDAO loginDAO;

    public LoginService() {
        this.loginDAO = new LoginDAO();
    }
}