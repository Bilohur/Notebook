package com.notebook;

import com.notebook.controller.Controller;
import com.notebook.model.Model;
import com.notebook.view.View;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new Model(), new View());
        controller.processUser();
    }
}
