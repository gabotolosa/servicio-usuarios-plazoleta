package com.plazoleta.serviciousuarios.app.infrastructure.imput.rest;

import com.plazoleta.serviciousuarios.app.application.dto.request.RoleRequestDto;
import com.plazoleta.serviciousuarios.app.application.dto.response.RoleResponseDto;
import com.plazoleta.serviciousuarios.app.application.handler.impl.RoleHandler;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/roles")
@RequiredArgsConstructor
public class RoleRestController {

    private final RoleHandler roleHandler;

    @Operation(summary = "Add a new Role")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Role created", content = @Content),
            @ApiResponse(responseCode = "409", description = "Role already exists", content = @Content)
    })
    @PostMapping("/")
    public ResponseEntity<Void> saveRole(@RequestBody RoleRequestDto roleRequestDto){
        roleHandler.saveRole(roleRequestDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Operation(summary = "Get all User")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "All users returned",
                    content = @Content(mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = RoleResponseDto.class)))),
            @ApiResponse(responseCode = "404", description = "No data found", content = @Content)
    })
    @GetMapping("/")
    public ResponseEntity<List<RoleResponseDto>> getAllRoles(){

        return ResponseEntity.ok(roleHandler.getAllRoles());
    }

}
