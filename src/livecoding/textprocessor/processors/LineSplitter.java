package livecoding.textprocessor.processors;

import livecoding.textprocessor.InvalidInputException;

import java.util.Arrays;
import java.util.List;

public class LineSplitter implements TextProcessor<String> {

    @Override
    public List<String> process(String input) throws InvalidInputException {
        if (input != null && input.equals("")) {
            throw new InvalidInputException("Пустая строка!");
        }
        return Arrays.stream(input.split("\n")).toList();
    }
}
