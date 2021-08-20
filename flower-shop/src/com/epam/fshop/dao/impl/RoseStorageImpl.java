package com.epam.fshop.dao.impl;

import com.epam.fshop.dao.DAOException;
import com.epam.fshop.dao.FlowerStorage;
import com.epam.fshop.dao.util.FlowerDataParser;
import com.epam.fshop.entity.FlowerEntity.Flower;
import com.epam.fshop.entity.FlowerEntity.Rose;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RoseStorageImpl implements FlowerStorage {
    private static final String SOURCE = "flower-shop/src/com/epam/fshop/source/rose_storage.txt";

    @Override
    public List<Flower> showAllStorage() throws DAOException {
        FlowerDataParser parser = FlowerDataParser.getInstance();
        List<Flower> list = new ArrayList<>();
        Rose flower;

        try (
                BufferedReader reader = new BufferedReader(new FileReader(SOURCE))
        ) {
            String line;

            while ((line = reader.readLine()) != null) {
                flower = new Rose(parser.getPrice(line),
                        parser.getFreshness(line),
                        parser.getLength(line),
                        parser.getColor(line),
                        parser.getVariety(line),
                        parser.getFirstFeature(line),
                        parser.getSecondFeature(line));
                list.add(flower);
            }

        } catch (FileNotFoundException e) {
            throw new DAOException(e);
        } catch (IOException e) {
            throw new DAOException(e);
        }

        return list;
    }


}
