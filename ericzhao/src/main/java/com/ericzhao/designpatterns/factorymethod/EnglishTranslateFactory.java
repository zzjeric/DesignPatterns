package com.ericzhao.designpatterns.factorymethod;

public class EnglishTranslateFactory implements BaseTranslateFactory {
    public BaseTranslator newTranslator() {
        return new EnglishTranslator();
    }
}
