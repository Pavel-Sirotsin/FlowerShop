package com.epam.fshop.controller;

import com.epam.fshop.controller.impl.ControllerImpl;

public class ControllerProvider {
    private static final ControllerProvider instance = new ControllerProvider();

    private Controller controller = new ControllerImpl();

    private ControllerProvider(){
    }

    public static ControllerProvider getInstance() {
        return instance;
    }

    public Controller getController() {
        return controller;
    }
}
