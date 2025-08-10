package com.example.Client_management;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRepository extends JpaRepository<Client, Long> {
}
