package katas.CamelCase;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Camel case converter")
class CamelCaseConverterTest {

    @Test
    @DisplayName("Allows empty text")
    void allowsEmptyText() {
        assertEquals("", CamelCase.ConvertToCamelCase(""));
    }

    @Test
    @DisplayName("Allows capitalized word")
    void allowsCapitalizedWord() {
        assertEquals("Foo", CamelCase.ConvertToCamelCase("Foo"));
    }

    @Test
    @DisplayName("Joins the capitalized words that are separated by spaces")
    void joinsTheCapitalizedWordsSeparatedBySpaces() {
        assertEquals("FooBar", CamelCase.ConvertToCamelCase("Foo Bar"));
    }

    @Test
    @DisplayName("Joins the capitalized words that are separated by hyphen")
    void joinsCapitalizedWordsSeparatedByHyphen() {
        assertEquals("FooBarFoo", CamelCase.ConvertToCamelCase("Foo-Bar_Foo"));
    }

    @Test
    @DisplayName("Converts the first character of one word to uppercase")
    void convertsTheFirstCharacterToUppercase() {
        assertEquals("Foo", CamelCase.ConvertToCamelCase("foo"));
    }

    @Test
    @DisplayName("Converts the first character of each word to uppercase")
    void convertsTheFirstEachCharacterToUppercase() {
        assertEquals("FooBarFoo", CamelCase.ConvertToCamelCase("foo_bar-foo"));
    }
}