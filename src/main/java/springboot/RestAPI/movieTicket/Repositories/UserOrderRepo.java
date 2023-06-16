package springboot.RestAPI.movieTicket.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot.RestAPI.movieTicket.Entities.UserOrderEntity;

public interface UserOrderRepo extends JpaRepository<UserOrderEntity, Integer>{

}
