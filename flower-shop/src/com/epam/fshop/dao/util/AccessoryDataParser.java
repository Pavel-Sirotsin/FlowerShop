package com.epam.fshop.dao.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccessoryDataParser {
    private static final String REGEX = ".+?(\\d+\\.\\d+).+?(\\d+\\.\\d+).+?: (\\w+).+?: (\\w+).+?: (\\w+)";

    private static final AccessoryDataParser instance = new AccessoryDataParser();

    private Pattern pattern = Pattern.compile(REGEX);
    private Matcher matcher;

    private AccessoryDataParser() {
    }

    public static AccessoryDataParser getInstance() {
        return instance;
    }

    public double getPrice(String line) {
        matcher = pattern.matcher(line);
        return matcher.matches()
                ? Double.parseDouble(matcher.group(1))
                : 0.0;
    }

    public double getLength(String line) {
        matcher = pattern.matcher(line);
        return matcher.matches()
                ? Double.parseDouble(matcher.group(2))
                : 0.0;
    }

    public String getColor(String line) {
        matcher = pattern.matcher(line);
        return matcher.matches()
                ? matcher.group(3)
                : null;
    }

    public String getFirstFeature(String line) {
        matcher = pattern.matcher(line);
        return matcher.matches()
                ? matcher.group(4)
                : null;
    }

    public String getSecondFeature(String line) {
        matcher = pattern.matcher(line);
        return matcher.matches()
                ? matcher.group(5)
                : null;
    }


}
