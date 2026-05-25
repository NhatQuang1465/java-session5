public class lesson2 {
    public static void main(String[] args) {

        long start;
        long end;

        start = System.currentTimeMillis();

        String str = "Hello";

        for (int i = 0; i < 1000000; i++) {
            str += " World";
        }

        end = System.currentTimeMillis();

        System.out.println("String: " + (end - start) + " ms");



        start = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder("Hello");

        for (int i = 0; i < 1000000; i++) {
            sb.append(" World");
        }

        end = System.currentTimeMillis();

        System.out.println("StringBuilder: " + (end - start) + " ms");



        start = System.currentTimeMillis();

        StringBuffer sf = new StringBuffer("Hello");

        for (int i = 0; i < 1000000; i++) {
            sf.append(" World");
        }

        end = System.currentTimeMillis();

        System.out.println("StringBuffer: " + (end - start) + " ms");



        System.out.println("\nNhan xet:");
        System.out.println("String cham nhat vi tao doi tuong moi sau moi lan noi.");
        System.out.println("StringBuilder nhanh nhat, phu hop chuong trinh don luong.");
        System.out.println("StringBuffer cham hon StringBuilder do co dong bo hoa, phu hop da luong.");
    }
}

