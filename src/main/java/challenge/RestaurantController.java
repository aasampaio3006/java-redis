package challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RestaurantController {

	@Autowired
	private RestaurantService service;

//	@GetMapping("/restaurants/findInNeighborhood/{longitude}/{latitude}")
//	public NeighborhoodRedis findInNeighborhood(@PathVariable("longitude") Double longitude, @PathVariable("latitude") Double latitude ) {
//		return service.findInNeighborhood(longitude, latitude);
//	}
//	
	@GetMapping("/restaurants/{id}")
	public RestaurantMongo findRestaurantMongoById(@PathVariable("id") String id) {
		return service.findRestaurantMongoById(id);
		
	}
	
			

}
