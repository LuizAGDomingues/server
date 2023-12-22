package com.luizdomingues.parfumecommerce.DTOs;

import com.luizdomingues.parfumecommerce.domain.ItemsTable;

public record ItemsResponseDTO(String id, String name, String description, String image, int value, String size, String brand, String gender, int quantity, int ratio) {
    public ItemsResponseDTO(ItemsTable items){
        this(items.getId(), items.getName(), items.getDescription(), items.getImage(), items.getValue(), items.getSize(), items.getBrand(), items.getGender(), items.getQuantity(), items.getRatio());
    }
}
