package org.launchcode;

public class ZigZagPattern<ZigZagArray> extends Pattern {
    //ZZZ===ZZZ===

    @Override
    public void patternMaker() {
        Fill fill = new Fill();
        ZigZag zigZag = new ZigZag();

        zigZag.sew();
        zigZag.sew();
        zigZag.sew();
        fill.sew();
        fill.sew();
        fill.sew();//repeat pattern 1x more
        zigZag.sew();
        zigZag.sew();
        zigZag.sew();
        fill.sew();
        fill.sew();
        fill.sew();

    }
}
