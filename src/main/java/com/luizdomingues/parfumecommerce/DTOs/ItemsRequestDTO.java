package com.luizdomingues.parfumecommerce.DTOs;

public record ItemsRequestDTO(String name, String description, String image, int value, String size, String brand, String gender, int quantity, int ratio) {
}
