package com.muskaan.crudoperation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.muskaan.crudoperation.model.Books;

public interface BooksRespository extends JpaRepository<Books,Integer> {

}
