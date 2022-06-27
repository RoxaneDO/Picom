package fr.hb.picom.dao;

import fr.hb.picom.business.Stop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StopDao extends JpaRepository<Stop, Integer> {
}