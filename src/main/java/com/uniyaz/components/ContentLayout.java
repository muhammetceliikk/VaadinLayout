package com.uniyaz.components;

import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

public class ContentLayout extends VerticalLayout {
    Label contentLabel;
    public ContentLayout() {

        setSizeFull();
        contentLabel=new Label("CONTENT");
        addStyleName("layout-with-border");
        contentLabel.addStyleName(ValoTheme.LABEL_LARGE);
        contentLabel.addStyleName(ValoTheme.LABEL_BOLD);
        contentLabel.addStyleName(ValoTheme.LABEL_H4);
        addComponent(contentLabel);
    }

    public Label getContentLabel() {
        return contentLabel;
    }

    public void setContentLabel(String contentLabel) {
        this.contentLabel.setValue(contentLabel);
    }
}
