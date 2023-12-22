package com.luizdomingues.parfumecommerce.DTOs;

import com.luizdomingues.parfumecommerce.enums.UserRole;

public record RegisterDTO(String login, String password, String name, String phone, String cep, String document, UserRole role) {
}
