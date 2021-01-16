package adapterPattern;

import java.util.Arrays;

interface Processor {
    public String name();

    Object process(Object input);
}

abstract class StringProcess implements Processor{
    public String name() {
        return getClass().getSimpleName();
    }
}

class Upcase extends StringProcess {

    @Override
    public String process(Object input) {
        return ((String)input).toUpperCase();
    }
}

class Downcase extends StringProcess {

    @Override
    public String process(Object input) {
        return ((String)input).toLowerCase();
    }
}

class Splitter extends StringProcess {

    @Override
    public String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}


