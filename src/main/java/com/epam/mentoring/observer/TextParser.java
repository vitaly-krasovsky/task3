package com.epam.mentoring.observer;

import java.util.List;

/**
 * Used for parsing text files and notifying listeners.
 *
 * @author vkrasovsky
 */
public interface TextParser {
    /**
     * @param observer the observer
     */
    void registerObserver(AbstractObserver observer);

    /**
     * @param observer the observer
     */
    void deleteObserver(AbstractObserver observer);

    /**
     * @param word the word which found in file
     */
    void notifyObservers(String word);

    /**
     * @param lines list of lines from files
     */
    void processLines(List<String> lines);
}
