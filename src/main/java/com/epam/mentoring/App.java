package com.epam.mentoring;

import com.epam.mentoring.observer.LongestWordKeeper;
import com.epam.mentoring.observer.NumberCounter;
import com.epam.mentoring.observer.ReverseWord;
import com.epam.mentoring.observer.TextParser;
import com.epam.mentoring.observer.TextParserImpl;
import com.epam.mentoring.observer.WordCounter;
import com.epam.mentoring.service.TextReaderService;
import com.epam.mentoring.service.TextReaderServiceImpl;

import java.util.List;

/**
 * Main application.
 *
 * @author vkrasovsky
 */
public class App {

    public static void main(String[] args) {
        TextParser textParser = new TextParserImpl();
        textParser.registerObserver(new LongestWordKeeper());
        textParser.registerObserver(new NumberCounter());
        textParser.registerObserver(new ReverseWord());
        textParser.registerObserver(new WordCounter());

        TextReaderService textReaderService = new TextReaderServiceImpl();
        List<String> lines = textReaderService.readLines();
        textParser.processLines(lines);
    }
}
