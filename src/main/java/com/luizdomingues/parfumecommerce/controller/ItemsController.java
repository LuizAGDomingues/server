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

        return items.findAll().stream().map(ItemsResponseDTO::new).toList();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/destaques")
    public List<ItemsResponseDTO> getTopRatios(){
        return items.findByRatio(5).stream().map(ItemsResponseDTO::new).toList();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/marcas")
    public List<String> getBrands(){
        return items.findBrands().stream().toList();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/marcas/{brand}")
    public List<ItemsResponseDTO> getItemsByBrand(@PathVariable String brand){
        return items.findByBrand(brand).stream().map(ItemsResponseDTO::new).toList();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/gender/{gender}")
    public List<ItemsResponseDTO> getItemsByGender(@PathVariable String gender){
        return items.findByGender(gender).stream().map(ItemsResponseDTO::new).toList();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/parfum/{name}")
    public List<ItemsResponseDTO> getItemsByName(@PathVariable String name){
        return items.findByName(name).stream().map(ItemsResponseDTO::new).toList();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/{itemId}")
    public List<ItemsResponseDTO> getItemById(@PathVariable String itemId){
        return items.findById(itemId).stream().map(ItemsResponseDTO::new).toList();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveItem(@RequestBody ItemsRequestDTO data){
        ItemsTable repository = new ItemsTable(data);
        items.save(repository);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping("/update/{itemId}")
    public void updateItem(@PathVariable String itemId, @RequestBody ItemsRequestDTO data){
        deleteItem(itemId);
        ItemsTable repository = new ItemsTable(data);
        items.save(repository);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @DeleteMapping("/delete/{itemId}")
    public void deleteItem(@PathVariable String itemId){
        items.deleteById(itemId);
    }


}
