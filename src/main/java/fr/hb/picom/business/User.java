package fr.hb.picom.business;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @NotBlank(message="Veuillez préciser votre nom")
    private String name;

    @NotBlank(message="Veuillez préciser votre prénom")
    private String firstname;

    @Email(message="Merci de préciser une adresse email au bon format")
    @NotBlank(message="Merci de préciser une adresse email")
    @Column(unique=true)
    private String email;

    @Size(min=3, message="Le mot de passe doit comporter au moins trois caractères")
    private String password;

    private String phone;

    @OneToMany(mappedBy = "user")
    private List<Advert> advertList;

}
