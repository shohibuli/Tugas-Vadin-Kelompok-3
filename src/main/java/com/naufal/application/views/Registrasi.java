package com.naufal.application.views;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("Registrasi")
public class Registrasi extends VerticalLayout {
    public Registrasi(){

        setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setAlignItems(Alignment.CENTER);
        TextField email = new TextField();
        TextField nama = new TextField();
        TextField nomer = new TextField();
        TextField password = new TextField();
        TextField JenisKelamin = new TextField();
        email.setLabel("Email");
        email.setWidth("300px");
        nama.setWidth("300px");
        nama.setLabel("Nama");
        nomer.setWidth("300px");
        nomer.setLabel("Nomer");
        password.setWidth("300px");
        password.setLabel("Password");
        JenisKelamin.setWidth("300px");
        JenisKelamin.setLabel("Jenis Kelamin");


        add(email,nama,JenisKelamin,nomer,password);

    }
}
