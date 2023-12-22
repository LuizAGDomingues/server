package com.luizdomingues.parfumecommerce.repositories;

import com.luizdomingues.parfumecommerce.domain.ItemsTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsRepository extends JpaRepository<ItemsTable, String> {
}
