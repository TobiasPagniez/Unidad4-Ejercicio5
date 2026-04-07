package com.programacion4.unidad4ej5.feature.plan.dtos.request;

import jakarta.validation.constraints.*;
import java.util.List;

public record PlanCreateDTO(
    @NotBlank(message = "El objetivo es obligatorio")
    @Size(min = 10, max = 200, message = "El objetivo debe tener entre 10 y 200 caracteres")
    String objetivo,

    @NotNull(message = "La frecuencia semanal es obligatoria")
    @Min(value = 1, message = "La frecuencia mínima es 1 día")
    @Max(value = 7, message = "La frecuencia máxima es 7 días")
    Integer frecuenciaSemanal,

    @NotNull(message = "El peso inicial es obligatorio")
    @DecimalMin(value = "30.0", message = "El peso mínimo permitido es 30.0 kg")
    @DecimalMax(value = "250.0", message = "El peso máximo permitido es 250.0 kg")
    Double pesoInicial,

    @NotNull(message = "La altura es obligatoria")
    @DecimalMin(value = "1.0", message = "La altura mínima es 1.0 metro")
    @DecimalMax(value = "2.5", message = "La altura máxima es 2.5 metros")
    Double altura,

    @NotEmpty(message = "La lista de ejercicios no puede estar vacía")
    @Size(min = 3, message = "Debe definir al menos 3 ejercicios")
    List<String> ejercicios
) {}