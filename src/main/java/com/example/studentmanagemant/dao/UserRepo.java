package com.example.studentmanagemant.dao;

import com.example.studentmanagemant.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface UserRepo extends JpaRepository<User, Integer> {
    List<User> findByTitleContainingIgnoreCase(String keyword);

    @Query("UPDATE Tutorial t SET t.published = :published WHERE t.id = :id")
    @Modifying
    public void updatePublishedStatus(Integer id, boolean published);
}
