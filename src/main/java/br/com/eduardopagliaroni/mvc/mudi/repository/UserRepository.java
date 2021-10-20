package br.com.eduardopagliaroni.mvc.mudi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.eduardopagliaroni.mvc.mudi.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	User findByUsername(String username);

}
