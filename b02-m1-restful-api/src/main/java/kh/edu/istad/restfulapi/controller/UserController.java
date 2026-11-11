package kh.edu.istad.restfulapi.controller;

import kh.edu.istad.restfulapi.dto.UserCreateRequest;
import kh.edu.istad.restfulapi.dto.UserResponse;
import kh.edu.istad.restfulapi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable UUID id){
        userService.deleteById(id);
    }

    @ResponseStatus(HttpStatus.CREATED) // customize response status code
    @PostMapping
    public UserResponse create(@RequestBody UserCreateRequest userCreateRequest) {
        return userService.create(userCreateRequest);
    }


    @GetMapping
    public List<UserResponse> getAll() {

        return userService.getAll();
    }

}
