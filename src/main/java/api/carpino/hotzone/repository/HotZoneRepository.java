package api.carpino.hotzone.repository;

import api.carpino.hotzone.model.HotZone;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotZoneRepository extends MongoRepository<HotZone, ObjectId> {

}
