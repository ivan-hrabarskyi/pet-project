package com.peerspace.design.patterns.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        List<Filter> filters = new ArrayList<>();
        List<Filter> filtersCopy = new ArrayList<>();

        PriceFilter priceFilter = new PriceFilter();
        priceFilter.setClearButton("Clear button selector");
        priceFilter.setDoneButton("Done button selector");
        priceFilter.setUpToHundred("Up to $100");
        priceFilter.setEnterRange("$200 - $900");

        filters.add(priceFilter);

        PriceFilter anotherPriceFilter = (PriceFilter) priceFilter.clone();
        filters.add(anotherPriceFilter);

        AttendeesFilter attendeesFilter = new AttendeesFilter();
        attendeesFilter.setClearButton("Clear button selector");
        attendeesFilter.setDoneButton("Done button selector");
        attendeesFilter.setOneToTen("1 to 10");
        attendeesFilter.setOverHundred("Over 100");
        attendeesFilter.setExactCount("51");
        filters.add(attendeesFilter);

        cloneAndCompare(filters, filtersCopy);

    }

    public static void cloneAndCompare(List<Filter> filters, List<Filter> filterCopy) {
        filters.forEach(filter -> filterCopy.add(filter.clone()));

        IntStream.range(0, filters.size())
                .forEach(i -> {
                    if (filters.get(i) != filterCopy.get(i)) {
                        System.out.print(i + " objects: Filters are different object");
                        if (filters.get(i).equals(filterCopy.get(i))) {
                            System.out.println(" and they are identical");
                        }
                        else {
                            System.out.println(" and they are not identical");
                        }
                    }
                    else {
                        System.out.println(i + " objects: Filters are the same!");
                    }
                });
    }

}
