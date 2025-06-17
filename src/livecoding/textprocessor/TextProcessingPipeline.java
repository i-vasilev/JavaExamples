package livecoding.textprocessor;

import livecoding.textprocessor.processors.TextProcessor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TextProcessingPipeline<T> {
    private List<TextProcessor<T>> processors = new ArrayList<>();

    public void addProcessor(TextProcessor<T> processor) {
        processors.add(processor);
    }

    public List<String> runPipeline(T input) {
        return processors.stream()
                .flatMap(processor -> processString(input, processor))
                .toList();
    }

    private Stream<String> processString(T input, TextProcessor<T> processor) {
        try {
            return processor.process(input).stream();
        } catch (InvalidInputException e) {
            throw new RuntimeException(e);
        }
    }
}

