package task1.service.impl;

import org.testng.annotations.Test;
import task1.classes.Ball;
import task1.classes.Basket;
import task1.service.BallService;

import java.util.List;

import static org.testng.Assert.*;

public class BallServiceImplTest {

    @org.testng.annotations.Test
    public void testSumWeight() {
        Ball ball = new Ball("green", 2.4);
        Ball ball1 = new Ball("green", 5.6);
        Ball ball2 = new Ball("green", 3.3);
        Ball ball3 = new Ball("green", 6.4);
        Ball ball4 = new Ball("green", 7.2);
        Ball ball5 = new Ball("green", 2.8);

        List<Ball> ballList = List.of(ball, ball1, ball2, ball3, ball4, ball5);

        Basket basket = new Basket(ballList);
        BallService service = new BallServiceImpl();
        double actual = service.sumWeight(basket);
        double expected = 27;
        assertEquals(actual, expected, 1);
    }

    @Test
    public void testColorBallsInBasket() {
        Ball ball = new Ball("blue", 2.4);
        Ball ball1 = new Ball("green", 5.6);
        Ball ball2 = new Ball("blue", 3.3);
        Ball ball3 = new Ball("blue", 6.4);
        Ball ball4 = new Ball("red", 7.2);
        Ball ball5 = new Ball("green", 2.8);

        List<Ball> ballList = List.of(ball, ball1, ball2, ball3, ball4, ball5);

        Basket basket = new Basket(ballList);
        BallService service = new BallServiceImpl();
        int actual = (int) service.ColorBallsInBasket(basket, "blue");
        int  expected = 3;
        assertEquals(actual, expected);
    }
}