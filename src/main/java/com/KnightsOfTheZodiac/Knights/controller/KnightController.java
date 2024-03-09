package com.KnightsOfTheZodiac.Knights.controller;

import com.KnightsOfTheZodiac.Knights.model.KnightZodiac;
import com.KnightsOfTheZodiac.Knights.services.KnightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/knights")

public class KnightController {
    @Autowired
    KnightService knightService;

    @GetMapping("")
    public List<KnightZodiac> getAllKnightsController() {
        return knightService.getAllKnights();
    }

    @GetMapping("/search/{id}")
    public KnightZodiac findByIdController(@PathVariable Integer id) {
        return knightService.searchKnightById(id);
    }

    @PostMapping("/add")
    public KnightZodiac createKnightController(@RequestBody KnightZodiac knightZodiac) {
      return knightService.createKnights(knightZodiac);
    }

    @PutMapping("/update")
    public KnightZodiac updateKnightController(@RequestBody KnightZodiac knightZodiac) {
        return knightService.updateKnight(knightZodiac);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteKnightIdController(@PathVariable Integer id) {
     knightService.deleteKnightId(id);
    }

}
