package com.ericzhao.designpatterns.factorymethod;

public class ChineseTranslateFactory implements BaseTranslateFactory {

    public BaseTranslator newTranslator() {
        return new ChineseTranslator();
    }
}
