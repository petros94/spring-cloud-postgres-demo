package com.example.userservice.controller;
import com.example.userservice.controller.dto.UserDTO;
import com.example.userservice.model.User;
import com.example.userservice.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    @ResponseBody
    @CrossOrigin
    List<User> getAllUsers(@RequestParam(value = "email", required = false) String email){
        return Optional.ofNullable(email).isPresent() ?
                Collections.singletonList(userService.findByEmail(email).orElseGet(User::new)) :
                userService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseBody
    @CrossOrigin
    User getUserByEmail(@PathVariable UUID id){
        return userService.findById(id).orElseGet(User::new);
    }

    @PostMapping
    @ResponseBody
    @CrossOrigin
    User saveUser(@Valid @RequestBody UserDTO user){
        return userService.save(user);
    }

}
