package com.peerspace.design.patterns.adapter.file;

public class Main {

    public static void main(String[] args) {
        TextReader textReader = new TextReader();

        textReader.openFile(TextFileFormat.TXT, "Getting_things_done.txt");
        textReader.openFile(TextFileFormat.PDF, "We_Are_Our_Brains.pdf");
        textReader.openFile(TextFileFormat.EPUB, "Thinking_Fast_and_Slow.epub");
    }

}
