package com.example.Swigatto.model;

import com.example.Swigatto.Enum.RestaurantCategory;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="restraurant")
public class Restaurant {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id;
    String name;
    String location;

    RestaurantCategory restaurantCategory;




    boolean opened;
@OneToMany(mappedBy = "restaurant",cascade = CascadeType.ALL)

List<FoodItem>availableFoodItems=new ArrayList<>();
@OneToMany(mappedBy = "restaurant",cascade = CascadeType.ALL)
List<OrderEntity>orders=new ArrayList<>();

}
