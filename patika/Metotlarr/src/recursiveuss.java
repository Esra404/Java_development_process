public class recursiveuss {

     static int usbul(int us,int taban) {
         if (us == 1) {
             return 1;
         } else {
             int result = 1;
             for (int i = 1; i <= taban; i++) {
                 result *= us;
             }
             return usbul(2, 3);

         }
     }
    public static void main(String[] args) {

        System.out.println(usbul(2,3));
    }
}
