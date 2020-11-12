package com.exxeta.domain;


public class LOCStat {

    private String fileName;

    private Long totalLines;

    private Long linesOfCode;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Long getTotalLines() {
        return totalLines;
    }

    public void setTotalLines(Long totalLines) {
        this.totalLines = totalLines;
    }

    public Long getLinesOfCode() {
        return linesOfCode;
    }

    public void setLinesOfCode(Long linesOfCode) {
        this.linesOfCode = linesOfCode;
    }
}
