package com.company;

public class Main {

    public static void main(String[] args) {
        Controller controller = new ClientController();
        ClientUI clientUI = MainWindow.newBuilder()
                .setController(controller)
                .setHeight(800)
                .setWidth(400)
                .setTitle("Insurence calculate")
                .build();
        controller.showUI(clientUI);
    }
}
