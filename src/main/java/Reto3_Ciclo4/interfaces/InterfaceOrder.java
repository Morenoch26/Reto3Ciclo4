package Reto3_Ciclo4.interfaces;

import Reto3_Ciclo4.modelo.Order;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Maicol Moreno
 */
public interface InterfaceOrder extends MongoRepository<Order, Integer> {
   List<Order> findBySalesManZone(String zone);
   
   
}
