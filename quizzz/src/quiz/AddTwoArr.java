package quiz;

public class AddTwoArr {
    public static void main(String[] args) {
        int[] a = new int[]{78, 54, 89, 57, 84};
        int[] b = new int[]{95, 74, 91, 84};
        int[] num = arrAdd(a, b);
        prt(num);

    }

    public static int[] arrAdd(int[] a, int[] b) { // 두 배열을 더하는 메소드
        int[] arrAdd = new int[5];
        for (int i = 0; i < a.length; i++) {
            if (b.length <= i) {
                arrAdd[i] = a[i];
            } else {
                arrAdd[i] = a[i] + b[i];
            }
        }
        return arrAdd;
    }

    public static void prt(int[] arrAdd) { // 배열 더한 결과값 출력하는 메소드
        for (int i = 0; i < arrAdd.length; i++) {
            System.out.print(arrAdd[i]+ ", ");
        }

    }
}
