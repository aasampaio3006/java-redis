package challenge;

import org.springframework.data.repository.CrudRepository;

public interface NeighborhoodRepository extends CrudRepository<NeighborhoodMongo, String>{
	
	NeighborhoodMongo findNeighborhoodMongoById(String name);

}
