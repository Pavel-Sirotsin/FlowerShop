package com.epam.fshop.controller.impl;

import com.epam.fshop.controller.Command;
import com.epam.fshop.entity.AccessoryEntity.Accessory;
import com.epam.fshop.entity.Bouquet;
import com.epam.fshop.entity.FlowerEntity.Flower;
import com.epam.fshop.service.FlowerShopService;
import com.epam.fshop.service.StorageShopService;
import com.epam.fshop.service.ServiceException;
import com.epam.fshop.service.ServiceProvider;
import com.epam.fshop.view.MainViewer;
import com.epam.fshop.view.ShopViewer;
import com.epam.fshop.view.ViewerProvider;

import java.util.List;

public class MakeOneTypeBouquet implements Command {
    @Override
    public String execute() {
        ViewerProvider viewer = ViewerProvider.getInstance();
        MainViewer mainViewer = viewer.getMainViewer();
        ShopViewer shopViewer = viewer.getShopViewer();

        ServiceProvider service = ServiceProvider.getInstance();
        FlowerShopService shopService = service.getShopService();
        StorageShopService storageService = service.getStorageService();

        Bouquet bouquet;
        Flower flower;
        List<Flower> flowers = null;
        List<Accessory> accessories = null;

        int quantity = mainViewer.chooseQuantity();
        String standardName = "The loneliness";

        try {
            flowers = storageService.OneTypeFlower(quantity);
            accessories = storageService.chooseWrapping();
        } catch (ServiceException e) {
            // log here
            e.printStackTrace();
            System.err.println("Check your source file path!");
        }


        double cost = storageService.countCost(flowers, accessories);

        bouquet = shopService.makeBouquet(standardName, cost, flowers, accessories);
        flower = shopService.findByStemLength(bouquet);

        shopService.sortByFreshness(bouquet);

        return shopViewer.makeBouquetAnswer(bouquet, flower);
    }

}
