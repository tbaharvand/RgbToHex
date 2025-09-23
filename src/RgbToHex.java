public class RgbToHex {

    public static String rgb(int r, int g, int b) {
        int kharej=0;
        int baghi=0;
        if (r >= 0 && r <= 255) {
            kharej = r / 16;
            baghi = r % 16;
            if (kharej < 10)
                System.out.print(kharej);
            if (kharej >= 10) {
                switch (kharej) {
                    case 10 -> System.out.print("A");
                    case 11 -> System.out.print("B");
                    case 12 -> System.out.print("C");
                    case 13 -> System.out.print("D");
                    case 14 -> System.out.print("E");
                    case 15 -> System.out.print("F");
                    default -> System.out.println("incorrect");
                }
            }

            if (baghi < 10)
                System.out.print(baghi);
            if (baghi >= 10) {
                switch (baghi) {
                    case 10 -> System.out.print("A");
                    case 11 -> System.out.print("B");
                    case 12 -> System.out.print("C");
                    case 13 -> System.out.print("D");
                    case 14 -> System.out.print("E");
                    case 15 -> System.out.print("F");
                    default -> System.out.println("incorrect");
                }
            }

        }else if (r>255)
            System.out.print("F");
        else if (r<0)
            System.out.print("00");

        if (g >= 0 && g <= 255) {
            kharej = g / 16;
            baghi = g % 16;
            if (kharej < 10)
                System.out.print(kharej);
            if (kharej >= 10) {
                switch (kharej) {
                    case 10 -> System.out.print("A");
                    case 11 -> System.out.print("B");
                    case 12 -> System.out.print("C");
                    case 13 -> System.out.print("D");
                    case 14 -> System.out.print("E");
                    case 15 -> System.out.print("F");
                    default -> System.out.println("incorrect");
                }
            }

            if (baghi < 10)
                System.out.print(baghi);
            if (baghi >= 10) {
                switch (baghi) {
                    case 10 -> System.out.print("A");
                    case 11 -> System.out.print("B");
                    case 12 -> System.out.print("C");
                    case 13 -> System.out.print("D");
                    case 14 -> System.out.print("E");
                    case 15 -> System.out.print("F");
                    default -> System.out.println("incorrect");
                }
            }

        }
        else if (g>255)
            System.out.print("F");
        else if (g<0)
            System.out.print("00");


        if (b >= 0 && b <= 255) {
            kharej = b / 16;
            baghi = b % 16;
            if (kharej < 10)
                System.out.print(kharej);

            if (kharej >= 10) {
                switch (kharej) {
                    case 10 -> System.out.print("A");
                    case 11 -> System.out.print("B");
                    case 12 -> System.out.print("C");
                    case 13 -> System.out.print("D");
                    case 14 -> System.out.print("E");
                    case 15 -> System.out.print("F");
                    default -> System.out.println("incorrect");
                }
            }

            if (baghi < 10)
                System.out.print(baghi);
            if (baghi >= 10) {
                switch (baghi) {
                    case 10 -> System.out.print("A");
                    case 11 -> System.out.print("B");
                    case 12 -> System.out.print("C");
                    case 13 -> System.out.print("D");
                    case 14 -> System.out.print("E");
                    case 15 -> System.out.print("F");
                    default -> System.out.println("incorrect");
                }
            }
        }else if (b>255)
            System.out.print("F");
        else if (b<0)
            System.out.print("00");



        return String.format("%02X%02X%02X",
                Math.max(0, Math.min(255, r)),
                Math.max(0, Math.min(255, g)),
                Math.max(0, Math.min(255, b)));


    }

}



