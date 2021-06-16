package niit.start.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import niit.start.entity.User;

public interface UserDao extends JpaRepository<User, Long> {
    User getUserById(Integer id);

    User getUserByName(String name);

    int deleteUserById(Integer id);
}
