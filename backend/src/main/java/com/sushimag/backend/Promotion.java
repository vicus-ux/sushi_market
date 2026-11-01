package com.sushimag.backend;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "promotions")
@Data // <-- ЭТА АННОТАЦИЯ СОЗДАЁТ МЕТОДЫ setImageUrl, setTitle и т.д.
@NoArgsConstructor
@AllArgsConstructor
public class Promotion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    
    // ВНИМАНИЕ: именно так! Маленькие 'u', 'r', 'l'. 
    // Только так Lombok создаст метод setImageUrl()
    private String imageUrl; 
    
    private String badge;
    
    @Column(name = "is_active")
    private Boolean isActive = true;
}