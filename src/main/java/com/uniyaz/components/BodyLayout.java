package com.uniyaz.components;

import com.vaadin.ui.HorizontalLayout;

public class BodyLayout extends HorizontalLayout {
    private SideBarLayout sideBarLayout;
    private ContentLayout contentLayout;
    public BodyLayout() {
        setSizeFull();

        sideBarLayout=new SideBarLayout();
        addComponent(sideBarLayout);

        contentLayout=new ContentLayout();
        addComponent(contentLayout);

        setExpandRatio(sideBarLayout,3f);
        setExpandRatio(contentLayout,7f);
    }

    public SideBarLayout getSideBarLayout() {
        return sideBarLayout;
    }

    public void setSideBarLayout(SideBarLayout sideBarLayout) {
        this.sideBarLayout = sideBarLayout;
    }

    public ContentLayout getContentLayout() {
        return contentLayout;
    }

    public void setContentLayout(ContentLayout contentLayout) {
        this.contentLayout = contentLayout;
    }

}
