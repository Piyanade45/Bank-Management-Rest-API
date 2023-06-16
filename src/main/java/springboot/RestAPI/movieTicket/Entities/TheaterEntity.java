package springboot.RestAPI.movieTicket.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TheaterEntity {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
     private String theater_name;
     private String city;
     private String theater_type;
     private String adress;
     private String image;
     
	public TheaterEntity(int id, String theater_name, String city, String theater_type, String adress, String image) {
		super();
		this.id = id;
		this.theater_name = theater_name;
		this.city = city;
		this.theater_type = theater_type;
		this.adress = adress;
		this.image = image;
	}

	public TheaterEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTheater_name() {
		return theater_name;
	}

	public void setTheater_name(String theater_name) {
		this.theater_name = theater_name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTheater_type() {
		return theater_type;
	}

	public void setTheater_type(String theater_type) {
		this.theater_type = theater_type;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	
     
}
