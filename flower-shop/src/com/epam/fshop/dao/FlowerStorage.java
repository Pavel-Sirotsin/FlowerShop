package com.epam.fshop.dao;

import com.epam.fshop.entity.FlowerEntity.Flower;

import java.util.List;

public interface FlowerStorage {
    List<Flower> showAllStorage() throws DAOException;
}
