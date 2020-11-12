package com.exxeta.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ArgumentReaderTest {


    @Test
    public void testGetPath() {
        // prepare mock data
        String[] args = {"path1", "path2"};

        // execute test
        String path = ArgumentReader.getPath(args);

        // verify result
        assertThat(path).isEqualTo(args[0]);
    }
}
