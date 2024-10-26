package isp.yes;

public class Document {
}

interface Readable {
    void read();
}

interface Writable {
    void write();
}

class ReadWriteDocument implements Readable, Writable {
    @Override
    public void read() {
        System.out.println("Reading document...");
    }

    @Override
    public void write() {
        System.out.println("Writing document...");
    }
}

class ReadOnlyDocument implements Readable {
    @Override
    public void read() {
        System.out.println("Reading read-only document...");
    }
}

