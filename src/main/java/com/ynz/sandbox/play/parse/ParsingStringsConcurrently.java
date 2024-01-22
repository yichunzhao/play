package com.ynz.sandbox.play.parse;

import java.util.ArrayList;
import java.util.List;

public class ParsingStringsConcurrently {


    private static final String pattern = ".*(word1|word2).*(word2|word4).*";


    public static void main(String[] args) {

        ErrorCodeActionMapper mapper = ErrorCodeActionMapper.getInstance();

        // create a list of error-code action data objects
        List<CodeErrorActionDataObject> dataObjects = new ArrayList<>();
        dataObjects.add(new CodeErrorActionDataObject("E001", "word1,word2", "action1"));
        dataObjects.add(new CodeErrorActionDataObject("E001", "word3,word4", "action2"));
        dataObjects.add(new CodeErrorActionDataObject("E002", "word5,word6", "action3"));

        // add the list to the mapper
        mapper.setCodeErrorActions(dataObjects);

        // build the map
        mapper.buildErrorCodeActionMap();

        // get the map by error-code
        var myMap = mapper.getErrorCodeActionMap();
        System.out.println(myMap);
    }
}
