package answer;

import java.util.Scanner;

public class InfiniteLoop {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        int month = 0;
        int day = 0;

        while (true) {
            // 생월 예외처리
            while (true) {
                System.out.print("월을 입력해주세요(0은 종료): ");
                month = scan.nextInt();

                if (month >= 0 && month <= 12) {
                    break;
                } else {
                    System.out.println("잘못입력하셨습니다. 다시입력 ");
                }
            }
            if (month == 0) {
                break;
            }

            // 생일 예외처리
            while (true) {
                System.out.print("생일을 입력하세요(0은 종료): ");
                day = scan.nextInt();

                if (day >= 0 && day <= 31) {
                	switch(month) {
                    case 1:
                        if (day >=20) {
                            System.out.println("물병자리");
                        } else {
                            System.out.println("염소자리");
                        }
                        break;
                    case 2:
                        if (day >=19) {
                            System.out.println("물고기자리");
                        } else {
                            System.out.println("물병자리");
                        }
                        break;
                    case 3:
                        if (day >=21) {
                            System.out.println("양자리");
                        } else {
                            System.out.println("물고기자리");
                        }
                        break;
                    case 4:
                        if (day >=20) {
                            System.out.println("황소자리");
                        } else {
                            System.out.println("양자리");
                        }
                        break;
                    case 5:
                        if (day >=21) {
                            System.out.println("쌍둥이자리");
                        } else {
                            System.out.println("황소자리");
                        }
                        break;
                    case 6:
                        if (day >=22) {
                            System.out.println("게자리");
                        } else {
                            System.out.println("쌍둥이자리");
                        }
                        break;
                    case 7:
                        if (day >=23) {
                            System.out.println("사자자리");
                        } else {
                            System.out.println("게자리");
                        }
                        break;
                    case 8:
                        if (day >=23) {
                            System.out.println("처녀자리");
                        } else {
                            System.out.println("사자자리");
                        }
                        break;
                    case 9:
                        if (day >=24) {
                            System.out.println("천칭자리");
                        } else {
                            System.out.println("처녀자리");
                        }
                        break;
                    case 10:
                        if (day >=23) {
                            System.out.println("전갈자리");
                        } else {
                            System.out.println("천칭자리");
                        }
                        break;
                    case 11:
                        if (day >=23) {
                            System.out.println("사수자리");
                        } else {
                            System.out.println("전갈자리");
                        }
                        break;
                    case 12:
                        if (day >=25) {
                            System.out.println("염소자리");
                        } else {
                            System.out.println("사수자리");
                        }
                        break;

                    }
                	break;
                }
                  
                else {
                    System.out.println("잘못입력하셨습니다. 다시입력 ");
                }
            }
            if (day == 0) {
                break;
            }
    	}
        scan.close();
	}    
}
