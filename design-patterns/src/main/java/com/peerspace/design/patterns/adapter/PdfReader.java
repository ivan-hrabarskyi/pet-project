package com.peerspace.design.patterns.adapter;

public class PdfReader implements AdvancedTextReader {

    @Override
    public void openPdfFile(String fileName) {
        System.out.println("Opened PDF file with name: " + fileName);

    }

    @Override
    public void openEpubFile(String fileName) {
        System.out.println("Cannot open Epub file");
    }

}
