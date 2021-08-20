package com.epam.fshop.view.impl;

import com.epam.fshop.controller.ControllerProvider;
import com.epam.fshop.controller.Controller;
import com.epam.fshop.view.MainViewer;

import java.util.Scanner;

public class MainViewerImpl implements MainViewer {
    private final Scanner input = new Scanner(System.in);

    @Override
    public String showMenu() {
        return String.format("Choose operation:\n1 - %s\n2 - %s", "The cost of a mixed bouquet with wrapper and ribbon",
                "The cost of an one-type bouquet with wrapper and ribbon");
    }

    @Override
    public String chooseOperation() {
        ControllerProvider provider = ControllerProvider.getInstance();
        Controller controller = provider.getController();

        while (!input.hasNext("[1-2]")) {
            System.err.println("Invalid value! Type 1 or 2!");
            input.next();
        }

        String request = input.next();

        return controller.doAction(request);
    }

    @Override
    public int chooseQuantity() {
        System.out.println("How much flowers do you want to buy?:");

        while (!input.hasNext("[0-9]{1,2}")) {
            System.err.println("Invalid value! Choose from 1 to 99! ");
            input.next();
        }

        return input.nextInt();
    }

}
