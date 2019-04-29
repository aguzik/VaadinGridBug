package com.bug.vaadin.grid;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.router.RouterLink;

@Route
public class MainView extends Div implements RouterLayout {
    public MainView() {
        setSizeFull();
        add(new RouterLink("First", FirstView.class));
        add(new RouterLink("Second", SecondView.class));
    }
}
