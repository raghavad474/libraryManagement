package com.jpa.librarymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.librarymanagement.entity.BookGenres;

public interface BookGenresRepository extends JpaRepository<BookGenres, Integer>{

}
