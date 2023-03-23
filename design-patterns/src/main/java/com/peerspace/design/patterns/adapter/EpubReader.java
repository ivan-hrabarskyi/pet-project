package com.peerspace.design.patterns.adapter;

public class EpubReader implements AdvancedTextReader {

    @Override
    public void openPdfFile(String fileName) {
        System.out.println("Cannot open PDF file");
    }

    @Override
    public void openEpubFile(String fileName) {
        System.out.println("Opened Epub file with name: " + fileName);
    }

}
