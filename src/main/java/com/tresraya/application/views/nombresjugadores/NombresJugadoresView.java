package com.tresraya.application.views.nombresjugadores;

import com.tresraya.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Nombres Jugadores")
@Route(value = "nombres-jugadores", layout = MainLayout.class)
@Uses(Icon.class)
public class NombresJugadoresView extends Composite<VerticalLayout> {

    public NombresJugadoresView() {
        TextField textField = new TextField();
        TextField textField2 = new TextField();
        DatePicker datePicker = new DatePicker();
        Button buttonPrimary = new Button();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        textField.setLabel("Jugador 1");
        textField.setWidth("min-content");
        textField2.setLabel("Jugador 2");
        textField2.setWidth("min-content");
        datePicker.setLabel("Fecha del juego");
        datePicker.setWidth("min-content");
        buttonPrimary.setText("Save");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        getContent().add(textField);
        getContent().add(textField2);
        getContent().add(datePicker);
        getContent().add(buttonPrimary);
    }
}
