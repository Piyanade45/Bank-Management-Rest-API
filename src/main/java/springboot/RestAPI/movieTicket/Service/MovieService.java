package springboot.RestAPI.movieTicket.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot.RestAPI.movieTicket.Entities.MovieEntity;
import springboot.RestAPI.movieTicket.Repositories.MovieRepo;

@Service
public class MovieService {
	
    @Autowired
    MovieRepo movieRepo;
    
    public List<MovieEntity> addMovieName(MovieEntity movieEntity) {

		try {
			movieRepo.save(movieEntity);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return movieRepo.findAll();
	}



}
