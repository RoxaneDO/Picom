package fr.hb.picom.service;

import fr.hb.picom.business.Stop;

import java.util.List;

public interface StopService {
    Stop getStop(Long id);
    List<Stop> getStops();

    Stop addStop(Stop stop);
}
