package com.example.neele.coinflip;

import java.util.Random;

/**
 * Created by Neele on 1/26/2015.
 */
public class CoinFlip {
    public CoinFlip(){}
    Random rnd = new Random();

    public int flipCoin(){
      int temp = rnd.nextInt(2)+1;

        if (temp == 1)
            return 1;
        else
            return 2;
    }
}
