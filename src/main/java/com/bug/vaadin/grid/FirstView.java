package com.bug.vaadin.grid;

import com.bug.vaadin.grid.data.User;
import com.bug.vaadin.grid.data.UserRepository;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.data.provider.ListDataProvider;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.annotation.SpringComponent;
import com.vaadin.flow.spring.annotation.UIScope;

@Route(value="first", layout = MainView.class)
@SpringComponent
@UIScope
public class FirstView extends VerticalLayout {

    public FirstView(UserRepository repository) {
        Grid<User> grid = new Grid<>();
        grid.addColumn(User::getId).setHeader("ID");
        grid.addColumn(User::getName).setHeader("NAME");
        add(grid);
        grid.setDataProvider(new ListDataProvider<>(repository.findAll()));
    }
}
