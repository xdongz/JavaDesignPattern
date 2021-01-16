package adapterPattern;

public class Main {

    public static void main(String[] args) {
        String s = "How are you?";
        Apply.process(new Upcase(), s);
        Apply.process(new Downcase(), s);
        Apply.process(new Splitter(), s);

        Waveform wf = new Waveform();
        Apply.process(new filterAdapter(new HighPass(1)), wf);
        Apply.process(new filterAdapter(new LowPass(10)), wf);
        Apply.process(new filterAdapter(new BandPass(1,10)), wf);
    }
}

class Apply {
    public static void process(Processor p, Object s) {
        System.out.println("Using processor " + p.name());
        System.out.println(p.process(s));
    }
}

class filterAdapter implements Processor{
    private Filter f;

    public filterAdapter(Filter f) {
        this.f = f;
    }

    @Override
    public String name() {
        return f.name();
    }

    @Override
    public Waveform process(Object input) {
        return f.process((Waveform) input);
    }
}

