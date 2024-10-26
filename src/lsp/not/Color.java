package lsp.not;
/*
    if you have a subclass, it should be usable anywhere its parent class is expected,
     without causing errors or unexpected behavior
*/
//subclasses should not break the "contract" established by the parent class.
class Green2 {
    public void getColor() {
        System.out.println("Green2");
    }
}

class Blue extends Green2 {
    public void getColor() {
        System.out.println("Blue");
    }
}

class Caller {
    public void caller() {
        // violate LSP because color of green object is blue
        Green2 green = new Blue();
        green.getColor();
        //output: Blue
    }
}
