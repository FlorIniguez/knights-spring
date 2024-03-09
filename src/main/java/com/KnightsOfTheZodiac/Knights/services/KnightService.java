package com.KnightsOfTheZodiac.Knights.services;

import com.KnightsOfTheZodiac.Knights.model.KnightZodiac;
import com.KnightsOfTheZodiac.Knights.repository.KnightsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class KnightService {
    @Autowired
    KnightsRepository knightsRepository;

    public KnightZodiac createKnights(KnightZodiac knightZodiac) {
        return knightsRepository.save(knightZodiac);
    }

    public List<KnightZodiac> getAllKnights() {
        return knightsRepository.findAll();
    }

    public KnightZodiac searchKnightById(Integer id) {
        return knightsRepository.findById(id).orElse(null);
    }

    public KnightZodiac updateKnight(KnightZodiac knightZodiac) {
        knightsRepository.save(knightZodiac);
        return knightsRepository.findById(knightZodiac.getId()).orElse(null);
    }

    public void deleteKnightId(Integer id) {
        knightsRepository.deleteById(id);
    }
}
