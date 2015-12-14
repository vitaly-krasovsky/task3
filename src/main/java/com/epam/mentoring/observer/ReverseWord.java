package com.epam.mentoring.observer;

import com.epam.mentoring.printer.ResultsPrinter;

/**
 * Reverse word – which reverse chars order in every given word
 *
 * @author vkrasovsky
 */
public class ReverseWord extends AbstractObserver implements ResultsPrinter {
    private String wordOriginal;
    private String wordsReversed;

    /**
     * {@inheritDoc}
     */
    @Override
    public void update(String word) {
        wordOriginal = word;
        wordsReversed = new StringBuilder(word).reverse().toString();
        printResults();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void printResults() {
        System.out.println("[ " + getClass().getName() + "]: original: " + wordOriginal + ", reversed: " + wordsReversed);
    }
}
