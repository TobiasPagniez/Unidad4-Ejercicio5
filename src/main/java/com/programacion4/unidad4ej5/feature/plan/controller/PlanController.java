package com.programacion4.unidad4ej5.feature.plan.controller;

import com.programacion4.unidad4ej5.feature.plan.dtos.request.PlanCreateDTO;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/planes")
public class PlanController {

    @PostMapping
    public ResponseEntity<String> crearPlan(@Valid @RequestBody PlanCreateDTO planDTO) {
        return new ResponseEntity<>("Plan de entrenamiento creado exitosamente", HttpStatus.CREATED);
    }
}