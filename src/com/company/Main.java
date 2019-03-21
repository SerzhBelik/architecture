package com.company;

public class Main {

    public static void main(String[] args) {
        Controller controller = new ClientController();
        ClientUI clientUI = new MainWindow(controller);
        controller.showUI(clientUI);
    }
}
