package fr.hb.picom.service.impl;

import fr.hb.picom.business.Zone;
import fr.hb.picom.service.ZoneService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZoneServiceImpl implements ZoneService {

    private ZoneDao zoneDao;
    @Override
    public Zone getZone(Long id) {
        return zoneDao.findBy(id);
    }

    @Override
    public List<Zone> getZones() {
        return zoneDao.findAll();
    }

    @Override
    public Zone addZone(Zone zone) {
        return zoneDao.save(zone);
    }
}
