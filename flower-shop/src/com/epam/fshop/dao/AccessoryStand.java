package com.epam.fshop.dao;

import com.epam.fshop.entity.AccessoryEntity.Accessory;

import java.util.List;

public interface AccessoryStand {
    List<Accessory> showAccessory() throws DAOException;

}
