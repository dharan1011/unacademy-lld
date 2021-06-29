package com.dharan;

import com.dharan.factory.Dialog;
import com.dharan.factory.HtmlDialog;
import com.dharan.factory.WindowsDialog;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String env = in.nextLine();
        Dialog dialog;
        if(env.equalsIgnoreCase("win")){
            dialog = new WindowsDialog();
        }else{
            dialog = new HtmlDialog();
        }
        dialog.render();
    }
}
