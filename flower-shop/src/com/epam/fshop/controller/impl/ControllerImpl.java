package com.epam.fshop.controller.impl;

import com.epam.fshop.controller.CommandProvider;
import com.epam.fshop.controller.Command;
import com.epam.fshop.controller.Controller;

public class ControllerImpl implements Controller {

    private CommandProvider provider = new CommandProvider();

    @Override
    public String doAction(String operation) {
        // request form: 'number of operation'

        Command current = provider.getCommand(operation);

        return current.execute();
    }
}
