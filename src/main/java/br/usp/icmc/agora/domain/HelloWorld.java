package br.usp.icmc.agora.domain;

import org.hibernate.validator.constraints.NotBlank;

public class HelloWorld {
    private String text;

    @NotBlank
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
