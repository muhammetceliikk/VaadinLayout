package com.uniyaz.ui;

import com.uniyaz.components.BodyLayout;
import com.uniyaz.components.FooterLayout;
import com.uniyaz.components.HeaderLayout;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.Page;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.*;

@Theme("mytheme")
@Widgetset("com.uniyaz.MyAppWidgetset")
public class LayoutUI extends UI {

    private VerticalLayout mainLayout;
    private HeaderLayout headerLayout;
    private BodyLayout bodyLayout;
    private FooterLayout footerLayout;

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        buildMainLayout();
        setContent(mainLayout);
    }

    private void buildMainLayout() {

        final Page.Styles styles = Page.getCurrent().getStyles();

        String css = ".layout-with-border {\n" +
                "    border: 1px solid black;\n" +
                "}";

        styles.add(css);

        mainLayout = new VerticalLayout();
        mainLayout.setSizeFull();

        headerLayout = new HeaderLayout();
        headerLayout.addStyleName("layout-with-border");

        mainLayout.addComponent(headerLayout);
        mainLayout.setExpandRatio(headerLayout,1f);

        bodyLayout=new BodyLayout();
        mainLayout.addComponent(bodyLayout);
        mainLayout.setExpandRatio(bodyLayout,8f);

        footerLayout = new FooterLayout();
        footerLayout.addStyleName("layout-with-border");

        mainLayout.addComponent(footerLayout);
        mainLayout.setExpandRatio(footerLayout,1f);

    }

    public BodyLayout getBodyLayout() {
        return bodyLayout;
    }


    public void setBodyLayout(BodyLayout bodyLayout) {
        this.bodyLayout = bodyLayout;
    }
}