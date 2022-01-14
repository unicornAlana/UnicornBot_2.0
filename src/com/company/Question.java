package com.company;

import java.util.HashMap;
import java.util.Map;

public class Question {
    Map<Language, String> questions = new HashMap<>();

    public void addQuestion(Language whichLanguage, String text) {
        questions.put(whichLanguage,text);
    }

    // Use this to get the text of question q by calling, e.g.,
    // String str = q.getQuestionText(Language.SPANISH);
    public String getQuestionText(Language whichLanguage) {
        return questions.get(whichLanguage);
    }
}
