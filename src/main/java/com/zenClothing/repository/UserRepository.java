package com.zenClothing.repository;

import com.zenClothing.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Không cần viết thêm code vì JpaRepository đã cung cấp các phương thức CRUD sẵn.
}