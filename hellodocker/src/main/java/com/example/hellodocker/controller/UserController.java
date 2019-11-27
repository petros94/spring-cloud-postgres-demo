package com.example.hellodocker.controller;
import com.example.hellodocker.controller.dto.UserDTO;
import com.example.hellodocker.model.User;
import com.example.hellodocker.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;

@RestController
@CrossOrigin
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    @ResponseBody
    List<User> getAllUsers(@RequestParam(value = "email", required = false) String email){
        return Optional.ofNullable(email).isPresent() ?
                Collections.singletonList(userService.findByEmail(email).orElseGet(User::new)) :
                userService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseBody
    User getUserByEmail(@PathVariable UUID id){
        return userService.findById(id).orElseGet(User::new);
    }

    @PostMapping
    @ResponseBody
    User saveUser(@Valid @RequestBody UserDTO user){
        return userService.save(user);
    }

}
