package vendingmachine.state;

import vendingmachine.enums.Coin;

public interface BaseState {

    void insertCoin(Coin coin);
    void selectItem(String itemName);
    void dispense();
    void refund();
}
