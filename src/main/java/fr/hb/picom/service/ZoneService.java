package fr.hb.picom.service;

import fr.hb.picom.business.Zone;
import java.util.List;

public interface ZoneService {

    Zone getZone(Long id);
    List<Zone> getZones();
    Zone addZone(Zone zone);

}
