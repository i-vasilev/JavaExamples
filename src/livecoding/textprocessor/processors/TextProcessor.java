package livecoding.textprocessor.processors;

import livecoding.textprocessor.InvalidInputException;

import java.util.List;

public interface TextProcessor<T> {
    List<String> process(T input) throws InvalidInputException;
}

