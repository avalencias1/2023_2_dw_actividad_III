package co.edu.udec.act3.albertovalenciasolis.gastos.repository;

import co.edu.udec.act3.albertovalenciasolis.gastos.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {

}
