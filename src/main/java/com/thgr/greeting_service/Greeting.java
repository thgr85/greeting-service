package com.thgr.greeting_service;

import java.io.Serializable;

public class Greeting implements Serializable {
    private Long id;
    private String template;

    public Greeting() {}

    public Greeting(Long id, String template) {
        this.id = id;
        this.template = template;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }
}
