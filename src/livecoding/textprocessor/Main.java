package livecoding.textprocessor;

import livecoding.textprocessor.processors.LineSplitter;
import livecoding.textprocessor.processors.WordExtractor;
import livecoding.textprocessor.processors.WordLengthFilter;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        TextProcessingPipeline<String> pipeline = new TextProcessingPipeline<>();
        pipeline.addProcessor(new LineSplitter());
        pipeline.addProcessor(new WordExtractor());

        TextProcessingPipeline<List<String>> pipeline2 = new TextProcessingPipeline<>();
        pipeline2.addProcessor(new WordLengthFilter(5));

        List<String> result = pipeline2.runPipeline(pipeline.runPipeline("Java — это не просто язык\n программирования!"));
        System.out.println(result); // [программирования]
    }
}
