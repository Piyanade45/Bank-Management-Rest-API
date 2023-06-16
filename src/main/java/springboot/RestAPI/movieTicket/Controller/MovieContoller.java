package springboot.RestAPI.movieTicket.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springboot.RestAPI.movieTicket.Entities.MovieEntity;
import springboot.RestAPI.movieTicket.Service.MovieService;

@RestController
@RequestMapping("movie")
public class MovieContoller {
    
	@Autowired
	MovieService movieService;
	
	@PostMapping("/save")
	public ResponseEntity<List<MovieEntity>> addAccount(@RequestBody MovieEntity movieEntity) {
		return ResponseEntity.status(HttpStatus.OK).body(movieService.addMovieName(movieEntity));
	}
	
}
