package com.bug.vaadin.grid;

import com.bug.vaadin.grid.data.Address;
import com.bug.vaadin.grid.data.AddressRepository;
import com.bug.vaadin.grid.data.User;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.data.provider.ListDataProvider;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.annotation.SpringComponent;
import com.vaadin.flow.spring.annotation.UIScope;

@Route(value="second", layout = MainView.class)
@SpringComponent
public class SecondView extends VerticalLayout {

    public SecondView(AddressRepository repository) {
        Grid<Address> grid = new Grid<>();
        grid.addColumn(Address::getId).setHeader("ID");
        grid.addColumn(Address::getAddress).setHeader("NAME");
        add(grid);
        grid.setDataProvider(new ListDataProvider<>(repository.findAll()));
    }
}
