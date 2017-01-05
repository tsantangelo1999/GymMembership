package com.company;

import java.util.ArrayList;

public class Customer
{
    public String name;
    private double weight;
    private ArrayList visits = new ArrayList();

    public Customer(String n, double w)
    {
        name = n;
        weight = w;
    }
}
