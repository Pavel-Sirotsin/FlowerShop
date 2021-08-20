package com.epam.fshop.dao.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FlowerDataParser {
    private static final String REGEX = ".+?(\\d+\\.\\d+).+?(\\d+).+?(\\d+).+?: (\\w+).+?: (\\w+).+?: (\\w+).+?: (\\w+)";
    private static final FlowerDataParser instance = new FlowerDataParser();

    private Pattern pattern = Pattern.compile(REGEX);
    private Matcher matcher;

    private FlowerDataParser() {
    }

    public static FlowerDataParser getInstance() {
        return instance;
    }

    public double getPrice(String line) {
        matcher = pattern.matcher(line);
        return matcher.matches()
                ? Double.parseDouble(matcher.group(1))
                : 0.0;
    }

    public int getFreshness(String line) {
        matcher = pattern.matcher(line);
        return matcher.matches()
                ? Integer.parseInt(matcher.group(2))
                : 0;
    }

    public int getLength(String line) {
        matcher = pattern.matcher(line);
        return matcher.matches()
                ? Integer.parseInt(matcher.group(3))
                : 0;
    }

    public String getColor(String line) {
        matcher = pattern.matcher(line);
        return matcher.matches()
                ? matcher.group(4)
                : null;
    }

    public String getVariety(String line) {
        matcher = pattern.matcher(line);
        return matcher.matches()
                ? matcher.group(5)
                : null;
    }

    public String getFirstFeature(String line) {
        matcher = pattern.matcher(line);
        return matcher.matches()
                ? matcher.group(6)
                : null;
    }

    public String getSecondFeature(String line) {
        matcher = pattern.matcher(line);
        return matcher.matches()
                ? matcher.group(7)
                : null;
    }


}
