package springboot.RestAPI.movieTicket.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserOrderEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String created_date;
	private int movie_id;
	private double order_Ammount;
	private double paid_Ammount;
	private String pay_Status;
	
	
	public UserOrderEntity(int id, String created_date, int movie_id, double order_Ammount, double paid_Ammount,
			String pay_Status) {
		super();
		this.id = id;
		this.created_date = created_date;
		this.movie_id = movie_id;
		this.order_Ammount = order_Ammount;
		this.paid_Ammount = paid_Ammount;
		this.pay_Status = pay_Status;
	}
	public UserOrderEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCreated_date() {
		return created_date;
	}
	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}
	public int getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}
	public double getOrder_Ammount() {
		return order_Ammount;
	}
	public void setOrder_Ammount(double order_Ammount) {
		this.order_Ammount = order_Ammount;
	}
	public double getPaid_Ammount() {
		return paid_Ammount;
	}
	public void setPaid_Ammount(double paid_Ammount) {
		this.paid_Ammount = paid_Ammount;
	}
	public String getPay_Status() {
		return pay_Status;
	}
	public void setPay_Status(String pay_Status) {
		this.pay_Status = pay_Status;
	}
	
	
}
