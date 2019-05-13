public class CrossStitchWigglePattern extends Pattern {
    public CrossStitchWigglePattern() {
    }

    @Override
    public void pattern() {
        SmallCrossStitch s = new SmallCrossStitch();
        LargeCrossStitch l = new LargeCrossStitch();

        boolean needleJam = (Math.random() < 0.05d);

        for(int i = 0; i < (needleJam ? 3 : 5); i++) {
            s.sew();
            l.sew();
        }
    }
}
