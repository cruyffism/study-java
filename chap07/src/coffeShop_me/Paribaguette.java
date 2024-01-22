package coffeShop_me;

public class Paribaguette {
    // 필드
    Product cd;
    Product rb;
    Product mb;

    // 생성자
    public Paribaguette(int cdPrice, int rbPrice, int mbPrice) {
        this.cd = new CreamDonut(cdPrice);
        this.rb = new RedbeanBread(rbPrice);
        this.mb = new MoccaBread(mbPrice);
    }
    

    
}