package com.exxeta.domain;

public class Total {

    private Long linesOfCode;

    private Long lines;

    public Long getLinesOfCode() {
        return linesOfCode;
    }

    public void setLinesOfCode(Long linesOfCode) {
        this.linesOfCode = linesOfCode;
    }

    public Long getLines() {
        return lines;
    }

    public void setLines(Long lines) {
        this.lines = lines;
    }

    public void incrementLinesOfCode(Long number) {
        this.linesOfCode += number;
    }

    public void incrementLines(Long number) {
        this.lines += number;
    }
}
