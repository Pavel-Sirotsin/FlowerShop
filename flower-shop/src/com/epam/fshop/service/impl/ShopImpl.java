package com.epam.fshop.service.impl;

import com.epam.fshop.entity.AccessoryEntity.Accessory;
import com.epam.fshop.entity.Bouquet;
import com.epam.fshop.entity.FlowerEntity.Flower;
import com.epam.fshop.service.FlowerShopService;

import java.util.Collections;
import java.util.List;

public class ShopImpl implements FlowerShopService {
    @Override
    public Bouquet makeBouquet(String name, double cost, List<Flower> flowers, List<Accessory> accessory) {
        return new Bouquet(name, cost, flowers, accessory);
    }

    @Override
    public void sortByFreshness(Bouquet bouquet) {
        List<Flower> list = bouquet.getFlowers();
        Collections.sort(list);
        bouquet.setFlowers(list);
    }

    @Override
    public Flower findByStemLength(Bouquet bouquet) {
        int max = 0;
        int length;
        Flower longestFLower = null;

        for (Flower flower : bouquet.getFlowers()) {
            length = flower.getLength();

            if (length > max) {
                max = length;
                longestFLower = flower;
            }

        }

        return longestFLower;
    }
}
