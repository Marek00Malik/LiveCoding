package pl.code.house.recruiting.java;

import org.apache.commons.lang3.StringUtils;

import java.util.Optional;

public class Optional_Map {

    public static void main(String[] args) {
        System.out.println("Empty value returns: " + Gender.valueOfCaseInsensitive(""));
        System.out.println("Blank value returns: " + Gender.valueOfCaseInsensitive(" "));
        System.out.println("Null value returns: " + Gender.valueOfCaseInsensitive(null));

    }

    enum Gender {
        MALE,
        FEMAIL,
        NOT_SET;

        public static Gender valueOfCaseInsensitive(String value) {
            return Optional.ofNullable(value)
                    .filter(StringUtils::isNoneBlank)
                    .map(StringUtils::upperCase)
                    .map(Gender::valueOf)
                    .orElse(null);
        }
    }
}
