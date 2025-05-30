package dao.impl;

import dao.UserDAO;
import model.User;
import utils.DBConnection;

public class UserDAOImpl {

    @Override
    public User findByUsername(String username) {
        User user = null;

        String sql = "SELECT * FROM users WHERE username = ?";
        


    }


}
