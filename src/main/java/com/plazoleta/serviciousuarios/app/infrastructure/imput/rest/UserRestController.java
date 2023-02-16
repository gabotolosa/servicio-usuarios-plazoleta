package com.plazoleta.serviciousuarios.app.infrastructure.imput.rest;

import com.plazoleta.serviciousuarios.app.application.dto.request.UserRequestDto;
import com.plazoleta.serviciousuarios.app.application.dto.response.UserResponseDto;
import com.plazoleta.serviciousuarios.app.application.handler.IUserHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserRestController {
    private final IUserHandler userHandler;

    @PostMapping("/")
    public ResponseEntity<Void> saveUser(@RequestBody UserRequestDto userRequestDto){
        userHandler.saveUser(userRequestDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/")
    public ResponseEntity<List<UserResponseDto>> getAllUsers(){
        return ResponseEntity.ok(userHandler.getAllUsers());
    }
}
