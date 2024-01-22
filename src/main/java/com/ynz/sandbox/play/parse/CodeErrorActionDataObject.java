package com.ynz.sandbox.play.parse;

import lombok.Data;

@Data
public class CodeErrorActionDataObject {
    private String code ;
    private String pattern;
    private String action;

    public CodeErrorActionDataObject(String code, String pattern, String action){
        this.code = code;
        this.pattern = pattern;
        this.action = action;
    }
}
