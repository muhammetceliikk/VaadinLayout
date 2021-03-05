package com.uniyaz.components;

import com.uniyaz.ui.LayoutUI;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;

public class HeaderLayout extends VerticalLayout {

    public HeaderLayout() {

        setSizeFull();

        Label label = new Label("HEADER");
        label.setSizeUndefined();
        label.addStyleName(ValoTheme.LABEL_LARGE);
        label.addStyleName(ValoTheme.LABEL_BOLD);
        label.addStyleName(ValoTheme.LABEL_H4);
        addComponent(label);

        setComponentAlignment(label, Alignment.MIDDLE_CENTER);


    }
}