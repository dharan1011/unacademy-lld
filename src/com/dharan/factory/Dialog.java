package com.dharan.factory;

public abstract class Dialog {

    public void render(){
        Button okButton = creteButton();
        okButton.onClick();
        okButton.render();
    }

    abstract Button creteButton();
}
