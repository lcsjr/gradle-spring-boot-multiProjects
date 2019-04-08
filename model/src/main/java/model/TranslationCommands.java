package model;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class TranslationCommands {

    private final String service;

    @Autowired
    public TranslationCommands(String service) {
      this.service = service;
    }

    @ShellMethod("Translate text from one language to another.")
    public String translate(
      @ShellOption(optOut = true) String text,
      @ShellOption(optOut = true, defaultValue = "en_US") Locale from,
      @ShellOption(optOut = true) Local to
    ) {
      // invoke service
      return service;
    }
}