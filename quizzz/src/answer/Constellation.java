package answer;

import java.util.Scanner;

public class Constellation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int month = 0;
        int day = 0;
        
        System.out.print("���� �Է����ּ���: ");
        month = scan.nextInt();

        System.out.print("���� �Է��ϼ���: ");
        day = scan.nextInt();
        
        switch(month) {
        	case 1:
	            if (day >=20) {
	                System.out.println("�����ڸ�");
	            } else {
	                System.out.println("�����ڸ�");
	            }
	            break;
        	case 2:
                if (day >=19) {
                    System.out.println("������ڸ�");
                } else {
                    System.out.println("�����ڸ�");
                }
                break;
            case 3:
                if (day >=21) {
                    System.out.println("���ڸ�");
                } else {
                    System.out.println("������ڸ�");
                }
                break;
            case 4:
                if (day >=20) {
                    System.out.println("Ȳ���ڸ�");
                } else {
                    System.out.println("���ڸ�");
                }
                break;
            case 5:
                if (day >=21) {
                    System.out.println("�ֵ����ڸ�");
                } else {
                    System.out.println("Ȳ���ڸ�");
                }
                break;
            case 6:
                if (day >=22) {
                    System.out.println("���ڸ�");
                } else {
                    System.out.println("�ֵ����ڸ�");
                }
                break;
            case 7:
                if (day >=23) {
                    System.out.println("�����ڸ�");
                } else {
                    System.out.println("���ڸ�");
                }
                break;
            case 8:
                if (day >=23) {
                    System.out.println("ó���ڸ�");
                } else {
                    System.out.println("�����ڸ�");
                }
                break;
            case 9:
                if (day >=24) {
                    System.out.println("õĪ�ڸ�");
                } else {
                    System.out.println("ó���ڸ�");
                }
                break;
            case 10:
                if (day >=23) {
                    System.out.println("�����ڸ�");
                } else {
                    System.out.println("õĪ�ڸ�");
                }
                break;
            case 11:
                if (day >=23) {
                    System.out.println("����ڸ�");
                } else {
                    System.out.println("�����ڸ�");
                }
                break;
            case 12:
                if (day >=25) {
                    System.out.println("�����ڸ�");
                } else {
                    System.out.println("����ڸ�");
                }
                break;

        }
        scan.close();
	}

}
