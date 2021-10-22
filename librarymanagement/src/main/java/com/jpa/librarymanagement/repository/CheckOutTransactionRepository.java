package com.jpa.librarymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.librarymanagement.entity.CheckOutTransaction;

public interface CheckOutTransactionRepository extends JpaRepository<CheckOutTransaction, Integer> {

}
