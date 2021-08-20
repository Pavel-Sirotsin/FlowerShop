package com.epam.fshop.view.impl;

import com.epam.fshop.entity.Bouquet;
import com.epam.fshop.entity.FlowerEntity.Flower;
import com.epam.fshop.view.ShopViewer;

public class ShopViewerImpl implements ShopViewer {
    public String makeBouquetAnswer(Bouquet bouquet, Flower flower) {
        StringBuilder builder = new StringBuilder();
        if (bouquet != null && flower != null) {
            builder.append(bouquet.toString());
            builder.append("\n");
            builder.append("Max length of a flower: ");
            builder.append(flower.getLength());
            builder.append("cm");
            return builder.toString();
        } else return "We're run out of flowers!";
    }


}
