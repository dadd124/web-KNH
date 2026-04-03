package ex2_object;

class Product {
    String name;
    int price;
    int stock;

    // 생성자
    public Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // 상품 정보를 한 줄로 출력하는 메서드
    public void printInfo() {
        System.out.println("상품명: " + name + ", 가격:" + price + "원, 재고:" + stock + "개");
    }
}
