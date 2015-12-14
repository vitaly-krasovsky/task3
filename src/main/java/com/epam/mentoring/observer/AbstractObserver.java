package com.epam.mentoring.observer;

/**
 * Base class for any listener in the system.
 *
 * @author vkrasovsky
 */
public abstract class AbstractObserver {
    /**
     * Invokes when action happened.
     *
     * @param word the word
     */
    public abstract void update(String word);
}
