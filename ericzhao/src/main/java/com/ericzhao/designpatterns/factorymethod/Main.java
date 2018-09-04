package com.ericzhao.designpatterns.factorymethod;

public class Main {
    public static void main(String[] args)
    {
        BaseTranslateFactory chineseTranslateFactory = new ChineseTranslateFactory();
        BaseTranslator chineseTranslator = chineseTranslateFactory.newTranslator();
        chineseTranslator.translate();

        BaseTranslateFactory englishTranslateFactory = new EnglishTranslateFactory();
        BaseTranslator englishTranslator = englishTranslateFactory.newTranslator();
        englishTranslator.translate();
    }
}
