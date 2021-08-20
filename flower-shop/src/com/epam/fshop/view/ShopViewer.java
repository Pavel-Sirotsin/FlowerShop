package com.epam.fshop.view;

import com.epam.fshop.entity.Bouquet;
import com.epam.fshop.entity.FlowerEntity.Flower;

public interface ShopViewer {
    String makeBouquetAnswer(Bouquet bouquet, Flower flower);
}
