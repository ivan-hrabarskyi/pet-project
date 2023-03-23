package com.peerspace.design.patterns.adapter;

public class TextReader implements TextFormatReader {

    private TextFormatAdapter textFormatAdapter;

    @Override
    public void openFile(TextFileFormat format, String fileName) {

        if (format == TextFileFormat.TXT) {
            System.out.println("Opened Txt file with name: " + fileName);
        } else {
            textFormatAdapter = new TextFormatAdapter(format);
            textFormatAdapter.openFile(format, fileName);
        }

    }

}
