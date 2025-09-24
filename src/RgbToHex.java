public class RgbToHex {

    public static String rgb(int r, int g, int b) {
        return String.format("%02X%02X%02X",
                Math.max(0, Math.min(255, r)),
                Math.max(0, Math.min(255, g)),
                Math.max(0, Math.min(255, b)));
    }

}



