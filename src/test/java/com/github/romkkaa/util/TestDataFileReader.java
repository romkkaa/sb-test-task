package com.github.romkkaa.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestDataFileReader {

    public static Collection<Object[]> readTestDataFromFile(File file) {
        try (Stream<String> stream = Files.lines(file.toPath())) {
            return stream.map(line -> line.split(";")).collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
