package com.dharan.factory;

public class WindowsDialog extends Dialog {
    @Override
    Button creteButton() {
        return new WindowsButton();
    }
}
