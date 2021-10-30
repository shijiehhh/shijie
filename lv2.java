public class lv2 {
    public static void main(String[] args){
        int a =(int)(Math.random()*900)+100;
        int b = a / 100;
        int c = (a / 10) % 10;
        int d = a % 10;
        if(a ==Math.pow(b,3)+Math.pow(c,3)+Math.pow(d,3)){
            System.out.println("是水仙花数:"+a);
        }else {
            System.out.println("不是水仙花数:"+a);
        }
    }
}