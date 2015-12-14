package com.epam.mentoring.observer;

import com.epam.mentoring.printer.ResultsPrinter;

/**
 * Longest word keeper – which keeps the last longest word sent to it
 *
 * @author vkrasovsky
 */
public class LongestWordKeeper extends AbstractObserver implements ResultsPrinter {
    private long wordLength;
    private String longestWord;

    /**
     * {@inheritDoc}
     */
    @Override
    public void update(String word) {
        int length = new StringBuffer(word).length();
        if (length > wordLength) {
            longestWord = word;
            wordLength = length;
        }
        printResults();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void printResults() {
        System.out.println("[ " + getClass().getName() + "]: longest word: " + longestWord + ", length: " + wordLength);
    }
}
