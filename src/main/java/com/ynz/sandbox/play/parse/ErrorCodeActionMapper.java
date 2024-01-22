package com.ynz.sandbox.play.parse;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ErrorCodeActionMapper {

    /**
     * creating a data structure which mapping error-code to its error message  regular expression pattern and
     * corresponding action.
     */

    @Getter
    private Map<String, Map<String, String>> errorCodeActionMap = new HashMap<>();

    @Setter
    private List<CodeErrorActionDataObject> codeErrorActions;

    private ErrorCodeActionMapper() {
    }

    public Optional<Map<String, String>> getErrorCodeMap(String errorCode) {
        if (errorCode == null) return Optional.empty();
        return Optional.ofNullable(errorCodeActionMap.get(errorCode));
    }

    public void buildErrorCodeActionMap() {
        if (codeErrorActions == null) return;

        codeErrorActions.forEach(codeErrorAction -> {
            String code = codeErrorAction.getCode();
            String pattern = codeErrorAction.getPattern();
            String action = codeErrorAction.getAction();

            Map<String, String> patternActionMap = new HashMap<>();

            errorCodeActionMap.putIfAbsent(code, patternActionMap);

            errorCodeActionMap.computeIfPresent(code, (key, value) -> {
                value.put(pattern, action);
                return value;
            });
        });
    }

    public static ErrorCodeActionMapper getInstance() {
        return new ErrorCodeActionMapper();
    }
}
