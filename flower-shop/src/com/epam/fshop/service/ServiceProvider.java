package com.epam.fshop.service;

import com.epam.fshop.service.impl.ShopImpl;
import com.epam.fshop.service.impl.StorageImpl;

public class ServiceProvider {
    private static final ServiceProvider instance = new ServiceProvider();

    private FlowerShopService shopService = new ShopImpl();
    private StorageShopService storageService = new StorageImpl();

    private ServiceProvider() {
    }

    public static ServiceProvider getInstance() {
        return instance;
    }

    public FlowerShopService getShopService() {
        return shopService;
    }

    public StorageShopService getStorageService() {
        return storageService;
    }


}
