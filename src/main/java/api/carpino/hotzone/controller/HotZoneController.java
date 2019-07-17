package api.carpino.hotzone.controller;

import api.carpino.hotzone.model.HotZone;
import api.carpino.hotzone.service.HotZoneService;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/v1/zone")
public class HotZoneController {
    @Autowired
    private HotZoneService hotZoneService;

    @PostMapping(path = "save")
    public ResponseEntity saveZone(@Valid @RequestBody()HotZone hotZone){
        hotZoneService.saveHotZone(hotZone);
        return new ResponseEntity<>(JsonNodeFactory.instance.objectNode().put("message", "zones saved!"), HttpStatus.OK);
    }
}
