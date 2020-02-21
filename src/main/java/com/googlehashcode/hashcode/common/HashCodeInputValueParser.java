package com.googlehashcode.hashcode.common;

import java.util.Scanner;

@FunctionalInterface
public interface HashCodeInputValueParser<T> {

    T parse(Scanner scanner);
}
