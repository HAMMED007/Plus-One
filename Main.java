

public class Main {
    public static void main(String[] args) {

int [] number = {1,2,3};


        System.out.println(Solution.plusOne(number)[0]);
        System.out.println(Solution.plusOne(number)[1]);
        System.out.println(Solution.plusOne(number)[2]);



    }

    static class Solution {
        public static int[] plusOne(int[] digits) {

            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();


            for (int i = 0; i < digits.length; i++) {
                sb.append(digits[i]);
            }


            int resulting_number = Integer.parseInt(String.valueOf(sb)) +1;
            sb2.append(resulting_number);



            int[] num = new int[sb2.length()];

            for (int i = 0; i < sb2.length(); i++) {
                int nu1m =Character.getNumericValue(sb2.charAt(i));
                num[i] = nu1m;
            }


            return num;
        }
    }


}