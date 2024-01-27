package com.ynz.sandbox.play.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

public class ConvertToJason {

    @Data
    static class Action implements java.io.Serializable {

        private String action;

        public Action() {
        }

        public Action(String action) {
            this.action = action;
        }
    }

    public static void main(String[] args) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();

        //nested map data structure Map<String, Map<String, Action>> errorCodeActionMap = new HashMap<>();
        Map<String, Map<String, Action>> codeMessageMap = new HashMap<>();

        Map<String, Action> messageActionMap = new HashMap<>();

        messageActionMap.put("word1,word2", new Action("action1"));
        messageActionMap.put("word3,word4", new Action("action2"));

        codeMessageMap.put("E001", messageActionMap);
        String json = null;
        try {
             json = mapper.writeValueAsString(codeMessageMap);
            System.out.println(json);
        } catch (Exception e) {
            e.printStackTrace();
        }

        var deserialized = mapper.readValue(json, new TypeReference<Map<String, Map<String, Action>>>() {
        });

        System.out.println(deserialized);
    }
}
