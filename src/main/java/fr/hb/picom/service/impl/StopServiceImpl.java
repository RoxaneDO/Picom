package fr.hb.picom.service.impl;

import fr.hb.picom.business.Stop;
import fr.hb.picom.dao.StopDao;
import fr.hb.picom.service.StopService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StopServiceImpl implements StopService {
private StopDao stopDao;
    @Override
    public Stop getStop(Integer id) {
        return stopDao.findById(id).orElse(null);
    }

    @Override
    public List<Stop> getStops() {
        return stopDao.findAll();
    }

    @Override
    public Stop addStop(Stop stop) {
        return stopDao.save(stop);
    }

}
