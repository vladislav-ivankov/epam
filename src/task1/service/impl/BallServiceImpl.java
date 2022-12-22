package task1.service.impl;

import task1.classes.Ball;
import task1.classes.Basket;
import task1.service.BallService;

import java.util.List;

public class BallServiceImpl implements BallService {
    @Override
    public double sumWeight(Basket basket) {
        List<Ball> list = basket.getBalls();
        double sumResult = 0;
        for (int i = 0; i < list.size(); i++) {
            sumResult += list.get(i).getWeight();
        }
        return sumResult;
    }

    @Override
    public double ColorBallsInBasket(Basket basket, String colour) {
        List<Ball> list = basket.getBalls();
        int sumOfSameBalls = 0;

        for (int i = 0; i < list.size(); ++i) {
            if (list.get(i).getColor().equals(colour)) {
                ++sumOfSameBalls;
            }
        }
        return sumOfSameBalls;
    }
}
