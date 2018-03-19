package com.uepb.tcc.yatzy.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test001");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(80166, 351, 2974, 15259, 171569);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test002");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(101423, 1237, 8699, 6615, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test003");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(31549, (int) ' ', 0, 0, 4778);
        org.junit.Assert.assertTrue(i5 == 36359);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test004");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(175004, 0, 46003, 978, 31549);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test005");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(6442, 23581, 27943, 157116, (-1));
        org.junit.Assert.assertTrue(i5 == 215081);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test006");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(8418, 2975, 80166, 0, 15286);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test007");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(2838, 3379, 412, 3708, 386511);
        org.junit.Assert.assertTrue(i5 == 396848);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test008");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(23581, 4366, 1237, 215081, 12057);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test009");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(13393, 0, 10160, 42674, 115765);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test010");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(108318, 1237, 396848, 0, 111);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test011");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(215081, 175004, 1, 2775, 77545);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test012");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(1237, 15259, (int) (short) 100, 386511, (int) (byte) 10);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test013");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(7204, 10666, 7073, 771, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test014");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(8418, 0, 115765, 13450, 1177);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test015");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(978, 364, 13393, 6615, 27943);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test016");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(2975, 2, 17189, 31549, 112604);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test017");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(31549, 11463, 15060, 364, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test018");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(9902, 1126, 771, 2892, 828);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test019");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(2775, (int) (byte) 100, 24798, 45400, 241570);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test020");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(14116, (int) ' ', 2974, 136521, 8503);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test021");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(15259, 136521, 101403, 10666, 11818);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test022");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(6615, 364, 7204, 0, 46003);
        int i6 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test023");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(0, 7204, 3710, 4366, 2014);
        org.junit.Assert.assertTrue(i5 == 17294);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test024");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(40954, 169608, 79052, 0, 5825);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test025");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(1957, 56977, 80166, 8699, 10394);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test026");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(4778, 112604, 23581, 386511, 24839);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test027");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres((int) ' ', 241570, 115765, 828, 169608);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test028");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(12057, 412, 100, 9105, 491588);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test029");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(1958, 15190, 978, 55428, 46624);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test030");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(80166, 1356, 34922, 111, 35248);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test031");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(21544, 0, 31549, 24798, 24798);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test032");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(40954, 739, 101423, 101423, 8699);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test033");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(112604, 157116, 105324, 10160, 169608);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test034");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(46003, 23261, 0, 24839, 14665);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test035");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(0, 4007, 11818, 3379, 4007);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test036");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(24697, (int) (byte) 1, 40954, 35248, 1126);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test037");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(10, 1177, 978, 12057, 4778);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test038");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(13393, 36359, 46624, 3710, 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test039");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) 'a', 0, 0, (int) (byte) 1, (int) (short) -1);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.seis();
        int i8 = yatzy5.quatro();
        int i9 = yatzy5.seis();
        int i10 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test040");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um((int) (byte) 100, 351, 12, 0, 7251);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test041");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (byte) 0, (int) '#', (int) (short) 10, (int) (byte) 1, (int) (short) 100);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.seis();
        int i8 = yatzy5.seis();
        int i9 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test042");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(100, 198, 109, 7251, 4007);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test043");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(386511, 27943, 6176, 386511, 8418);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test044");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(11804, 3005, 8244, 828, 35248);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test045");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(826, 46430, 79052, 24798, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test046");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(241570, 19544, 1957, 5825, 6176);
        org.junit.Assert.assertTrue(i5 == 275072);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test047");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(15190, 5825, (int) (short) -1, 0, 9902);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test048");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(827, 43019, 11463, 15060, 2827);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test049");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo((int) (short) 10, (int) '#', 15286, (int) '#', 12057);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test050");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(1745, 7204, 9902, 121602, 3005);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test051");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres((int) (short) 100, 2975, 1177, 2975, (-1));
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test052");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo((int) (short) 10, 14665, 828, 827, 79052);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test053");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(219, 2775, 2758, 396848, 10394);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test054");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(115765, (int) 'a', 13061, 375, 10666);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test055");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) 'a', 0, 0, (int) (byte) 1, (int) (short) -1);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.seis();
        int i9 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test056");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(483, (int) (short) 0, 10160, 14710, 15060);
        org.junit.Assert.assertTrue(i5 == 40413);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test057");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(8699, (int) 'a', (int) (short) 1, 13450, 46430);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test058");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (byte) 0, (int) '#', (int) (short) 10, (int) (byte) 1, (int) (short) 100);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.seis();
        int i8 = yatzy5.quatro();
        int i9 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test059");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(198, 3, 198, 375, 2014);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test060");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(10160, 364, 71567, 23581, 1126);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test061");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(24697, 169608, 21544, 31549, 109);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test062");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(13393, 739, 12057, 34922, 112604);
        int i6 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test063");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(827, 826, 112604, 27943, 1126);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test064");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(2758, 2238, 15286, 12057, 101403);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test065");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(40413, (int) (byte) 0, 2664, 71567, 198);
        org.junit.Assert.assertTrue(i5 == 114842);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test066");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(21544, 109, 8418, 6615, 169608);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test067");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(1, 826, 15060, 2238, 36359);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test068");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(1, (int) ' ', 4366, 13393, 3379);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test069");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(0, 2100, 827, 827, 15286);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test070");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(7251, (int) (short) 100, 0, 77545, 6615);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test071");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(10666, 58755, 2775, 0, 2014);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test072");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(71567, 483, 2838, 11463, 15259);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test073");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(101423, (int) (short) -1, 396848, 2838, 10394);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test074");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(3710, 25022, 1648, 1567, 169608);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test075");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(79052, 2775, 121602, 10394, 364);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test076");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(23581, (int) (byte) 10, 109, 3379, 175004);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test077");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(1957, (int) (byte) 100, 15190, (int) '4', 827);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test078");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(828, 6442, 9902, 771, 52607);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test079");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(375, (int) '4', 11804, 6176, 7073);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test080");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(1957, 52607, 827, 2827, (int) (short) 1);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test081");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(2827, (int) '4', 13450, 826, 215081);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test082");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(13764, 45400, 15060, 11818, 9902);
        int i6 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test083");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(11818, 828, 8699, 101423, 17294);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test084");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(5825, 136521, 3708, (int) '4', 25022);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test085");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(375, 62610, 9902, 19544, 2838);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test086");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(40413, (int) (byte) 100, 13061, 15259, 101423);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test087");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (byte) 100, (int) '#', (int) (byte) -1, 241, (int) (byte) 0);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.seis();
        int i9 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test088");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(483, 1648, 0, (int) (short) 100, 45400);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test089");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(2, 2101, 2758, (int) (short) 1, 1958);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test090");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(0, (int) (byte) -1, 25022, 1177, (int) (byte) 0);
        org.junit.Assert.assertTrue(i5 == 26198);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test091");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(1, 199391, 77545, 24798, 121602);
        org.junit.Assert.assertTrue(i5 == 423337);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test092");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(9105, 3, 198, 112604, 169608);
        org.junit.Assert.assertTrue(i5 == 3);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test093");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(24798, 13393, 10160, 491588, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test094");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(13393, 55428, (int) '4', 24697, 58755);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test095");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(24839, 12, 11818, 386511, 11463);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test096");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(1356, 7073, 115765, 46430, 175004);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test097");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(9105, 1958, (int) ' ', 15060, 108318);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test098");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(8699, 9105, 739, 14710, 491588);
        org.junit.Assert.assertTrue(i5 == 524841);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test099");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(42674, 46624, 423337, 2101, 4778);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test100");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(9902, (int) (short) -1, 2, 121602, 13061);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test101");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(24798, 2827, 5825, (int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test102");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(6442, 275072, 112604, 5825, 23581);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test103");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(36359, 8699, 169608, 7251, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test104");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(24798, 14116, (int) (short) 1, 14710, 2975);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test105");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares((int) (byte) -1, 2664, 2664, 2975, 108318);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test106");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(24798, 71567, 15259, (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test107");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia((int) '#', 2758, 1356, 24839, 265);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test108");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(483, 2775, (int) 'a', 15286, 17294);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test109");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(36359, 5825, 23261, 24798, 23261);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test110");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres((int) (byte) 10, 11818, 1958, 24697, 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test111");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (short) 1, 111, (int) (byte) 1, 1, 111);
        int i6 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test112");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(17189, 826, 7073, 6442, 351);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test113");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance((int) ' ', 0, 31385, 2100, 1237);
        org.junit.Assert.assertTrue(i5 == 34754);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test114");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(1177, 2014, 828, 3379, 0);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test115");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(241, 105324, (int) '#', 198, (int) (byte) 1);
        org.junit.Assert.assertTrue(i5 == 105799);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test116");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(25022, 58755, 26198, 0, 2664);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test117");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(0, 524841, 739, 15286, 375);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test118");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(6442, 11804, 826, (int) (byte) 100, 10394);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test119");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(13764, 0, 100, 351, 219);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test120");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(10666, 1237, 12057, 31385, 1237);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test121");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(175004, 15259, 2664, 199391, 52607);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test122");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(771, 364, 828, 7251, (int) 'a');
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test123");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(1648, 0, 31549, 35248, 15286);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test124");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(4778, 826, 15286, 10160, 55428);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test125");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(1237, 175004, 3, 100, (int) '4');
        org.junit.Assert.assertTrue(i5 == 176396);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test126");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(34922, 13450, 826, 483, 10);
        org.junit.Assert.assertTrue(i5 == 49691);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test127");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(4366, 79052, 8244, 2014, 3710);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test128");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(40413, 241570, 31549, 15286, 827);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test129");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(2014, 105324, 412, 9902, 40954);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test130");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(375, 5825, (int) '#', 3005, 14710);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test131");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(15286, 10394, 423337, 1648, 10666);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test132");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(15286, 2238, 3, 199391, 13450);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test133");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(15259, 423337, 1745, 7251, (int) (short) 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test134");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(14665, 62610, 105799, 0, 17294);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test135");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(771, (int) (byte) 100, 0, 45400, 375);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test136");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(108318, 31549, 0, 24697, 136521);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test137");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(121602, 1237, (int) (byte) 10, 4778, 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test138");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(15286, 157116, 396848, 241, 11804);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test139");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) 'a', 0, 0, (int) (byte) 1, (int) (short) -1);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.seis();
        int i9 = yatzy5.seis();
        int i10 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test140");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(2775, 491588, 13061, (int) '4', 105324);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test141");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(199391, 351, (-1), 2975, (int) '#');
        org.junit.Assert.assertTrue(i5 == 202751);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test142");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(2775, 828, 219, 2, 2664);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.seis();
        int i9 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test143");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(58755, 52607, 24697, 2758, 171569);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test144");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(828, 157116, 14665, 4778, 2827);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test145");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(827, 15286, 375, 2775, 2775);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test146");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(101423, 8503, 17294, 2238, 14116);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test147");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(1177, 0, (int) '#', 1648, 215081);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test148");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(10, (int) (byte) 1, (int) ' ', 111, (int) '4');
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test149");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(40413, 10, 24697, 351, 40954);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test150");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(1745, 241, 1567, 2838, 198);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.quatro();
        int i8 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test151");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) '4', (int) (byte) 100, (int) (short) 100, (int) (byte) 10, (int) (byte) 100);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.seis();
        int i8 = yatzy5.cinco();
        int i9 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test152");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(4778, 80166, 241570, 0, 275072);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test153");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(5825, 80166, 6442, 12057, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test154");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(40954, 13450, 114842, (int) (byte) 100, 34754);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test155");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(491588, 36359, 412, 9105, (int) (byte) 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test156");
        int[] i_array3 = new int[] { ' ', 121602, 17189 };
        try {
            int i4 = com.uepb.tcc.yatzy.Yatzy.yatzy(i_array3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test157");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(115765, 202751, 1567, (int) (byte) 10, 169608);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test158");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) 'a', (int) '4', (int) ' ', 111, (int) (short) -1);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.cinco();
        int i9 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test159");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(31549, 112604, 136521, 739, 10666);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test160");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(8244, 13450, 114842, 77545, 9902);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test161");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(5825, 1, 108318, 524841, 15286);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test162");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(80166, 9902, 241570, 0, (int) 'a');
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test163");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (short) 10, 198, (int) 'a', 10, (int) (short) 10);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.quatro();
        int i9 = yatzy5.seis();
        int i10 = yatzy5.seis();
        int i11 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test164");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(25022, 1237, 79052, 2101, 23261);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test165");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(0, 275072, (int) (short) 10, 2238, 121602);
        org.junit.Assert.assertTrue(i5 == 398922);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test166");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((-1), 11463, 351, 3708, 1648);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test167");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(202751, 58755, 14116, 771, 7204);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test168");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(2838, 1177, 0, 2101, (int) 'a');
        int i6 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test169");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(7725, (int) 'a', 1958, 105799, 275072);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test170");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(55428, 109, 423337, 171569, 62610);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test171");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(109, (int) 'a', 2775, 978, 1957);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test172");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(13061, 0, 3379, 491588, 771);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test173");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(115765, 36359, 8244, (int) (short) -1, 2100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test174");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (short) 10, 198, (int) 'a', 10, (int) (short) 10);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test175");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(3005, 34922, 524841, 3379, 219);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test176");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(171569, 524841, 771, 0, 52607);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test177");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um((int) (byte) 0, 19544, 1237, 2838, 108318);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test178");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(0, 14710, 15190, 171569, 524841);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test179");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(198, 7251, (int) (short) -1, 827, 2);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test180");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(1, 10, 71567, 15286, 739);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test181");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (byte) -1, 827, (int) ' ', (int) (byte) -1, 1);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.quatro();
        int i8 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test182");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (byte) 0, (int) '#', (int) (short) 10, (int) (byte) 1, (int) (short) 100);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.quatro();
        int i8 = yatzy5.cinco();
        int i9 = yatzy5.cinco();
        int i10 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test183");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(0, 101403, 364, 46430, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test184");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares((int) 'a', 265, 7251, 3, 396848);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test185");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(56977, 199391, 23581, 6176, 396848);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test186");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(0, 2975, 241570, (int) (byte) 1, 11804);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test187");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(10160, 101403, 2, 34922, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test188");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(45400, 13450, 71567, 112604, 36359);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test189");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(8418, 1648, 2827, 978, 8418);
        int i6 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test190");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(10, 121602, 351, 423337, 7251);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test191");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(121602, (int) 'a', 3005, 52607, 42674);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test192");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(49691, 12, 24697, 3710, 101423);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test193");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(31385, 10666, (int) (byte) -1, 7073, 2775);
        org.junit.Assert.assertTrue(i5 == 51898);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test194");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(24697, 265, 2827, 35248, 1177);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test195");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (short) 100, 2974, 351, 826, 2775);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test196");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(58755, 13450, 2014, 56977, 2101);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test197");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(111, 169608, 9902, 2, 11804);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test198");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(375, 35248, 3708, 15259, 27943);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test199");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (byte) 0, (int) '#', (int) (short) 10, (int) (byte) 1, (int) (short) 100);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.quatro();
        int i8 = yatzy5.cinco();
        int i9 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test200");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres((int) (short) -1, 100, 13764, 3708, (int) ' ');
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test201");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(6442, 8699, 1648, 8503, 2975);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test202");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(2101, 6442, 0, 11804, 483);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test203");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(43019, 0, 49691, 0, 157116);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test204");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(176396, 2975, 1958, 25022, 176396);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test205");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(2974, 2100, 77545, 978, 3708);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test206");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(17294, 398922, (int) (short) 1, 2892, 1567);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test207");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(101403, 8699, 3, (int) (short) 0, 34922);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test208");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(77545, 114842, (int) (byte) -1, 100, 423337);
        org.junit.Assert.assertTrue(i5 == 615823);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test209");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) 'a', 101403, 40954, 6615, 202751);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test210");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(10394, 10160, 105799, 31385, 171569);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test211");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(9105, 2101, 3710, 215081, 36359);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test212");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(8503, 396848, 4007, 2838, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test213");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(8503, 8503, 364, 1648, 6176);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test214");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(46624, 19544, 13393, 4007, 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test215");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(826, 241570, 157116, 241570, 2892);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test216");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(115765, 1126, 0, 23581, 2664);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test217");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(0, 111, 412, 1957, 111);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.quatro();
        int i9 = yatzy5.quatro();
        int i10 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test218");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(398922, 8418, 241, 52607, 1356);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test219");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(176396, 0, 15060, 13764, 112604);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test220");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(0, 0, 13061, 491588, 52607);
        org.junit.Assert.assertTrue(i5 == 557256);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test221");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(12, 79052, 1126, 1126, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test222");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(4778, 739, 17189, 615823, 11818);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test223");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(19544, 112604, 17294, 265, 8699);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test224");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(34754, 21544, 0, 7073, 136521);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test225");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(0, 17294, 14665, 46003, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test226");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(77545, 11463, 46003, 14665, 15286);
        int i6 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test227");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(112604, 15190, 17294, 11804, 1648);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test228");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(7251, 24839, 3708, 31549, 45400);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test229");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (byte) 100, (int) '#', (int) (byte) -1, 241, (int) (byte) 0);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.seis();
        int i8 = yatzy5.cinco();
        int i9 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test230");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(491588, 0, 3708, (int) '#', (int) (byte) 10);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test231");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(265, 364, (int) (short) 10, 739, 11463);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.seis();
        int i8 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test232");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(19544, 557256, 157116, 351, 826);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test233");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(275072, 3708, 1567, 46624, 2775);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test234");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(27943, 615823, 4007, 15259, 265);
        org.junit.Assert.assertTrue(i5 == 663297);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test235");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(615823, 11818, 7204, 2014, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test236");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(2100, 1648, (int) (short) 10, 108318, 26198);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test237");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(5825, 1957, 0, 15060, (int) (short) 10);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test238");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(175004, 412, 615823, 6176, 17294);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test239");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(13764, 8503, 1648, 1648, 31549);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test240");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(8503, 46003, 0, (int) '#', 40954);
        int i6 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test241");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(1126, 1648, 27943, 114842, 171569);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test242");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(1237, 14665, 100, 55428, 2775);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test243");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(111, 1958, (int) (byte) -1, 3379, 12);
        int i6 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test244");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(49691, 80166, (int) '#', 1126, 8699);
        org.junit.Assert.assertTrue(i5 == 139717);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test245");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(1745, 241, 1567, 2838, 198);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.cinco();
        int i9 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test246");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(1745, 111, 1745, 398922, 13393);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test247");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(3005, 3710, (int) '4', 34922, 109);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test248");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(1648, (int) (short) 10, 77545, 105324, 15259);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test249");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(771, 139717, (int) '#', 139717, 139717);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test250");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par((int) ' ', 2775, 46003, 9105, 62610);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test251");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia((int) (short) -1, 198, 8244, 0, 663297);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test252");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(202751, 2014, 9105, 46430, 176396);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test253");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(8699, 7204, 15286, 55428, 23261);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test254");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(0, 108318, 71567, 739, 10666);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test255");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(2974, 56977, 0, 0, 24839);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test256");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(8699, 13061, 176396, 1177, 771);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test257");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(2238, 1745, 46430, 0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test258");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(8418, (int) (short) -1, 1126, 14665, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test259");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(15259, 108318, 111, 15060, 826);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test260");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(0, 3379, 375, 10394, 2975);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test261");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(241570, 0, 9902, 55428, 2758);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test262");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(828, 771, 386511, 2775, 176396);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test263");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(1, (int) (byte) 100, (int) (byte) 100, 17294, 40954);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test264");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(10160, 4778, 77545, 491588, 8244);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test265");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(2975, 100, 2014, 198, 2014);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test266");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(0, 2238, 4366, 3005, 2664);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test267");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(1126, 13764, 2974, 17189, 34922);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test268");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(615823, 17294, 198, (int) (byte) 100, 1745);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test269");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(34922, 13764, 80166, 2014, 176396);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test270");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(265, (int) (short) 10, 101423, (int) '4', 739);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test271");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(2827, 62610, 62610, 199391, 1567);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test272");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(136521, 46624, 2, 49691, 17189);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test273");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(34922, 101403, 43019, 398922, 40413);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test274");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(0, 396848, 52607, (int) (byte) 1, 1957);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test275");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(3710, 14710, (int) (short) 10, (int) '4', 3005);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test276");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(46430, 12, 3379, 241570, 49691);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test277");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(109, 79052, 13061, 71567, 2014);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test278");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(24798, 49691, 15259, 10394, 139717);
        org.junit.Assert.assertTrue(i5 == 239859);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test279");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(0, 6176, 826, (int) (short) 10, 40413);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test280");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(663297, (int) (byte) -1, 24697, 157116, 2238);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test281");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((-1), 11463, 351, 3708, 1648);
        int i6 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test282");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(1648, 771, 6615, 55428, 9902);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test283");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(24697, 0, 0, 24697, 1126);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test284");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres((int) '#', 71567, 15286, 0, 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test285");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) '4', (int) (byte) 100, (int) (short) 100, (int) (byte) 10, (int) (byte) 100);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.seis();
        int i8 = yatzy5.cinco();
        int i9 = yatzy5.seis();
        int i10 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test286");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(27943, 1237, 7251, 24798, 1126);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test287");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(15190, 0, 1957, 17294, 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test288");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia((-1), 827, 771, 2838, 34922);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test289");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(19544, 9902, 739, 23261, 2838);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test290");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(139717, 52607, 483, 35248, 8244);
        org.junit.Assert.assertTrue(i5 == 236299);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test291");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(739, 1958, 10160, 46003, 40413);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test292");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(40413, 0, (int) '#', 100, 17189);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test293");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(3710, 14710, (int) (short) 10, (int) '4', 3005);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test294");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(0, 58755, (int) (short) 0, 219, 8244);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test295");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(1745, 14665, 1237, (int) (short) 100, (int) (byte) 10);
        int i6 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test296");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (byte) 0, (int) '#', (int) (short) 10, (int) (byte) 1, (int) (short) 100);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.seis();
        int i8 = yatzy5.cinco();
        int i9 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test297");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(15259, 1958, 31549, 215081, 136521);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test298");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(11463, 198, 0, 71567, 46624);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test299");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(79052, 8244, 23261, 386511, 52607);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test300");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(9105, 7251, 1, 828, 80166);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test301");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(56977, 2827, 0, 23261, 10394);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test302");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(46430, 51898, 2758, 483, (int) (byte) 10);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test303");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(0, 55428, 6176, 49691, 2664);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test304");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(5825, 827, 351, 1958, 3);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test305");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(101403, 386511, 136521, 0, 6176);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test306");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(7725, 4778, 1, (int) (short) 1, 265);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test307");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(2975, 8244, 828, (int) (short) 100, (int) (short) 10);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test308");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(239859, 199391, (int) (short) -1, 236299, 23581);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test309");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(4366, 2758, 14665, 4778, 826);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test310");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(40954, 15259, 42674, 3, 4366);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test311");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(24839, 13764, 171569, 1648, 13061);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test312");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(1648, 4007, 79052, 3708, 23581);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test313");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(169608, (int) (byte) 0, 2975, 34754, 5825);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test314");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(2892, 105799, 4007, 4778, 14710);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test315");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(3005, 1356, 80166, (int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test316");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(0, 169608, 80166, 46624, 175004);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test317");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um((int) (short) 0, 36359, 100, (int) (short) 1, 14116);
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test318");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(2758, 23581, 557256, 13764, 241570);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test319");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(219, 8503, (int) (byte) 0, 15190, 241);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test320");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(3, 7251, 31385, 40954, 615823);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test321");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(25022, 6442, 351, 0, 364);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test322");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(491588, 0, 1177, (-1), 23261);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test323");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(0, 11463, 2827, 364, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test324");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(21544, 1957, 176396, 171569, 24798);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test325");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(9105, 2238, 105324, 241570, 43019);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test326");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(412, 7251, 101403, 2827, 3);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test327");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(109, 175004, 275072, 198, 615823);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test328");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(8244, 46624, (int) (byte) 0, 0, 398922);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test329");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par((int) (short) 1, 1958, 524841, 1356, 2101);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test330");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(24697, 115765, 0, 491588, 2975);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test331");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(0, 101403, 51898, 109, 215081);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test332");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) 'a', 0, 0, (int) (byte) 1, (int) (short) -1);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.seis();
        int i8 = yatzy5.cinco();
        int i9 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test333");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par((int) (byte) 100, 6176, 2775, 21544, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test334");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(169608, (int) (short) 100, 6442, 11463, 105799);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test335");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(219, 52607, 115765, 11463, 27943);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test336");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(1745, 11804, (int) (short) 10, 7725, 1356);
        org.junit.Assert.assertTrue(i5 == 22640);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test337");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(1177, 46430, 215081, 71567, 71567);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test338");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(1958, 101423, 12, 2664, 364);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test339");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(6442, (int) 'a', 56977, 2, 3005);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test340");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(3708, 112604, 13764, 40413, 114842);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test341");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(219, 2, 241, (int) '4', 13450);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test342");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(828, 1, 105799, 0, 36359);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test343");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(198, 3005, (int) (byte) 0, 3710, 198);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test344");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(3005, 3710, 136521, 524841, 105324);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test345");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(10666, 169608, 1648, 101403, 115765);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test346");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(15190, 828, 108318, 978, (int) (short) 100);
        int i6 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test347");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(2974, 7725, 826, 23581, 19544);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test348");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(100, 396848, 215081, 4366, 0);
        org.junit.Assert.assertTrue(i5 == 616395);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test349");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(2974, 9902, 483, 52607, 239859);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test350");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(1356, 2827, 6442, 46624, (int) (short) 100);
        org.junit.Assert.assertTrue(i5 == 57349);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test351");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo((int) (short) 0, 55428, 15060, 1648, 7725);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test352");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(6615, 101423, 3710, 2238, 241570);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test353");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(423337, 412, 15286, (int) '#', 42674);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test354");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(615823, (int) 'a', 7204, 3379, 12);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test355");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(62610, 101403, 1, 56977, 136521);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test356");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(6176, 46430, 978, 616395, 11818);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test357");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(2664, 100, 265, 827, 0);
        int i6 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test358");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(265, 351, 55428, 34754, 7725);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test359");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(826, 2974, 51898, (int) (short) 1, 55428);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test360");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(2238, 13764, 1567, 0, 10160);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test361");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(978, 0, 3005, (int) 'a', 2838);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test362");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(5825, 15060, 616395, (int) (short) 100, 19544);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test363");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(739, 49691, 0, 22640, 396848);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test364");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(176396, 21544, 17189, 21544, 31385);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test365");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(827, 364, 198, (int) (byte) -1, (int) (short) -1);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test366");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(14710, (int) (byte) 100, 2100, 1958, 663297);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test367");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(12057, 79052, 978, 13764, 13764);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test368");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(828, 0, 364, 23261, 31385);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test369");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia((int) (byte) 1, 6176, 1648, 351, 241570);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test370");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(1126, 265, 15060, 13450, 112604);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test371");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(3708, 375, (int) (byte) 1, 171569, (int) (byte) -1);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test372");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(24839, 8503, 121602, 483, 14710);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test373");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) 'a', 0, 0, (int) (byte) 1, (int) (short) -1);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.seis();
        int i8 = yatzy5.quatro();
        int i9 = yatzy5.cinco();
        int i10 = yatzy5.quatro();
        int i11 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test374");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(12057, 5825, 176396, 114842, 3379);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test375");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(14710, 15286, 236299, 8699, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test376");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(36359, 2664, 52607, 364, 1745);
        org.junit.Assert.assertTrue(i5 == 93739);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test377");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(616395, 3005, 2101, 4778, 2827);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test378");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(24798, 4366, 0, 35248, 175004);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test379");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(109, 3710, 15060, 6615, 1958);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test380");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance((int) 'a', 0, 1, 13764, 15259);
        org.junit.Assert.assertTrue(i5 == 29121);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test381");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(175004, 71567, 11463, 10394, 4007);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test382");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(3710, 2974, 34754, 17294, 616395);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test383");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(23261, 101423, 11818, 1567, 6176);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test384");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(12057, 2827, 2238, 79052, 46624);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test385");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) 'a', 0, 0, (int) (byte) 1, (int) (short) -1);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.seis();
        int i9 = yatzy5.quatro();
        int i10 = yatzy5.cinco();
        int i11 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test386");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(93739, 396848, 46003, 351, 13450);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test387");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo((int) (byte) 0, 112604, 17294, 112604, 43019);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test388");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (byte) 0, (int) '#', (int) (short) 10, (int) (byte) 1, (int) (short) 100);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.quatro();
        int i8 = yatzy5.cinco();
        int i9 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test389");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(23261, 0, 2838, 15286, 49691);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test390");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(13450, 24697, 9105, 375, 77545);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test391");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(202751, 8699, 2775, 105324, 827);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test392");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(23261, 13061, 1, 57349, 491588);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test393");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(26198, 0, 3708, (int) (short) 0, 9105);
        org.junit.Assert.assertTrue(i5 == 39011);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test394");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(2014, (int) (short) -1, 2664, (int) (short) 10, 27943);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test395");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(351, 375, 3708, 7073, 8244);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test396");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(4366, 2014, 8418, 275072, 1745);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test397");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(24839, 0, 5825, (int) (short) 100, 14710);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test398");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(12057, 176396, 42674, 219, 3710);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test399");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia((-1), 524841, 10160, 364, 105324);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test400");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(524841, (int) (short) 100, 1648, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test401");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(139717, 241, 12057, 45400, 9105);
        org.junit.Assert.assertTrue(i5 == 206520);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test402");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(25022, 46624, 71567, 31549, 2664);
        org.junit.Assert.assertTrue(i5 == 177426);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test403");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(19544, 236299, 3379, 169608, 3);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test404");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(827, 351, 3379, 6442, 1126);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test405");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois((int) (byte) -1, 15060, 51898, 42674, 157116);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test406");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(34754, 79052, 7251, 58755, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test407");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(14710, 6176, 2838, 101403, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test408");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(1, 3708, 39011, 46003, 7204);
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test409");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(0, 24798, 2974, 15286, 10666);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test410");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(79052, 169608, 423337, 491588, (int) (short) 1);
        org.junit.Assert.assertTrue(i5 == 1163586);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test411");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(241570, 7204, 4007, 171569, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test412");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (byte) 0, (int) '#', (int) (short) 10, (int) (byte) 1, (int) (short) 100);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.quatro();
        int i8 = yatzy5.cinco();
        int i9 = yatzy5.cinco();
        int i10 = yatzy5.quatro();
        int i11 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test413");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(2838, (int) (short) 0, 2775, 15060, 40954);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test414");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(10160, 105324, (int) (short) 100, 10160, 62610);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test415");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(17189, (int) ' ', 169608, 9105, (int) '4');
        org.junit.Assert.assertTrue(i5 == 195986);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test416");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um((int) '#', 0, 29121, 34754, 11463);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test417");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(375, 386511, 2975, 6176, 34922);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test418");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(771, (-1), 0, 35248, (int) ' ');
        org.junit.Assert.assertTrue(i5 == 36050);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test419");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(7725, 177426, 7204, 177426, 10);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test420");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(615823, 13764, 79052, 0, 0);
        int i6 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test421");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(31549, 169608, 828, (-1), 80166);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test422");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(13764, 136521, 24798, 23581, 25022);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test423");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia((int) (short) -1, 198, 25022, 52607, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test424");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(15060, 826, 2101, 27943, 77545);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test425");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(351, (-1), (-1), 2892, 8699);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test426");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(195986, 169608, 79052, 219, 2892);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test427");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(23581, 24697, 105324, 42674, 398922);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test428");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(36050, 12, 43019, 4007, 15060);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test429");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (byte) -1, 0, 6442, 40954, 57349);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test430");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo((int) (byte) 10, 275072, 15190, 198, 35248);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test431");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(557256, 71567, 1, 739, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test432");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(115765, 171569, 157116, (int) (short) 100, 11818);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test433");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(1126, 3, 8244, 31385, 1237);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test434");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(7251, 175004, 202751, 5825, 7204);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test435");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(386511, 46430, 52607, 10666, 136521);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test436");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(14116, 29121, 6176, 1177, 24697);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test437");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(739, 386511, 6615, 2838, 12057);
        org.junit.Assert.assertTrue(i5 == 408760);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test438");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(2, 24697, 2238, 139717, 9105);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test439");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(11804, 0, 10666, 40954, 93739);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test440");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(1745, 42674, 111, 11818, 2758);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test441");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(7251, 0, 24839, 198, 483);
        org.junit.Assert.assertTrue(i5 == 32771);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test442");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(396848, 13764, 31549, (int) '4', 1163586);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test443");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(31549, 15286, 3005, 0, 101403);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test444");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(15286, 11818, 71567, 0, 171569);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test445");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(827, (int) (short) 0, 108318, 77545, 10666);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test446");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(10160, 826, 23581, 8418, 616395);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test447");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(5825, 105799, 2775, 396848, 265);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test448");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(105324, 93739, (int) (byte) 1, 771, 2);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test449");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(108318, 24839, 111, 771, 3708);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test450");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(6176, 15259, 24839, 0, 4778);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test451");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(2974, 14116, 15259, 12057, 35248);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test452");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(1745, 2827, 423337, 1648, 56977);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test453");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(114842, (int) (short) 10, 2664, 105799, 2974);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test454");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(105324, 34922, 8418, 396848, 31385);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test455");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(105324, 109, 49691, 1745, 31385);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test456");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(101403, (int) (byte) 100, 13450, 157116, 0);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test457");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(39011, 105799, 34754, 31549, 57349);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test458");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) '4', (int) (byte) 100, (int) (short) 100, (int) (byte) 10, (int) (byte) 100);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.seis();
        int i8 = yatzy5.seis();
        int i9 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test459");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(8244, 46003, 6442, 2664, 483);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test460");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(828, 1957, 14665, 112604, 43019);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test461");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(12, 35248, 4366, 5825, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test462");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (byte) 1, 241, 100, 265, 0);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.quatro();
        int i8 = yatzy5.quatro();
        int i9 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test463");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(14116, (int) (byte) -1, 31385, 136521, 3710);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test464");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) '4', (int) (byte) 100, (int) (short) 100, (int) (byte) 10, (int) (byte) 100);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.seis();
        int i8 = yatzy5.cinco();
        int i9 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test465");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(46430, 114842, 2974, 265, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test466");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(25022, 32771, 0, (-1), 22640);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test467");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(491588, 14710, 109, 2775, 2775);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test468");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(39011, 24839, 29121, 2014, 9105);
        org.junit.Assert.assertTrue(i5 == 104090);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test469");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(739, 26198, 24697, 265, 615823);
        org.junit.Assert.assertTrue(i5 == 667722);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test470");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(219, 46430, 175004, 13393, 121602);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test471");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(2101, 275072, 45400, 104090, 396848);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test472");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(265, 8244, 177426, 7073, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test473");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(169608, 51898, 10394, 2101, 364);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test474");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(6442, 2974, (int) (byte) 0, 31549, 11818);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test475");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(139717, (int) (byte) 10, 10160, 169608, 175004);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test476");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(3710, 51898, 275072, 136521, 524841);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test477");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(108318, 827, 17189, 10394, 51898);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test478");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(7725, 62610, 202751, 13450, 169608);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test479");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(4007, 0, 1567, 7725, 6442);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test480");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(616395, 771, 3379, 169608, 101423);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test481");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(9902, 49691, 386511, 219, 398922);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test482");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(11463, 398922, 13393, 1958, 10160);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test483");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(14665, 408760, 275072, 9105, 386511);
        org.junit.Assert.assertTrue(i5 == 1094113);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test484");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(3379, 483, 1, 25022, 241570);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test485");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(62610, (int) (byte) -1, 6615, 375, 112604);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test486");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(12057, 1745, 51898, 195986, 27943);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test487");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(364, (int) '4', 2974, 7725, 1126);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test488");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(396848, 24697, 4007, (int) (short) 100, 31549);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test489");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares((int) (short) 1, 2892, 111, 8418, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test490");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(36050, (-1), 4778, 2974, 176396);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test491");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(15190, 828, 108318, 978, (int) (short) 100);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.quatro();
        int i8 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test492");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(828, 663297, 265, 40954, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test493");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(23261, 739, 12057, 43019, 23261);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test494");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(42674, 157116, 1094113, 0, 2664);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test495");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(12, 15259, 108318, 9105, 524841);
        org.junit.Assert.assertTrue(i5 == 657535);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test496");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (short) 1, 40954, 157116, 17294, 15190);
        int i6 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test497");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(17189, 40954, 177426, 8503, 34922);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test498");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(364, 1356, 26198, 524841, 46624);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test499");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (byte) -1, (int) 'a', (int) (short) -1, (int) (short) -1, (int) (short) -1);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test500");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(5825, 100, 241570, 2758, 215081);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }
}

