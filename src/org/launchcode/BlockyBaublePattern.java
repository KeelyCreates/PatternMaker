package org.launchcode;

public class BlockyBaublePattern<BlockyBaubleArray> extends Pattern {
    // []--o--[]--o--[]--o--

    @Override
    public void patternMaker() {
        Block block = new Block();
        Circle circle = new Circle();
        ShortLine shortLine = new ShortLine();

        shortLine.sew();
        shortLine.sew();
        circle.sew();  //repeat 2x more
        shortLine.sew();
        shortLine.sew();
        circle.sew();
        shortLine.sew();
        shortLine.sew();
        circle.sew();

    }
}
