package com.company;

class Classroom {

    public static void main (String [] args) {
        Wilder jc = new Wilder("Jean-Claude", true);
        System.out.println(jc.whoAmI());
        Wilder hn = new Wilder("Henri", false);
        System.out.println(hn.whoAmI());

    }
}

