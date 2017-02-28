package com.loading.texteditor_javabase;

import com.loading.texteditor.SpellChecker;

/**
 * Created by wuyuxiang on 2017/2/27.
 */
public class TextEditor {
    private SpellChecker spellChecker;
    public TextEditor(SpellChecker spellChecker) {
        System.out.println("Inside TextEditor constructor.");
        this.spellChecker = spellChecker;
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
