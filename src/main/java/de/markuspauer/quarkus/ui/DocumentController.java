package de.markuspauer.quarkus.ui;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class DocumentController implements Serializable {
    private String hello = "Hello";

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

    public void machWas() {
        String output = "";
        for (int i = this.hello.length() - 1; i >= 0; i--) {
            output = output + this.hello.charAt(i);
        }
        this.hello = output;
    }
}
