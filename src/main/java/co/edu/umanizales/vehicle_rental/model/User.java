package co.edu.umanizales.vehicle_rental.model;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    private String identification;
    private String name;
    private String login;
    private String password;
    private TypeUser typeUser;

    public User(String identification, String name, String login, String password, TypeUser typeUser) {
        this.identification = identification;
        this.name = name;
        this.login = login;
        this.password = password;
        this.typeUser = typeUser;
    }
}
