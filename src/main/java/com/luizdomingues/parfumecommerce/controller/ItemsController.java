package com.luizdomingues.parfumecommerce.controller;

import com.luizdomingues.parfumecommerce.DTOs.ItemsRequestDTO;
import com.luizdomingues.parfumecommerce.DTOs.ItemsResponseDTO;
import com.luizdomingues.parfumecommerce.domain.ItemsTable;
import com.luizdomingues.parfumecommerce.repositories.ItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("items")
public class ItemsController {
    @Autowired
    private ItemsRepository items;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<ItemsResponseDTO> getAll(){

        List<ItemsResponseDTO> itemsList = items.findAll().stream().map(ItemsResponseDTO::new).toList();
        return itemsList;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveItem(@RequestBody ItemsRequestDTO data){
        ItemsTable repository = new ItemsTable(data);
        items.save(repository);
    }
}
