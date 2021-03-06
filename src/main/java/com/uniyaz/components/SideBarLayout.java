package com.uniyaz.components;

import com.uniyaz.ui.LayoutUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

public class SideBarLayout extends VerticalLayout {
    public SideBarLayout() {
        //label.setValue(((LayoutUI) UI.getCurrent()).getBodyLayout().getContentLayout().getContentLabel().getValue());

        setSizeFull();

        addStyleName("layout-with-border");
        Label sidebar = new Label("SIDEBAR");
        sidebar.addStyleName(ValoTheme.LABEL_LARGE);
        sidebar.addStyleName(ValoTheme.LABEL_BOLD);
        sidebar.addStyleName(ValoTheme.LABEL_H4);
        addComponent(sidebar);

        Button button1 = new Button("Anasayfa");
        button1.addStyleName(ValoTheme.BUTTON_FRIENDLY);
        button1.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                ((LayoutUI) UI.getCurrent()).getBodyLayout().getContentLayout().setContentLabel("Anasayfa");
            }
        });
        addComponent(button1);

        Button button2 = new Button("İletişim");
        button2.addStyleName(ValoTheme.BUTTON_FRIENDLY);
        button2.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                ((LayoutUI) UI.getCurrent()).getBodyLayout().getContentLayout().setContentLabel("İletişim");
            }
        });
        addComponent(button2);

        Button button3 = new Button("Hakkımızda");
        button3.addStyleName(ValoTheme.BUTTON_FRIENDLY);
        button3.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                ((LayoutUI) UI.getCurrent()).getBodyLayout().getContentLayout().setContentLabel("Hakkımızda");
            }
        });
        addComponent(button3);

    }
}
