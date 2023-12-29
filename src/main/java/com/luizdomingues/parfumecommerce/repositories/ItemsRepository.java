package com.luizdomingues.parfumecommerce.repositories;

import com.luizdomingues.parfumecommerce.domain.ItemsTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ItemsRepository extends JpaRepository<ItemsTable, String> {
    List<ItemsTable> findByBrand(String brand);

    List<ItemsTable> findByGender(String gender);

    List<ItemsTable> findByName(String name);

    List<ItemsTable> findByRatio(int ratio);

    @Query(value = "SELECT DISTINCT brand FROM items", nativeQuery = true)
    List<String> findBrands();

}
