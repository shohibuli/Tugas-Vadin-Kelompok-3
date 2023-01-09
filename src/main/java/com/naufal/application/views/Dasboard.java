package com.naufal.application.views;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Header;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Nav;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.router.Route;
import org.apache.coyote.http11.Http11InputBuffer;

import javax.swing.*;
import java.awt.*;

@Route("")
public class Dasboard extends AppLayout {


    public Dasboard(){
        HorizontalLayout horizontalLayout = new HorizontalLayout();
        VerticalLayout verticalLayout = new VerticalLayout();
        Tab admin = new Tab("Admin");
        Tab about = new Tab("About");
        Tab Help = new Tab("Help");
        Button Login = new Button("Login");
        Button regis = new Button("Registrasi");
        Login.getStyle().set("font-size", "var(--lumo-font-size-l)")
                .set("margin", "var(--lumo-space-m)");
        regis.getStyle().set("font-size", "var(--lumo-font-size-l)")
                .set("margin-top", "var(--lumo-space-m)");
        Login.addClickListener(event ->{
            UI.getCurrent().navigate("Login");
        });
        regis.addClickListener(event->{
           UI.getCurrent().navigate("Registrasi");
        });
        horizontalLayout.setWidthFull();
        horizontalLayout.setJustifyContentMode(FlexComponent.JustifyContentMode.END);

        horizontalLayout.add(regis,Login);
        H1 title = new H1("Obatin");
        title.getStyle().set("font-size", "var(--lumo-font-size-l)")
                .set("margin", "var(--lumo-space-m)");
        addToNavbar(title, horizontalLayout);

        Image gambar = new Image();
        gambar.getStyle().set("font-size", "var(--lumo-font-size-l)")
                .set("margin", "100px");
        gambar.setSrc("https://publicdomainvectors.org/tn_img/publicdomainq-medicine-doctor-man-talking.webp");
        gambar.setWidth("400px");
        verticalLayout.setSizeFull();
        verticalLayout.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
        verticalLayout.setAlignItems(FlexComponent.Alignment.END);


        Div div = new Div();

        div.setWidth("100%");
        div.setHeight("500px");

        verticalLayout.add(gambar,div);
        setContent(verticalLayout);
    }
}
