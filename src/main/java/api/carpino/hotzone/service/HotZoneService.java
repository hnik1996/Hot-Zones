package api.carpino.hotzone.service;

import api.carpino.hotzone.model.HotZone;
import api.carpino.hotzone.repository.HotZoneRepository;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

@Slf4j
@Service
public class HotZoneService {
    private HotZoneRepository hotZoneRepository;

    private SimpleDateFormat simpleDateFormat;

    @Autowired
    public HotZoneService(HotZoneRepository hotZoneRepository) {
        this.hotZoneRepository = hotZoneRepository;
        this.simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    }

    public HotZone findById(ObjectId objectId) {
        Optional<HotZone> hotZone = hotZoneRepository.findById(objectId);
        return hotZone.orElseGet(HotZone::new);
    }

    public ObjectId saveHotZone(HotZone hotZone){
        hotZone.setCreatedDate(new Date().getTime());
        hotZone.setUpdatedDate(new Date().getTime());

//        try {
//            simpleDateFormat.parse(hotZone.getValidity().getFrom());
//            simpleDateFormat.parse(hotZone.getValidity().getTo());
//        }catch (ParseException ex){
//            log.error("date not in valid format {}",ex.getMessage());
//        }

        log.debug("hot zone saved successfully");

        return hotZoneRepository.save(hotZone).getId();
    }
}
