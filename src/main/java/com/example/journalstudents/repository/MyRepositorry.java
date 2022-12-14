package com.example.journalstudents.repository;

import com.example.journalstudents.table.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MyRepositorry extends JpaRepository <Student, Long>{

}

//@Repository
//public interface GroupRepository extends JpaRepository<Group, Long> {
//
//    List<Group> findByRoom (String room); //свой запрос
//
//// @Query ("SELECT s FROM Group g where g.id =: id")
////  Group customSelect (@Param("id") int id); // свой поиск по id
//
//
//
//
//}