package springboot.RestAPI.movieTicket.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot.RestAPI.movieTicket.Entities.TheaterEntity;

public interface TheaterRepo extends JpaRepository<TheaterEntity, Integer> {

}
