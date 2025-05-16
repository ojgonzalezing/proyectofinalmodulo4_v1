package com.codegym.domain;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import net.bytebuddy.matcher.InheritedAnnotationMatcher;

@Entity
@Table(schema = "world", name = "city")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    private String district;

    private Integer population;

}
