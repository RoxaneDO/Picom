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
    public Stop getStop(Long id) {
        return null;
    }

    @Override
    public List<Stop> getStops() {
        return null;
    }
}
