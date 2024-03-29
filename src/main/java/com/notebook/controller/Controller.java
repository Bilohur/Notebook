package com.notebook.controller;

import com.notebook.model.Model;
import com.notebook.view.View;

import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        InputNoteBook inputNoteBook = new InputNoteBook(view, sc);
        inputNoteBook.inputNote();

    }
}
