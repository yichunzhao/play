package com.ynz.sandbox.play.parse;

public class UsingErrorCodeActionMapper {

    public static void main(String[] args) {
        var mapper = ErrorCodeActionMapper.getInstance();

        System.out.println(mapper.toString());

        var errorCodeMap = mapper.getErrorCodeMap("E001");
        errorCodeMap.ifPresent(System.out::println);

    }
}
