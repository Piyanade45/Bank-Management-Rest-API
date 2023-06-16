package springboot.RestAPI.movieTicket.Entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class MovieEntity {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
	
     private String movie_name;
     private double code;
     private double screen_number;
     private String language;
     private String director_name;
     private String start_Casting_names;
     private double price;
     private String image;
     
	public MovieEntity(int id, String movie_name, double code, double screen_number, String language,
			String director_name, String start_Casting_names, double price, String image) {
		super();
		this.id = id;
		this.movie_name = movie_name;
		this.code = code;
		this.screen_number = screen_number;
		this.language = language;
		this.director_name = director_name;
		this.start_Casting_names = start_Casting_names;
		this.price = price;
		this.image = image;
	}

	public MovieEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMovie_name() {
		return movie_name;
	}

	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}

	public double getCode() {
		return code;
	}

	public void setCode(double code) {
		this.code = code;
	}

	public double getScreen_number() {
		return screen_number;
	}

	public void setScreen_number(double screen_number) {
		this.screen_number = screen_number;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getDirector_name() {
		return director_name;
	}

	public void setDirector_name(String director_name) {
		this.director_name = director_name;
	}

	public String getStart_Casting_names() {
		return start_Casting_names;
	}

	public void setStart_Casting_names(String start_Casting_names) {
		this.start_Casting_names = start_Casting_names;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
     
	
}
