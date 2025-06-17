package livecoding.textprocessor.processors;

import livecoding.textprocessor.InvalidInputException;

import java.util.List;

public class WordLengthFilter implements TextProcessor<List<String>> {

    private final int wordLength;

    public WordLengthFilter(int wordLength) {
        this.wordLength = wordLength;
    }


    @Override
    public List<String> process(List<String> input) throws InvalidInputException {
        return input.stream()
                .filter(str -> str.length() > wordLength)
                .toList();
    }
}
