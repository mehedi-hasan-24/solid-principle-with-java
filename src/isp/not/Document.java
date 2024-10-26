package isp.not;

interface Document {
    void read();

    void write();
}

//Happy Class
class ReadWriteDocument implements Document {
    @Override
    public void read() {
        System.out.println("Reading document...");
    }

    @Override
    public void write() {
        // Unsupported for read-only documents
        System.out.println("writing document...");
    }
}

//Violating Class
class ReadOnlyDocument implements Document {
    @Override
    public void read() {
        System.out.println("Reading document...");
    }

    @Override
    public void write() {
        // Unsupported for read-only documents
        throw new UnsupportedOperationException("Write not supported.");
    }
}

