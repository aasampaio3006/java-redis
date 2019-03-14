package challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantServiceImpl implements RestaurantService {
	
	@Autowired
	RepositoryRestaurant repositoryRestaurant;

	@Override
	public NeighborhoodRedis findInNeighborhood(double x, double y) {
		return null;
	}

	@Override
	public RestaurantMongo findRestaurantMongoById(String id) {		
		return repositoryRestaurant.findRestaurantMongoById(id);
	}



}
