package livecoding.textprocessor.processors;

import livecoding.textprocessor.InvalidInputException;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordExtractor implements TextProcessor<String> {
    @Override
    public List<String> process(String input) throws InvalidInputException {
        Pattern pattern = Pattern.compile("([А-Яа-я0-9]+)");
        Matcher matcher = pattern.matcher(input);

        List<String> result = new ArrayList<>();
        while (matcher.find()) {
            result.add(matcher.group());
        }

        return result;
    }
}
