package com.epam.mentoring.service;

import com.google.common.base.Charsets;
import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Default implementation of TextReaderService.
 *
 * @author vkrasovsky
 */
public class TextReaderServiceImpl implements TextReaderService {
    private static final String FILE_NAME = "eurosport-news-1.txt";

    /**
     * {@inheritDoc}
     */
    @Override
    public List<String> readLines() {
        List<String> stringList = new ArrayList<>();
        try {
            URL resource = getClass().getClassLoader().getResource(FILE_NAME);
            if (resource != null) {
                stringList = Files.readLines(new File(resource.getFile()), Charsets.UTF_8);
            }
        } catch (IOException e) {
            //log
        }

        return stringList;
    }
}
