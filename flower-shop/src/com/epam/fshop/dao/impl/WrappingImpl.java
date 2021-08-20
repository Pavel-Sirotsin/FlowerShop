package com.epam.fshop.dao.impl;

import com.epam.fshop.dao.AccessoryStand;
import com.epam.fshop.dao.DAOException;
import com.epam.fshop.dao.util.AccessoryDataParser;
import com.epam.fshop.entity.AccessoryEntity.Accessory;
import com.epam.fshop.entity.AccessoryEntity.WrappingPaper;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WrappingImpl implements AccessoryStand {
    private static final String SOURCE = "flower-shop/src/com/epam/fshop/source/wrapping_stand.txt";

    @Override
    public List<Accessory> showAccessory() throws DAOException {
        AccessoryDataParser parser = AccessoryDataParser.getInstance();
        List<Accessory> list = new ArrayList<>();
        Accessory accessory;

        try (
                BufferedReader reader = new BufferedReader(new FileReader(SOURCE))
        ) {
            String line;

            while ((line = reader.readLine()) != null) {
                accessory = new WrappingPaper(parser.getPrice(line),
                        parser.getLength(line),
                        parser.getColor(line),
                        parser.getFirstFeature(line),
                        parser.getSecondFeature(line));
                list.add(accessory);
            }

        } catch (FileNotFoundException e) {
            throw new DAOException(e);
        } catch (IOException e) {
            throw new DAOException(e);
        }

        return list;
    }
}
