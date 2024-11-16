package com.example.CRUD_application;



    import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student,Long> {
    //Crud
Optional <Student> findById(long id);
void deleteById(long id);

void saveAll( Student existingStudent);
}


