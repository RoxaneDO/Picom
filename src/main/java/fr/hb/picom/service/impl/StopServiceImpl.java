package fr.hb.picom.service.impl;

import fr.hb.picom.business.Stop;
import fr.hb.picom.service.StopService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StopServiceImpl implements StopService {

private StopDao stopDao;
    @Override
    public Stop getStop(Long id) {
        return stopDao.findBy(id);
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
