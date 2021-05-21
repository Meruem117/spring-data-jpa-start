package niit.start.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import niit.start.bean.User;

public interface UserDao extends JpaRepository<User, Long> {
    User getUserById(int id);

    User getUserByName(String name);
}
