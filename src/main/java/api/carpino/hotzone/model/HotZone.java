package api.carpino.hotzone.model;


import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@Document("hot_zones")
public class HotZone {
    @Id
    private ObjectId id;
    private long createdDate;
    private long updatedDate;
    @NotNull
    private List<Zone> zones;
    @NotNull
    private Validity validity;
}
