package co.edu.umanizales.vehicle_rental.service;


import org.example.vehicle_rental.model.TypeUser;
import org.example.vehicle_rental.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserManagementServices {

    private List<User> listUser = new ArrayList<>();
    private List<TypeUser> listTypeUser = new ArrayList<>();

    public void GestionUsuarioService() {
        // Inicializar algunos tipos de usuario
        listTypeUser.add(new TypeUser("1", "Administrator"));
        listTypeUser.add(new TypeUser("2", "Customer"));

        // Agregar usuarios iniciales
        listUser.add(new User("123456789", "Miguel Santafe", "miguel", "password123", listTypeUser.get(0)));
        listUser.add(new User("987654321", "Maria López", "maria", "pass456", listTypeUser.get(1)));
    }
    public void registerUser(User user) {
        listUser.add(user);
    }

    public boolean validateUser(String login, String password) {
        for (User user : listUser) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

}
