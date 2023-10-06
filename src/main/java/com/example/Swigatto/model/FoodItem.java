package com.example.Swigatto.model;

import com.example.Swigatto.Enum.FoodCategory;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="food_item")
public class FoodItem {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id;
    double price;

    String dishName;
    @Enumerated(EnumType.STRING)
    FoodCategory category;
    boolean veg;
    boolean available;
    @ManyToOne
    @JoinColumn
    Cart cart;

    @ManyToOne
    @JoinColumn
    OrderEntity order;

    @ManyToOne
    @JoinColumn
Restaurant restaurant;



}
