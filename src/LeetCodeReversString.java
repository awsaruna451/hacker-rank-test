public class LeetCodeReversString {

    public static String reverseStr(String s, int k) {
        StringBuilder buil = new StringBuilder();
        int len = s.length()/(2*k);
        System.out.println(len);
        for (int i =0; i < len; i++) {
            String val = s.substring(i*2*k, (i+1)*2*k);
            for (int n=k; n >0;n-- ) {
                buil.append(val.charAt(n-1));
            }
            buil.append(val.substring(k, val.length()));



     /*       for (int z =val.length(); z >0 ; z--) {
                buil.append(val.charAt(z-1));
            }
           *//* for (int j = 1; j <= val.length(); j++){
                String p = "";
                if (j == k) {
                   // p = String.valueOf(val.charAt(j-2));
                    buil.append(val.charAt(j-1));
                }
                else {
                    buil2.append(val.charAt(j-1));
                    //p = String.valueOf(val.charAt(j-1));
                }

            }
            buil.append(buil2.toString());*/


        }
        System.out.println(buil);

        int rotateLen = (len * 2 *k);
        int remainLen = s.length() - rotateLen;
        if (remainLen > 0) {
            String val2= s.substring(rotateLen, s.length());
            if (remainLen < k) {
                for (int z =remainLen; z >0 ; z--) {
                    buil.append(val2.charAt(z-1));
                }
            } else {
            /*    for (int z =1; z <= remainLen ; z++) {
                    if (z == k) {
                        buil.append(val2.charAt(z-2));

                    } else if(z == (k-1)) {
                        buil.append(val2.charAt(z));
                    } else {
                        buil.append(val2.charAt(z-1));
                    }
                }*/

                for (int n=k; n >0;n-- ) {
                    buil.append(val2.charAt(n-1));
                }
                buil.append(val2.substring(k, val2.length()));

            }

        }


         return buil.toString();
    }

    public static void main(String[] args) {

      //  reverseStr("abcdefg", 2);

        System.out.println(reverseStr("abcdef", 3));
    }
}
