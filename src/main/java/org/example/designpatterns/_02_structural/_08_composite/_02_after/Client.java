package org.example.designpatterns._02_structural._08_composite._02_after;

public class Client {

    public static void main(String[] args) {
        Item doranBlade = new Item("도란검", 450);
        Item healPotion = new Item("체력 물약", 50);

        Bag bag = new Bag();
        bag.add(doranBlade);
        bag.add(healPotion);

        Client client = new Client();
        client.printPrice(doranBlade);
        client.printPrice(bag);
    }

    /*
     *  컴포짓 패턴 적용
     *  - 클라이언트 입장에서는 '아이템의 가격을 구하는 메서드'와 '가방 안의 물건을 구하는 메서드'나 동일하게 호출하여 구할 수 있게 되었다.
     */
    private void printPrice(Component component) {
        System.out.println(component.getPrice());
    }

}
