package com.devsuperior.sistemaClientes.dto;

public class FieldMessage {

    private String fielName;
    private String fielMessage;

    public FieldMessage(String fielName, String fielMessage) {
        this.fielName = fielName;
        this.fielMessage = fielMessage;
    }

    public String getFielName() {
        return fielName;
    }

    public String getFielMessage() {
        return fielMessage;
    }
}
