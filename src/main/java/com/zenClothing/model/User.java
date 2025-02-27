package com.zenClothing.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "app_user") // Đổi tên bảng để tránh xung đột với từ khóa PostgreSQL
@Data // Tự động tạo getter, setter, toString, equals, và hashCode
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    // Getter, setter, constructor được viết sẵn thông qua Lombok qua @Data
}