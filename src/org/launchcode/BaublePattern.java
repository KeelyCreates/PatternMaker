package org.launchcode;


public class BaublePattern extends Pattern {
    //  --o--o--o--o--o

    //needed to make a constructor to instantiate the stitch before making the pattern
    //created an object of the method/class I want to call from
    @Override
    public void patternMaker() {
        Circle circle = new Circle();
        ShortLine shortLine = new ShortLine();

        shortLine.sew();
        shortLine.sew();
        circle.sew();  //repeat 4x more
        shortLine.sew();
        shortLine.sew();
        circle.sew();
        shortLine.sew();
        shortLine.sew();
        circle.sew();
        shortLine.sew();
        shortLine.sew();
        circle.sew();
        shortLine.sew();
        shortLine.sew();
        circle.sew();
    }
}
