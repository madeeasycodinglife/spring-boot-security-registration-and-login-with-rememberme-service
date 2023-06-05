package com.madeeasy.repository;

import com.madeeasy.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User,Long> {
    @Query(value = "select * from users u where u.email=?1",nativeQuery = true)
    User findByEmail(String email);
}
