package com.dharan.factory;

public class HtmlDialog extends Dialog{
    @Override
    Button creteButton() {
        return new HtmlButton();
    }
}
