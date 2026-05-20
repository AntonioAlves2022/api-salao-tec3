package com.antonio.salao.domain.dto;

import jakarta.validation.constraints.NotBlank;

public record ClienteRequestDTO(
        @NotBlank(message = "Nome é obrigatório")
        String nome,
        String telefone,
        String email,
        String senha
) {
}
