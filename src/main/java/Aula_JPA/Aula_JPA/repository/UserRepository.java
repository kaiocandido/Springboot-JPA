package Aula_JPA.Aula_JPA.repository;

import Aula_JPA.Aula_JPA.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
