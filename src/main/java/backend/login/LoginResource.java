package backend.login;

import backend.model.User;
import backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/login")
public class LoginResource {

    private final UserService userService;
    private final LoginService loginService;


    public LoginResource(UserService userService, LoginService loginService) {
        this.userService = userService;
        this.loginService = loginService;
    }


    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/user")
    public ResponseEntity<Login> einloggen(@RequestBody Login login) {

        //Benutzername oder Email
        //und Passwort wird im Frontend verschlüsselt

        if(login != null) {
            Optional<User> opUser =  loginService.findActiveUser(passwordDecoder(login.getPassword()), login.getUsername(), login.getEmail());
            if(opUser.isEmpty()) {
                System.out.println("User wrude gefunden!");
                System.out.println(opUser.get().toString());
            }
        }
        else {
            System.out.println("User wurde nicht gefunden!");
        }










        return new ResponseEntity<>(login, HttpStatus.CREATED);
    }

    public String passwordDecoder(String password) {
        return password;
    }


}
