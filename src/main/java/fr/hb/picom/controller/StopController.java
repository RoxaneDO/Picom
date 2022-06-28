package fr.hb.picom.controller;
import java.util.List;

import fr.hb.picom.business.Stop;
import fr.hb.picom.service.StopService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import lombok.AllArgsConstructor;
    @RestController
    @RequestMapping("/api/")
    @AllArgsConstructor
public class StopController {
    private final StopService stopService;

    @GetMapping("stops")
    public List<Stop> zonesGet() {
        return stopService.getStops();
    }

    @GetMapping("stops/{id}")
    public Stop stopsGet(@PathVariable Integer id) {
        return stopService.getStop(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("stops")
    public Stop zonesPost(@RequestBody Stop stop) {
        return stopService.addStop(stop);
    }

}
