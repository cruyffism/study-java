package quiz;

public class Card {

     public static void main(String[] args) {
         Card card1 = new Card(3, false);
         Card card2 = new Card(2, true);

         System.out.println(card1.info());
         System.out.println(card2.info());
     }

     int number;
     boolean isTrue;
     
    public Card(int number, boolean isTrue) {
        this.number = number;
        this.isTrue = isTrue;
    }

    public String info() {
        if (isTrue) {
            return String.valueOf(number) + "k";
        } else {
            return String.valueOf(number);  //리턴 타입을 String으로 변경
        }
    }
}