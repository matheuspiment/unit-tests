package com.github.matheuspiment.auction.service;

import com.github.matheuspiment.auction.domain.Auction;
import com.github.matheuspiment.auction.domain.Bid;
import com.github.matheuspiment.auction.domain.User;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvaluatorTest {

    @Test
    public void evaluete() {
        User maria = new User("Maria");
        User igor = new User("Igor");
        User matheus = new User("Matheus");

        Auction auction = new Auction("Playstation 4");

        auction.proposes(new Bid(maria, 250.0));
        auction.proposes(new Bid(igor, 300.0));
        auction.proposes(new Bid(matheus, 400.0));

        Evaluator auctioneer = new Evaluator();
        auctioneer.evaluete(auction);

        Assert.assertEquals(400, auctioneer.getHigherValue(), 0.00001);
        Assert.assertEquals(250, auctioneer.getLowerValue(), 0.00001);
    }
}