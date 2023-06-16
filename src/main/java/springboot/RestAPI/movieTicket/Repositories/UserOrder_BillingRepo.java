package springboot.RestAPI.movieTicket.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;




import springboot.RestAPI.movieTicket.Entities.UserOrder_BillingEntity;

public interface UserOrder_BillingRepo extends JpaRepository<UserOrder_BillingEntity, Integer>{

}
