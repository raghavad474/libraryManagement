package com.jpa.librarymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.librarymanagement.entity.BookDetails;

public interface BookDetailsRepository extends JpaRepository<BookDetails, Integer>{

}
