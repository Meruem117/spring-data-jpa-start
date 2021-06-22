package niit.start.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import niit.start.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User getUserById(Integer id);

    User getUserByName(String name);

    int deleteUserById(Integer id);
}
