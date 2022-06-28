package fr.hb.picom.controller;
import java.util.List;

import fr.hb.picom.business.Zone;
import fr.hb.picom.service.ZoneService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class ZoneController {

    private final ZoneService zoneService;

    @GetMapping("zones")
    public List<Zone> zonesGet() { return zoneService.getZones();}

    @GetMapping("zones/{id}")
    public Zone zonesGet(@PathVariable Integer id) { return  zoneService.getZone(id);}

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("zones")
    public Zone zonesPost(@RequestBody Zone zone) { return zoneService.addZone(zone);}
}
