package com.epam.fshop.service.impl;

import com.epam.fshop.dao.DAOException;
import com.epam.fshop.dao.DAOProvider;
import com.epam.fshop.dao.AccessoryStand;
import com.epam.fshop.dao.FlowerStorage;
import com.epam.fshop.entity.AccessoryEntity.Accessory;
import com.epam.fshop.entity.FlowerEntity.Flower;
import com.epam.fshop.service.StorageShopService;
import com.epam.fshop.service.ServiceException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StorageImpl implements StorageShopService {
    private DAOProvider provider = DAOProvider.getInstance();

    @Override
    public double countCost(List<Flower> flowers, List<Accessory> accessories) {
        double sum = 0;
        for (Flower flower : flowers) {
            sum += flower.getPrice();
        }

        for (Accessory accessory : accessories) {
            sum += accessory.getPrice() * accessory.getLength();
        }

        return sum;
    }

    @Override
    public List<Flower> mixFlower(int quantity) throws ServiceException {
        FlowerStorage roseStorage = provider.getRoseStorage();
        FlowerStorage pionStorage = provider.getPionStorage();
        FlowerStorage tulipStorage = provider.getTulipStorage();

        List<Flower> flowers;
        try {
            flowers = roseStorage.showAllStorage();
            flowers.addAll(tulipStorage.showAllStorage());
            flowers.addAll(pionStorage.showAllStorage());
        } catch (DAOException e) {
            throw new ServiceException(e);
        }

        List<Flower> result = new ArrayList<>();

        int randomValue;
        Flower randomFlower;

        for (int i = 0; i < quantity; i++) {
            randomValue = (int) (Math.random() * (flowers.size() - 1));
            randomFlower = flowers.get(randomValue);
            result.add(randomFlower);
        }
        Collections.shuffle(result);
        return result;
    }

    @Override
    public List<Accessory> chooseWrapping() throws ServiceException {
        AccessoryStand ribbonStand = provider.getRibbonStand();
        AccessoryStand wrappingStand = provider.getWrappingStand();

        List<Accessory> wrapping;
        List<Accessory> ribbon;
        try {
            wrapping = wrappingStand.showAccessory();
            ribbon = ribbonStand.showAccessory();
        }catch (DAOException e){
            throw new ServiceException(e);
        }

        List<Accessory> result = new ArrayList<>();

        int randomValue = (int) (Math.random() * (wrapping.size() - 1));
        Accessory randWrap = wrapping.get(randomValue);
        Accessory randRibbon = ribbon.get(randomValue);

        result.add(randRibbon);
        result.add(randWrap);

        return result;
    }

    @Override
    public List<Flower> OneTypeFlower(int quantity) throws ServiceException {
        FlowerStorage roseStorage = provider.getRoseStorage();

        List<Flower> roses;
        try {
            roses = roseStorage.showAllStorage();
        }catch (DAOException e){
            throw new ServiceException(e);
        }

        List<Flower> result = new ArrayList<>();

        int randomValue;
        Flower randFlower;

        for (int i = 0; i < quantity; i++) {
            randomValue = (int) (Math.random() * (roses.size() - 1));
            randFlower = roses.get(randomValue);
            result.add(randFlower);
        }

        return result;
    }
}
