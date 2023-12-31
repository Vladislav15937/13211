package vladislav.Boot.servise;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vladislav.Boot.dao.UserDAO;
import vladislav.Boot.model.User;


import java.util.List;

@Service
public class UserServiseImpl implements UserServise {

   private final UserDAO userDAO;

    public UserServiseImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> getAllPeople() {
        return userDAO.getAllPeople();
    }

    @Override
    public User personById(Long id) {
        return userDAO.personById(id);
    }

    @Override
    @Transactional
    public User save(User user) {
       return userDAO.save(user);
    }

    @Override
    @Transactional
    public User update(User user) {
       return userDAO.update(user);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        userDAO.delete(id);
    }
}
