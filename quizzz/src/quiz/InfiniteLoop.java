package quiz;


import java.util.Scanner;

public class InfiniteLoop {
    public static void main(String[] args) {
        //무한루프, 생월 또는 생일이 0일시에는 루프 종료!! 또한 예외처리를 통해 잘못된 생월 또는 생일(13월 45일 등)은 입력되지 않게 방지

        Scanner scanner = new Scanner(System.in);
        int month;
        int date;

        while (true) {
            System.out.print("월을 입력해 주세요(0은 종료): ");
            month = scanner.nextInt();
            if (month == 0) {
                break;
            }
            System.out.print("생일을 입력해 주세요(0은 종료): ");
            date = scanner.nextInt();
            if (date == 0) {
                break;
            }
            switch (month) {
                case 1:
                    if (date < 20) {
                        System.out.println("염소자리");
                    } else if (date < 32) {
                        System.out.println("물병자리");
                    } else if (month >= 13 || date >= 33) {
                        System.out.println("잘못입력하셨습니다. 다시입력");
                    }
                    break;

                case 2:
                    if (date < 19) {
                        System.out.println("물병자리");
                    } else if (date < 30) {
                        System.out.println("물고기자리");
                    } else {
                        System.out.println("잘못입력하셨습니다. 다시입력");
                        break;
                    }

                case 3:
                    if (date < 21) {
                        System.out.println("물고기자리");
                    } else if (date < 32) {
                        System.out.println("양자리");
                    } else {
                        System.out.println("잘못입력하셨습니다. 다시입력");
                        break;
                    }

                case 4:
                    if (date < 20) {
                        System.out.println("양자리");
                    } else if (date < 31) {
                        System.out.println("황소자리");
                    } else {
                        System.out.println("잘못입력하셨습니다. 다시입력");
                        break;
                    }

                case 5:
                    if (date < 21) {
                        System.out.println("황소자리");
                    } else if (date < 32) {
                        System.out.println("쌍둥이자리");
                    } else {
                        System.out.println("잘못입력하셨습니다. 다시입력");
                        break;
                    }

                case 6:
                    if (date < 22) {
                        System.out.println("쌍둥이자리");
                    } else if (date < 31) {
                        System.out.println("게자리");
                    } else {
                        System.out.println("잘못입력하셨습니다. 다시입력");
                        break;
                    }

                case 7:
                    if (date < 23) {
                        System.out.println("게자리");
                    } else if (date < 32) {
                        System.out.println("사자자리");
                    } else {
                        System.out.println("잘못입력하셨습니다. 다시입력");
                        break;
                    }

                case 8:
                    if (date < 23) {
                        System.out.println("사자자리");
                    } else if (date < 32) {
                        System.out.println("처녀자리");
                    } else {
                        System.out.println("잘못입력하셨습니다. 다시입력");
                        break;
                    }

                case 9:
                    if (date < 24) {
                        System.out.println("처녀자리");
                    } else if (date < 31) {
                        System.out.println("천칭자리");
                    } else {
                        System.out.println("잘못입력하셨습니다. 다시입력");
                        break;
                    }

                case 10:
                    if (date < 23) {
                        System.out.println("천칭자리");
                    } else if (date < 32) {
                        System.out.println("전갈자리");
                    } else {
                        System.out.println("잘못입력하셨습니다. 다시입력");
                        break;
                    }

                case 11:
                    if (date < 23) {
                        System.out.println("전갈자리");
                    } else if (date < 31) {
                        System.out.println("궁수자리");
                    } else {
                        System.out.println("잘못입력하셨습니다. 다시입력");
                        break;
                    }

                case 12:
                    if (date < 25) {
                        System.out.println("궁수자리");
                    } else if (date < 32) {
                        System.out.println("염소자리");
                    } else {
                        System.out.println("잘못입력하셨습니다. 다시입력");
                        break;
                    }
                default:
                    System.out.println("잘못입력하셨습니다. 다시입력");
                    break;
            }
        }
    }
}
