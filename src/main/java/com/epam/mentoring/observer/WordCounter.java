package com.epam.mentoring.observer;

import com.epam.mentoring.printer.ResultsPrinter;

/**
 * Word counter – that simply counts the total words sent to it
 *
 * @author vkrasovsky
 */
public class WordCounter extends AbstractObserver implements ResultsPrinter {
    private long count;

    /**
     * {@inheritDoc}
     */
    @Override
    public void update(String word) {
        count++;
        printResults();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void printResults() {
        System.out.println("[ " + getClass().getName() + "]: current words count: " + count);
    }
}
