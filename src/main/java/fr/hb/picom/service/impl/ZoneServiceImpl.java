package fr.hb.picom.service.impl;

import fr.hb.picom.business.Zone;
import fr.hb.picom.dao.ZoneDao;
import fr.hb.picom.service.ZoneService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ZoneServiceImpl implements ZoneService {

    private ZoneDao zoneDao;
    @Override
    public Zone getZone(Integer id) {
        return zoneDao.findById(id).orElse(null);
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
