package com.luizdomingues.parfumecommerce.domain;

import com.luizdomingues.parfumecommerce.DTOs.ItemsRequestDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name="items")
@Entity(name="items")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class ItemsTable {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private String description;
    private String image;
    private int value;
    private String size;
    private String brand;
    private String gender;
    private int quantity;
    private int ratio;

    public ItemsTable(ItemsRequestDTO data){
        this.name = data.name();
        this.description = data.description();
        this.image = data.image();
        this.value = data.value();
        this.size = data.size();
        this.brand = data.brand();
        this.gender = data.gender();
        this.quantity = data.quantity();
        this.ratio = data.ratio();
    }
}
