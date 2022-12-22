package task1.service;

import task1.classes.Basket;

public interface BallService {
    public double sumWeight(Basket basket);
    public double ColorBallsInBasket(Basket basket, String colour);
}
