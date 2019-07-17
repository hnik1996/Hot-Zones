package api.carpino.hotzone.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.geo.GeoJsonPolygon;

@Getter
@Setter
public class Zone {
    private GeoJsonPolygon polygon;
    private String color;
}
