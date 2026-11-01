package com.sushimag.backend;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping("/api/promotions")
@RequiredArgsConstructor

public class PromotionController {

    private final PromotionRepository promotionRepository;



    @GetMapping
    public List<Promotion> getAllPromotions(){

        List<Promotion> promotions = promotionRepository.findByIsActiveTrue();

        return promotions;
    }
    
}
