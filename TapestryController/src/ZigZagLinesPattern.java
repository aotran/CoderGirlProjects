public class ZigZagLinesPattern extends Pattern{
    public ZigZagLinesPattern() {
    }

    @Override
    public void pattern() {
        ZigZagStitch z = new ZigZagStitch();
        FillStitch f = new FillStitch();

        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < 3; i++) {
                z.sew();
            }
            for (int i = 0; i < 3; i++) {
                f.sew();
            }
        }
    }
}
