package salepoint.test;

import salepoint.model.User;
import salepoint.persistence.dao.UserDAO;

/**
 *
 * @author Cristian Ramírez
 */
public class CRUDTesting {

    public static void main(String[] args) {
        User user = new User("admin", "asd", "Cristian", "Ramírez", true, true, true, true);
        UserDAO userDAO = new UserDAO();
        System.out.println(userDAO.save(user) + "");
    }
    
}
