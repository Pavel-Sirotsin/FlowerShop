package com.epam.fshop.service;

import com.epam.fshop.entity.AccessoryEntity.Accessory;
import com.epam.fshop.entity.Bouquet;
import com.epam.fshop.entity.FlowerEntity.Flower;

import java.util.List;

public interface FlowerShopService {
    Bouquet makeBouquet(String name, double cost, List<Flower> flowers, List<Accessory> accessory);
    void sortByFreshness(Bouquet bouquet);
    Flower findByStemLength(Bouquet bouquet);


}
