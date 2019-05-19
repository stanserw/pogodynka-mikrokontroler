package pl.sda.weathermicrocontroller.controllers;

import org.springframework.web.bind.annotation.*;
import pl.sda.weathermicrocontroller.model.User;
import pl.sda.weathermicrocontroller.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping(UserController.APP_USER_PATH)
public class UserController {

    static final String APP_USER_PATH = "/users";

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/add") // Map ONLY GET Requests
    public @ResponseBody
    String addNewUser(@RequestParam String name, @RequestParam String email) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        User n = new User();
        n.setName(name);
        n.setEmail(email);
        userRepository.save(n);
        return "Saved";
    }

    @GetMapping("/all")
    public @ResponseBody
    Iterable<User> getAllUsers() {
        // This returns a JSON or XML with the users
        return userRepository.findAll();
    }

    @GetMapping("/get")
    public @ResponseBody
    Iterable<User> getAllUsersByName(@RequestParam String name) {
        // This returns a JSON or XML with the users
        return userRepository.findUserByName(name);
    }

    @GetMapping("/find")
    public @ResponseBody
    Iterable<User> getAllByName(@RequestParam String name) {
        // This returns a JSON or XML with the users
        return userRepository.find(name);
    }
}
