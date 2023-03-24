package com.peerspace.design.patterns.adapter.figure;

public class Main {

    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        System.out.println("Square peg with radius " + roundPeg.getRadius() + ((roundHole.fits(roundPeg)) ? "fits" : "does not fit") + " round hole with radius " + roundHole.getRadius());

        SquarePeg smallPeg = new SquarePeg(3);
        SquarePeg largePeg = new SquarePeg(15);

        SquarePegAdapter smallPegAdapter = new SquarePegAdapter(smallPeg);
        SquarePegAdapter largePegAdapter = new SquarePegAdapter(largePeg);

        System.out.println("Square peg with radius " + smallPegAdapter.getRadius() + ((roundHole.fits(smallPegAdapter)) ? " fits" : " does not fit") + " round hole with radius " + roundHole.getRadius());
        System.out.println("Square peg with radius " + smallPegAdapter.getRadius() + ((roundHole.fits(largePegAdapter)) ? " fits" : " does not fit") + " round hole with radius " + roundHole.getRadius());
    }

}
