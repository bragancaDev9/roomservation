package com.project.roomservation.entities.dtos;

import com.project.roomservation.entities.enums.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {}
