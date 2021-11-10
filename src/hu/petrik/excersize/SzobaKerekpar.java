package hu.petrik.excersize;

import hu.petrik.set.Set;

public final class SzobaKerekpar {
    static private Set<Integer> feleseg;
    static private Set<Integer> ferj;

    public static void Run() {
        SzobaKerekpar.feleseg = new Set<>();
        SzobaKerekpar.ferj = new Set<>();
        SzobaKerekpar.feleseg.add(1);
        SzobaKerekpar.feleseg.add(3);
        SzobaKerekpar.feleseg.add(4);
        SzobaKerekpar.feleseg.add(5);
        SzobaKerekpar.feleseg.add(7);
        SzobaKerekpar.feleseg.add(8);
        SzobaKerekpar.feleseg.add(9);
        SzobaKerekpar.feleseg.add(10);
        SzobaKerekpar.feleseg.add(14);
        SzobaKerekpar.feleseg.add(17);
        SzobaKerekpar.feleseg.add(18);
        SzobaKerekpar.feleseg.add(19);
        SzobaKerekpar.feleseg.add(20);
        SzobaKerekpar.feleseg.add(24);
        SzobaKerekpar.feleseg.add(27);
        SzobaKerekpar.ferj.add(7);
        SzobaKerekpar.ferj.add(13);
        SzobaKerekpar.ferj.add(14);
        SzobaKerekpar.ferj.add(15);
        SzobaKerekpar.ferj.add(20);
        SzobaKerekpar.ferj.add(21);
        SzobaKerekpar.ferj.add(23);
        SzobaKerekpar.ferj.add(24);
        SzobaKerekpar.ferj.add(25);
        SzobaKerekpar.ferj.add(29);
        SzobaKerekpar.ferj.add(30);
        Set<Integer> unio = SzobaKerekpar.feleseg.unio(SzobaKerekpar.ferj);
        System.out.println(unio.getSize() + "Napot használták ezt a cuccot 🚲");
        System.out.println(unio.getSize() / 31 + "% használták ezt a cuccot 🚲");
    }
}
