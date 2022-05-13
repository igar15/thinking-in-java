package ru.javaprojects.thinkinginjava.chapter9.exercise11;

public class ChapSwapperAdapter implements Processor {
    private CharSwapper charSwapper;

    public ChapSwapperAdapter(CharSwapper charSwapper) {
        this.charSwapper = charSwapper;
    }

    @Override
    public Object process(Object input) {
        return charSwapper.swap((String) input);
    }
}
