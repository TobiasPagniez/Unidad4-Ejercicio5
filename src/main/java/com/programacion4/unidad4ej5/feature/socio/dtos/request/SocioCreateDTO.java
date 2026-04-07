package com.programacion4.unidad4ej5.feature.socio.dtos.request;

import jakarta.validation.constraints.*;
import java.time.LocalDate;

public record SocioCreateDTO(
    @NotBlank(message = "El nombre no puede estar vacío")
    String nombre,

    @NotBlank(message = "El apellido no puede estar vacío")
    String apellido,

    @Email(message = "El formato del email no es válido")
    @NotBlank(message = "El email es obligatorio")
    String email,

    @Pattern(regexp = "\\d{8}", message = "El DNI debe tener exactamente 8 dígitos numéricos")
    String dni,

    @Past(message = "La fecha de nacimiento debe ser una fecha pasada")
    @NotNull(message = "La fecha de nacimiento es obligatoria")
    LocalDate fechaNacimiento,

    @Pattern(regexp = "^\\+\\d{1,3}\\d{1,12}$", message = "El teléfono debe seguir el formato internacional (ej: +549...)")
    String telefono
) {
    // Validación
    @AssertTrue(message = "El socio debe tener al menos 18 años")
    public boolean isAdult() {
        if (fechaNacimiento == null) return false;
        return fechaNacimiento.plusYears(18).isBefore(LocalDate.now()) || 
               fechaNacimiento.plusYears(18).isEqual(LocalDate.now());
    }
}