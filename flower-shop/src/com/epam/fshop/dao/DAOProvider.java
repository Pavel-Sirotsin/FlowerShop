package com.epam.fshop.dao;

import com.epam.fshop.dao.impl.*;

public class DAOProvider {
    private static final DAOProvider instance = new DAOProvider();

    private AccessoryStand ribbonStand = new RibbonImpl();
    private AccessoryStand wrappingStand = new WrappingImpl();
    private FlowerStorage roseStorage = new RoseStorageImpl();
    private FlowerStorage pionStorage = new PionStorageImpl();
    private FlowerStorage tulipStorage = new TulipStorageImpl();

    private DAOProvider() {
    }

    public static DAOProvider getInstance() {
        return instance;
    }

    public AccessoryStand getRibbonStand() {
        return ribbonStand;
    }

    public AccessoryStand getWrappingStand() {
        return wrappingStand;
    }

    public FlowerStorage getRoseStorage() {
        return roseStorage;
    }

    public FlowerStorage getPionStorage() {
        return pionStorage;
    }

    public FlowerStorage getTulipStorage() {
        return tulipStorage;
    }


}
