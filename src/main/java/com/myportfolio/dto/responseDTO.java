package com.myportfolio.dto;

import lombok.Data;

@Data
public class responseDTO {
    private String message;

    public responseDTO(String message) {
        this.message = message;
    }

    public responseDTO() {

    }

}
