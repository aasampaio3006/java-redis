package challenge;

import org.springframework.data.repository.CrudRepository;

public interface RepositoryRestaurant extends CrudRepository<RestaurantMongo, String>{
	
	RestaurantMongo findRestaurantMongoById(String id);

}
