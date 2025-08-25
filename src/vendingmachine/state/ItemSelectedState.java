package vendingmachine.state;

import vendingmachine.enums.Coin;

public class ItemSelectedState implements BaseState {
    @Override
    public void insertCoin(Coin coin) {

    }

    @Override
    public void selectItem(String itemName) {
        System.out.println("Selected item: " + itemName);
    }

    @Override
    public void dispense() {

    }

    @Override
    public void refund() {

    }
}
