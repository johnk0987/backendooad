package bookweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bookweb.model.*;


@Repository
public interface AccountRepository extends JpaRepository<Account, Integer>{

}
