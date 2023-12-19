package com.tresraya.application.views.myview;

import com.tresraya.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.ResponsiveStep;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import java.util.ArrayList;
import java.util.List;

@PageTitle("My View")
@Route(value = "my-view", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
@Uses(Icon.class)
public class MyViewView extends Composite<VerticalLayout> {

    public MyViewView() {
        Button buttonPrimary = new Button();
        FormLayout formLayout3Col = new FormLayout();
        ComboBox comboBox = new ComboBox();
        ComboBox comboBox2 = new ComboBox();
        ComboBox comboBox3 = new ComboBox();
        FormLayout formLayout3Col2 = new FormLayout();
        ComboBox comboBox4 = new ComboBox();
        ComboBox comboBox5 = new ComboBox();
        ComboBox comboBox6 = new ComboBox();
        FormLayout formLayout3Col3 = new FormLayout();
        ComboBox comboBox7 = new ComboBox();
        ComboBox comboBox8 = new ComboBox();
        ComboBox comboBox9 = new ComboBox();
        H2 h2 = new H2();
        H4 h4 = new H4();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        buttonPrimary.setText("Reiniciar");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        formLayout3Col.setWidth("100%");
        formLayout3Col.setResponsiveSteps(new ResponsiveStep("0", 1), new ResponsiveStep("250px", 2),
                new ResponsiveStep("500px", 3));
        comboBox.setLabel("11");
        comboBox.setWidth("min-content");
        setComboBoxSampleData(comboBox);
        comboBox2.setLabel("12");
        comboBox2.setWidth("min-content");
        setComboBoxSampleData(comboBox2);
        comboBox3.setLabel("13");
        comboBox3.setWidth("min-content");
        setComboBoxSampleData(comboBox3);
        formLayout3Col2.setWidth("100%");
        formLayout3Col2.setResponsiveSteps(new ResponsiveStep("0", 1), new ResponsiveStep("250px", 2),
                new ResponsiveStep("500px", 3));
        comboBox4.setLabel("21");
        comboBox4.setWidth("min-content");
        setComboBoxSampleData(comboBox4);
        comboBox5.setLabel("22");
        comboBox5.setWidth("min-content");
        setComboBoxSampleData(comboBox5);
        comboBox6.setLabel("23");
        comboBox6.setWidth("min-content");
        setComboBoxSampleData(comboBox6);
        formLayout3Col3.setWidth("100%");
        formLayout3Col3.setResponsiveSteps(new ResponsiveStep("0", 1), new ResponsiveStep("250px", 2),
                new ResponsiveStep("500px", 3));
        comboBox7.setLabel("31");
        comboBox7.setWidth("min-content");
        setComboBoxSampleData(comboBox7);
        comboBox8.setLabel("32");
        comboBox8.setWidth("min-content");
        setComboBoxSampleData(comboBox8);
        comboBox9.setLabel("33");
        comboBox9.setWidth("min-content");
        setComboBoxSampleData(comboBox9);
        h2.setText("Ganador:");
        h2.setWidth("400px");
        h4.setText("Nombre del jugador");
        h4.setWidth("max-content");
        getContent().add(buttonPrimary);
        getContent().add(formLayout3Col);
        formLayout3Col.add(comboBox);
        formLayout3Col.add(comboBox2);
        formLayout3Col.add(comboBox3);
        getContent().add(formLayout3Col2);
        formLayout3Col2.add(comboBox4);
        formLayout3Col2.add(comboBox5);
        formLayout3Col2.add(comboBox6);
        getContent().add(formLayout3Col3);
        formLayout3Col3.add(comboBox7);
        formLayout3Col3.add(comboBox8);
        formLayout3Col3.add(comboBox9);
        formLayout3Col3.add(h2);
        getContent().add(h4);
    }

    record SampleItem(String value, String label, Boolean disabled) {
    }

    private void setComboBoxSampleData(ComboBox comboBox) {
        List<SampleItem> sampleItems = new ArrayList<>();
        sampleItems.add(new SampleItem("first", "First", null));
        sampleItems.add(new SampleItem("second", "Second", null));
        sampleItems.add(new SampleItem("third", "Third", Boolean.TRUE));
        sampleItems.add(new SampleItem("fourth", "Fourth", null));
        comboBox.setItems(sampleItems);
        comboBox.setItemLabelGenerator(item -> ((SampleItem) item).label());
    }
}
