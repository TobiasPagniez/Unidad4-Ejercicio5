package com.programacion4.unidad4ej5.feature.socio.dtos.response;

import java.time.LocalDate;

public record SocioResponseDTO(
    Long id,
    String nombre,
    String apellido,
    String email,
    String dni,
    LocalDate fechaNacimiento,
    String telefono
) {}