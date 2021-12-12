
package Reto3_Ciclo4.interfaces;

import Reto3_Ciclo4.modelo.Supplements;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Maicol Moreno
 */
public interface InterfaceSupplements extends MongoRepository<Supplements, String>{
    
}
