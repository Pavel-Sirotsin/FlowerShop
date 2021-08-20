package com.epam.fshop.view;

import com.epam.fshop.view.impl.MainViewerImpl;
import com.epam.fshop.view.impl.ShopViewerImpl;

public class ViewerProvider {
    private static final ViewerProvider instance = new ViewerProvider();

    private ShopViewer shopViewer = new ShopViewerImpl();
    private MainViewer mainViewer = new MainViewerImpl();

    private ViewerProvider(){}

    public static ViewerProvider getInstance() {
        return instance;
    }

    public ShopViewer getShopViewer() {
        return shopViewer;
    }

    public MainViewer getMainViewer() {
        return mainViewer;
    }
}
