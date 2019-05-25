package pl.sda.weathermicrocontroller.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.sda.weathermicrocontroller.model.User;
import pl.sda.weathermicrocontroller.repository.UserRepository;

import java.util.List;

@RequestMapping(UserMvcController.APP_USERS_PATH)
@Controller
public class UserMvcController {

    static final String APP_USERS_PATH = "/app/users";
    private UserRepository userRepository;

    public UserMvcController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public String getAllUsersView(Model listViewModel) {

        // get users from db
        List<User> users = (List<User>) userRepository.findAll();

        // adduser to the spring model
        listViewModel.addAttribute("users", users);

        return "users-list";
    }
}
