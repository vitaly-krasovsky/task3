package com.epam.mentoring.observer;

import com.google.common.base.Splitter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vkrasovsky
 */
public class TextParserImpl implements TextParser {
    private static final String SPLIT_PATTERN = "[.,;!?\\s]";
    private List<AbstractObserver> observers = new ArrayList<>();


    /**
     * {@inheritDoc}
     */
    @Override
    public void registerObserver(AbstractObserver observer) {
        observers.add(observer);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void deleteObserver(AbstractObserver observer) {
        observers.remove(observer);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void notifyObservers(String word) {
        for (AbstractObserver observer : observers) {
            observer.update(word);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void processLines(List<String> lines) {
        for (String line : lines) {
            Iterable<String> splitted = Splitter.onPattern(SPLIT_PATTERN).trimResults().omitEmptyStrings().split(line);
            for (String word : splitted) {
                notifyObservers(word);
            }
        }
    }
}
