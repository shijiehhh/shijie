public class lv3 {
    public static void main(String[] args) {
        int s = 0;
        lab:
        for (int i = 2; i <= 200; i++) {
            for (int j = 2; j <= (int) (Math.sqrt(i)); j++) {
                if (i % j == 0) {
                    continue lab;
                }
            }
            System.out.println(i);
            s++;
        }
        System.out.println(s);
    }
}
