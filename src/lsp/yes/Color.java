package lsp.yes;

 interface IColor{
    public void getColor();
}

 class Green implements IColor {
    public void getColor() {
        System.out.println("Green");
    }
}

 class Blue implements IColor {
    public void getColor() {
        System.out.println("Blue");
    }
}

class Main{
    public static void main(String[] args) {
        IColor color = new Blue();
        color.getColor();
        //output: Blue
    }
}
