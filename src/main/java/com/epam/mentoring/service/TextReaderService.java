package com.epam.mentoring.service;

import java.util.List;

/**
 * Used for processing files from resources.
 *
 * @author vkrasovsky
 */
public interface TextReaderService {
    /**
     * @return list with strings for input file.
     */
    List<String> readLines();
}
