package com.persistenciaDados.repository;

import com.persistenciaDados.model.Key;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface KeyRepository extends JpaRepository<Key, Long>, JpaSpecificationExecutor<Key> {
    Key findByChave(String key);
}
