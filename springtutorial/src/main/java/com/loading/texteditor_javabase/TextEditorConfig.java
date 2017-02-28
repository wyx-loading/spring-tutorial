package com.loading.texteditor_javabase;

import com.loading.texteditor.SpellChecker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wuyuxiang on 2017/2/27.
 */
@Configuration
public class TextEditorConfig {
    @Bean
    public TextEditor textEditor() {
        return new TextEditor(spellChecker());
    }
    @Bean
    public SpellChecker spellChecker() {
        return new SpellChecker();
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(TextEditorConfig.class);
        TextEditor te = context.getBean(TextEditor.class);
        te.spellCheck();
        te = null;
        System.gc();
        TextEditor te2 = (TextEditor) context.getBean("textEditor");
        te2.spellCheck();
    }
}
