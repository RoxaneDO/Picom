package fr.hb.picom.business;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Advert {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String resume;

    private LocalDate dateBegin;

    private Integer nbDay;

    @ManyToOne
    private User user;
}
