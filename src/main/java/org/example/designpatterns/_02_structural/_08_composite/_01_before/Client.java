package org.example.designpatterns._02_structural._08_composite._01_before;

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
     *  현재 코드의 문제점
     *  - 가격을 구하는 코드를 클라이언트가 알고 있어야하는 코드인가?
     *  - 가방 안에 가방이 들어있는 경우는 어떻게 구해야하는지 클라이언트가 알고 있어야하는가?
     *
     *  --> 컴포짓 패턴을 적용하여, 클라이언트 입장에서는 '전체'나 '부분'이나 모두 동일한 컴포넌트로 인식할 수 있는 계층 구조로 만든다.
     */
    private void printPrice(Item item) {
        System.out.println(item.getPrice());
    }

    private void printPrice(Bag bag) {
        int sum = bag.getItems().stream().mapToInt(Item::getPrice).sum();
        System.out.println(sum);
    }

}
