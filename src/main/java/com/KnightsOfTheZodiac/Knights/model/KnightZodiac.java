package com.KnightsOfTheZodiac.Knights.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class KnightZodiac {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String birthDate;
    private int age;
    private String constellation;
    private String sign;
    private String origin;

    public KnightZodiac(String name, String birthDate, int age, String constellation, String sign, String origin) {
        this.name = name;
        this.birthDate = birthDate;
        this.age = age;
        this.constellation = constellation;
        this.sign = sign;
        this.origin = origin;
    }
}
