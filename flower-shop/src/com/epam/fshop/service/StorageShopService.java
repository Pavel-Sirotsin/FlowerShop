package com.epam.fshop.service;

import com.epam.fshop.entity.AccessoryEntity.Accessory;
import com.epam.fshop.entity.FlowerEntity.Flower;

import java.util.List;

public interface StorageShopService {
    double countCost(List<Flower> flowers, List<Accessory> accessories);
    List<Flower> mixFlower(int val) throws ServiceException;
    List<Accessory> chooseWrapping() throws ServiceException;
    List<Flower> OneTypeFlower(int val) throws ServiceException;
}
