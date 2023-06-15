package vladislav.Boot.servise;

import org.springframework.transaction.annotation.Transactional;
import vladislav.Boot.model.User;


import java.util.List;

public interface UserServise {


    List<User> getAllPeople();


    User personById(Long id);


    User save(User user);

    User update(User user);

    void delete(Long id);
}
