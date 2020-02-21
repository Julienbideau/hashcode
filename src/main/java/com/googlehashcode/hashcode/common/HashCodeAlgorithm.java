package com.googlehashcode.hashcode.common;

public interface HashCodeAlgorithm<T> {

    HashCodeSolution run(T input, HashCodeLogger logger);
}
