/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//John Dang, ID: 991659242, Trafalgar Campus
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 * @author dancye, 2019
 */
//John Dang, ID: 991659242, Trafalgar Campus
public class CardDealer 
{
    public static void main(String[] args)
    {
        Card nineClubs = new Card("Clbs", 9);
        nineClubs.setSuit("diamonds");
        Card tenClubs = new Card("Clbs", 9);
        System.out.println(tenClubs.getSuit());
        System.out.println(tenClubs.getValue());
    }
}
