package com.kodilla;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("text", (text) -> "ABC" +" "+text);
        poemBeautifier.beautify("text", (text) -> text + " " + "ABC");
        poemBeautifier.beautify("text", word -> word.toUpperCase());
        poemBeautifier.beautify("TEXT", (text) -> text.toLowerCase());
        poemBeautifier.beautify("newText", (text) -> text + " ABC " + text);
    }
}
