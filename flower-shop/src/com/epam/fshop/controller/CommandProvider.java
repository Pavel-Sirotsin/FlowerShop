package com.epam.fshop.controller;

import com.epam.fshop.controller.impl.MakeMixedBouquet;
import com.epam.fshop.controller.impl.MakeOneTypeBouquet;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {
    private Map<String, Command> commands = new HashMap<>();

    public CommandProvider() {
        commands.put("1", new MakeMixedBouquet());
        commands.put("2", new MakeOneTypeBouquet());

    }

    public Command getCommand(String operation) {
        return commands.get(operation);
    }
}
