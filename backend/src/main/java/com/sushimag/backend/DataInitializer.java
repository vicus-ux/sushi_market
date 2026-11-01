package com.sushimag.backend;


import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.Arrays;

@Data 
@Component 
@RequiredArgsConstructor
@SuppressWarnings("unused")

public class DataInitializer  implements CommandLineRunner {

    private final PromotionRepository promotionRepository;

    @Override
    public void run(String... args) throws Exception {
        if (promotionRepository.count() == 0) {
            Promotion promo1 = new Promotion();
            promo1.setTitle("Комбо 3 Пиццы");
            promo1.setDescription("3 пиццы на выбор по специальной цене. Выгода до 30%!");
            promo1.setImageUrl("https://images.unsplash.com/photo-1513104890138-7c749659a591?w=500&auto=format&fit=crop&q=60");
            promo1.setBadge("ХИТ");
            promo1.setIsActive(true);

            Promotion promo2 = new Promotion();
            promo2.setTitle("Подарок на первый заказ");
            promo2.setDescription("Сделай первый заказ и получи ролл 'Филадельфия' в подарок!");
            promo2.setImageUrl("https://images.unsplash.com/photo-1579871494447-9811cf80d66c?w=500&auto=format&fit=crop&q=60");
            promo2.setBadge("ПОДАРОК");
            promo2.setIsActive(true);

            Promotion promo3 = new Promotion();
            promo3.setTitle("Оплачивайте баллами");
            promo3.setDescription("Копите баллы с каждого заказа и оплачивайте ими до 50% стоимости.");
            promo3.setImageUrl("https://images.unsplash.com/photo-1553621042-f6e147245754?w=500&auto=format&fit=crop&q=60");
            promo3.setBadge("-50%");
            promo3.setIsActive(true);


            promotionRepository.saveAll(Arrays.asList(promo1, promo2, promo3));

            System.out.println("Promotions initialized in the database.");
        } else {
            System.out.println("Promotions already exist in the database.");
        }
    }
    
}
