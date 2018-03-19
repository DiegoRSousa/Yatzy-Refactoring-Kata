package com.uepb.tcc.yatzy.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test01");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(0, 7725, 2775, 4366, 66564);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test02");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(202751, 2, 2, 1432242, 386511);
        org.junit.Assert.assertTrue(i5 == 4);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(46430, (int) '#', (int) ' ', 13061, 1126);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test04");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(827, 364, 198, (int) (byte) -1, (int) (short) -1);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.seis();
        int i9 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test05");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(1114514, 826, 484884, 1126, 202751);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test06");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(0, 2101, 219, 10, 23581);
        int i6 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test07");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(14665, 36359, 11804, 667722, 1390675);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test08");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(139717, 2664, 1567, 36359, 1076132);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test09");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(21544, 2100, 657535, 1958, 1958);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test10");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(101403, 1390675, 1579963, 0, 6176);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test11");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(2827, 546102, 3708, 948557, 13764);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test12");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(351, 227482, 42674, 1958, 13393);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test13");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(13450, (int) (short) 10, 1745, 1237, 2775);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test14");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(56977, 874566, 1958, 2775, 77626);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test15");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(22640, 77545, 415438, 0, 4778);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test16");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(1356, 11818, 1, 2238, 351);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.quatro();
        int i8 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test17");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (byte) -1, (int) 'a', (int) (short) -1, (int) (short) -1, (int) (short) -1);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.quatro();
        int i8 = yatzy5.seis();
        int i9 = yatzy5.quatro();
        int i10 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test18");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(51898, 7204, 524841, 71567, 202751);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test19");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(46430, 1717333, 14665, 19544, 6176);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test20");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(948557, (int) '#', 649233, (-1), 2838);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test21");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(676526, 0, 1717333, 11804, 1322948);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test22");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(1648, 51898, 0, 523910, 77173);
        org.junit.Assert.assertTrue(i5 == 654629);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test23");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(546102, 42674, 1717333, 1777092, 1135510);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test24");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(77545, 375, 771, 40413, 81606);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test25");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(265, 633353, 93739, 633353, 826);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test26");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(7204, 2014, 6442, 19544, 169608);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test27");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(1805411, 101403, 177426, 71567, 986507);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test28");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(12, 239859, 105799, 104090, 202751);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test29");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(58755, 265, 46003, 2664, 40954);
        int i6 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test30");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(48899, 825995, 24839, 0, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test31");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(182517, 79052, 950448, 0, 633353);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test32");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(351, 77626, 26198, 0, 2974);
        org.junit.Assert.assertTrue(i5 == 107149);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test33");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(1356, 0, 676526, 1135510, 12057);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }
}

