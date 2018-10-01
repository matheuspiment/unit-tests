package com.github.matheuspiment.auction.service;

import com.github.matheuspiment.auction.domain.Auction;
import com.github.matheuspiment.auction.domain.Bid;

public class Evaluator {
    private double higherValue = Double.NEGATIVE_INFINITY;
    private double lowerValue = Double.POSITIVE_INFINITY;

    public double getHigherValue() {
        return higherValue;
    }

    public double getLowerValue() {
        return lowerValue;
    }

    public void evaluete(Auction auction) {
        for (Bid bid: auction.getBids()) {
            if (bid.getValue() > higherValue) higherValue = bid.getValue();
            if (bid.getValue() < lowerValue) lowerValue = bid.getValue();
        }
    }
}
