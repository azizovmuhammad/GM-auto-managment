package com.example.GMautomanagment.entity;

import com.example.GMautomanagment.entity.tamplate.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AutoShop extends AbstractEntity {

    @Column(unique = true, nullable = false)
    private String name;

    @OneToOne
    private Address address;

    @ManyToOne
    private GM company;

    @OneToMany
    private Set<Car> cars = new HashSet<>();
}
