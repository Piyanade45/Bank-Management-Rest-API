package springboot.RestAPI.movieTicket.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot.RestAPI.movieTicket.Entities.MovieEntity;

public interface MovieRepo extends JpaRepository<MovieEntity, Integer>{

}
