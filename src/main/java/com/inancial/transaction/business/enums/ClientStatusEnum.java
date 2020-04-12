package com.inancial.transaction.business.enums;

public enum ClientStatusEnum {

    ATIVO("Ativo"), 
    INATIVO("Inativo"); 
 
    private String status;
 
    ClientStatusEnum(String status) {
        this.status = status;
    }
 
    public String getStatus() {
        return status;
    }	
}
