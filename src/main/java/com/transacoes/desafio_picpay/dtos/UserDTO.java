package com.transacoes.desafio_picpay.dtos;

import com.transacoes.desafio_picpay.domain.user.UserType;

import java.math.BigDecimal;

public record UserDTO(
        String firstName,
        String lastname,
        String document,
        BigDecimal balance,
        String email,
        String password,
        UserType userType
) {}
