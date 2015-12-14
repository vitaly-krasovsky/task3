package com.epam.mentoring.observer;

import com.epam.mentoring.printer.ResultsPrinter;

/**
 * Number counter – that count the total numbers of string that represents numbers (for example "345", "0")
 *
 * @author vkrasovsky
 */
public class NumberCounter extends AbstractObserver implements ResultsPrinter {
    private long count;
    private int parsedValue;

    /**
     * {@inheritDoc}
     */
    @Override
    public void update(String word) {
        try {
            parsedValue = Integer.valueOf(word);
            count++;
        } catch (Exception e) {
            //log not a number
        }
        printResults();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void printResults() {
        System.out.println("[ " + getClass().getName() + "]: current found number: " + parsedValue + ", numbers count: " + count);
    }
}
