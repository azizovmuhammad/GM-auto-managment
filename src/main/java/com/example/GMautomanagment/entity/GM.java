package com.example.GMautomanagment.entity;

import com.example.GMautomanagment.entity.tamplate.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GM extends AbstractEntity {

    @Column(unique = true, nullable = false)
    private String name;

    @OneToOne
    private Address address;

    @ManyToOne
    private User director;

    @ManyToOne
    private GM parent;
}
