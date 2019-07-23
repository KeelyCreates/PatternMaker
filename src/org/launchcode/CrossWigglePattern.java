package org.launchcode;

public class CrossWigglePattern<CrossWiggleArray> extends Pattern {
    // xXxXxXxXxX

    @Override
    public void patternMaker() {
        LgCross lgCross = new LgCross();
        SmCross smCross = new SmCross();

        smCross.sew();
        lgCross.sew();//repeat 4x more
        smCross.sew();
        lgCross.sew();
        smCross.sew();
        lgCross.sew();
        smCross.sew();
        lgCross.sew();
        smCross.sew();
        lgCross.sew();

    }
}
