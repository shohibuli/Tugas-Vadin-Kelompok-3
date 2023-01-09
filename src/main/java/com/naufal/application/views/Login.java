package com.naufal.application.views;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("Login")
public class Login extends VerticalLayout {
    private LoginForm loginForm;
    public Login(){
        loginForm = new LoginForm();
        loginForm.setAction("Crud");
        setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setAlignItems(Alignment.CENTER);
        add(loginForm);
    }
}
