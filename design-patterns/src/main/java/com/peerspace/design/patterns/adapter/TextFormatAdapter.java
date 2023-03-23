package com.peerspace.design.patterns.adapter;

public class TextFormatAdapter implements TextFormatReader {

    AdvancedTextReader advancedTextReader;

    public TextFormatAdapter(TextFileFormat format) {

        if (format == TextFileFormat.PDF) {
            advancedTextReader = new PdfReader();
        } else if (format == TextFileFormat.EPUB) {
            advancedTextReader = new EpubReader();
        }

    }

    @Override
    public void openFile(TextFileFormat format, String fileName) {

        if (format == TextFileFormat.PDF) {
            advancedTextReader.openPdfFile(fileName);
        } else if (format == TextFileFormat.EPUB) {
            advancedTextReader.openEpubFile(fileName);
        }

    }

}
