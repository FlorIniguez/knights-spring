package com.KnightsOfTheZodiac.Knights.repository;


import com.KnightsOfTheZodiac.Knights.model.KnightZodiac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KnightsRepository extends JpaRepository<KnightZodiac, Integer > {
}
