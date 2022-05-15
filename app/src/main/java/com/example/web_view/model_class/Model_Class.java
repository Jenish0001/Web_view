package com.example.web_view.model_class;

public class Model_Class {
    int set_img;
    String name;
    String link;

    public int getSet_img() {
        return set_img;
    }

    public void setSet_img(int set_img) {
        this.set_img = set_img;
    }

    public Model_Class(String name, String s, int i) {
        this.name = name;
        this.link = s;
        this.set_img = i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

}
