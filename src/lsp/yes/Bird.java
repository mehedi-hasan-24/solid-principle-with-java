package lsp.yes;

interface Bird {
    // to do;
    public void walk();
}

interface FlyingBird extends Bird {
    public void fly();
}

interface WalkingBird extends Bird {
//    public void walk();
}

class Parrot implements FlyingBird, WalkingBird {

    public void fly() { /* logic */}

    public void walk() { /* logic */ }
}

class Penguin implements WalkingBird {
    public void walk() { /* logic */ }
}
