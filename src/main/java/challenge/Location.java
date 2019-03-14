package challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Location {

	private final String type;
	private List<Double[]> coordinates = new ArrayList<Double[]>();
	
	private Location(String type) {
		this.type = type;
	}
	
	public static Location of(String type) {
		return new Location(type);
	}
	
	public String getType() {
		return type;
	}
	
	public Location addCoordinates(final double longitude, final double latitude) {
		Double[] coordinate = { longitude, latitude }; 
		this.coordinates.add(coordinate);
		return this;
	}
	
	public List<Double[]> getCoordinates() {
		return coordinates;
	}

	@Override
	public int hashCode() {
		return Objects.hash(coordinates, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Location other = (Location) obj;
		return Objects.equals(coordinates, other.coordinates) && Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Location [type=").append(type).append(", coordinates=").append(coordinates).append("]");
		return builder.toString();
	}
	
	
}
