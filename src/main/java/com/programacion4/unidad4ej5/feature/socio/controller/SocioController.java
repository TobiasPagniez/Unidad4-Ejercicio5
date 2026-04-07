package com.programacion4.unidad4ej5.feature.socio.controller;

import com.programacion4.unidad4ej5.feature.socio.dtos.request.SocioCreateDTO;
import com.programacion4.unidad4ej5.feature.socio.dtos.response.SocioResponseDTO;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/socios")
public class SocioController {

    @PostMapping
    public ResponseEntity<SocioResponseDTO> registrarSocio(@Valid @RequestBody SocioCreateDTO socioDTO) {
        
        SocioResponseDTO mockResponse = new SocioResponseDTO(
            1L, 
            socioDTO.nombre(), 
            socioDTO.apellido(), 
            socioDTO.email(), 
            socioDTO.dni(), 
            socioDTO.fechaNacimiento(), 
            socioDTO.telefono()
        );

        return new ResponseEntity<>(mockResponse, HttpStatus.CREATED);
    }
}