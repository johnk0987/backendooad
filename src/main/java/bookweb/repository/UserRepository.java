package bookweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bookweb.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
