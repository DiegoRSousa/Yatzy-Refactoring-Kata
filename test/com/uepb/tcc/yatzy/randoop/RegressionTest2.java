package com.uepb.tcc.yatzy.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test001");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(6442, 11804, 241, 7073, 198);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test002");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(483, 62610, (int) (byte) 10, 1957, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test003");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(827, 77545, 10, 412, 1958);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test004");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia((int) (short) 10, 8503, 0, 1, 219);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test005");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(111, 1958, (int) (byte) -1, 3379, 12);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test006");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(978, 7251, 1957, 2014, 2238);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test007");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(0, 43019, (int) ' ', 0, 14665);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test008");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(8699, 351, 2100, 7204, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test009");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(375, (int) (short) 100, 2975, 12, 483);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test010");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(62610, 828, 7251, 7073, 14665);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test011");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(2838, 6442, 2, 8503, 15060);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test012");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(14665, 15060, 43019, 42674, 13393);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test013");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(3379, 13764, 10160, (int) (short) -1, 14710);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test014");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (short) 10, 198, (int) 'a', 10, (int) (short) 10);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.quatro();
        int i8 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test015");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(7073, 2664, 13061, 2758, 3708);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test016");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(2758, 23581, 46624, 7204, (int) (short) -1);
        org.junit.Assert.assertTrue(i5 == 80166);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test017");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(6615, (int) (short) 100, (int) (short) 0, 46430, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test018");
        int[] i_array5 = new int[] { 1648, 15060, (short) 1, 14665, 7204 };
        try {
            int i6 = com.uepb.tcc.yatzy.Yatzy.yatzy(i_array5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array5);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test019");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) 'a', (int) '4', (int) ' ', 111, (int) (short) -1);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test020");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia((int) (byte) 100, 483, 3710, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test021");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(7204, 1, (int) (byte) 10, (int) ' ', 23581);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test022");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(828, 7204, 483, 2892, 1237);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test023");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(1567, 1237, 2, 31549, 826);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test024");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(9105, 4366, 364, (int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test025");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(100, 5825, 6176, 6615, 14116);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test026");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(2758, 31549, 10, 0, 483);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test027");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(3, 8503, 2100, 12057, 2892);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test028");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(219, 2838, 3379, 17189, 2827);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test029");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(1648, 3708, 0, 1745, 978);
        int i6 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test030");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(1958, 1648, (int) 'a', 11804, 23581);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test031");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia((int) (byte) -1, 7073, 828, 17189, 58755);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test032");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(8418, 58755, 827, 2975, 24839);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test033");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(3005, 14665, 3379, 826, 4778);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test034");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(265, 978, 80166, 1745, 24798);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test035");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(3708, 2975, 7725, 3005, 364);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test036");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(11463, 11804, 0, 1648, 241);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test037");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(4366, 3710, 375, 1237, 978);
        org.junit.Assert.assertTrue(i5 == 10666);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test038");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(2664, 111, 3, 4778, 2838);
        org.junit.Assert.assertTrue(i5 == 10394);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test039");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(23581, 24798, 12, 23581, 12057);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test040");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(1957, 8418, (-1), 978, 3710);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test041");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(2838, 13764, 2100, 2014, 6176);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test042");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(364, 7725, 11818, 4366, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test043");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(12057, 46624, (int) (byte) 10, 2974, 10160);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test044");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(3708, 1126, 4778, 2758, 1745);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test045");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(351, 0, 6615, 2827, 13061);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test046");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia((int) '4', 2758, 265, 3379, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test047");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(40954, 739, 2975, 6176, 4778);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test048");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(0, 1126, 0, 31549, 2238);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test049");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(351, 24839, (int) (byte) 1, 13061, 2975);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test050");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(978, 412, 7725, 219, 14710);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test051");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (short) -1, (int) (short) 0, 12, (int) (byte) -1, 265);
        int i6 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test052");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(58755, 1567, (int) (short) 0, 10160, 2827);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test053");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(15286, 1356, 4366, 23261, (int) (short) 100);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test054");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(9105, 10, 14710, 2974, 1126);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test055");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(1745, 100, 10666, 828, 111);
        org.junit.Assert.assertTrue(i5 == 13450);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test056");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(375, 15190, (int) (byte) 0, 8503, 31549);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test057");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois((int) (byte) 1, 10, 375, 412, 2664);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test058");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(3710, 198, 13061, 4778, 14710);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test059");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(10394, 2975, 27943, 0, 8418);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test060");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(27943, 8418, 2758, 2101, 2014);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test061");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(7251, 0, 6176, 0, 1567);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test062");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(14710, (int) (byte) 10, 15259, 2775, 3710);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test063");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(15286, 9105, 1356, (int) (byte) -1, 7251);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test064");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(0, 77545, 5825, 6176, 24798);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test065");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(8503, 23261, 23581, 2, 3);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test066");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo((int) ' ', 978, 0, 9105, 1648);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test067");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) '4', (int) (byte) 100, (int) (short) 100, (int) (byte) 10, (int) (byte) 100);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test068");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance((int) '#', 7204, 13764, 2101, 11818);
        org.junit.Assert.assertTrue(i5 == 34922);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test069");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(77545, 11804, 11463, 13393, 7725);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test070");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(8418, 13393, 0, 2974, 8699);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test071");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(0, 13061, 43019, 11463, 3708);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test072");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(13393, 23581, 34922, 10666, 24839);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test073");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(7251, 2101, 15190, 15286, 351);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test074");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance((int) (short) -1, (int) (short) 100, (int) (byte) -1, 12, (int) (short) -1);
        org.junit.Assert.assertTrue(i5 == 109);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test075");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(10, 40954, 111, 6176, 10394);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test076");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(5825, 13450, 100, 14665, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test077");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois((int) '#', 62610, 6442, (int) (short) 100, 828);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test078");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia((int) '#', 40954, 7073, (int) (short) -1, 351);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test079");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(364, 11804, (int) (byte) -1, 1957, 23261);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test080");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(2758, 9105, 6442, 56977, 14116);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test081");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(14710, 2775, 412, 2100, 42674);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test082");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(7204, 6615, 2892, 2758, 412);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test083");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(1126, 15060, 14116, 12057, 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test084");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(198, 7251, (int) (short) -1, 827, 2);
        int i6 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test085");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(15259, (int) (byte) -1, 2758, 0, 2838);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test086");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(46430, 7073, (int) (short) -1, 3005, 15060);
        org.junit.Assert.assertTrue(i5 == 71567);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test087");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(8699, 0, 12057, 2838, 198);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test088");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(2014, 62610, 2101, 1, 11818);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test089");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (short) 10, 198, (int) 'a', 10, (int) (short) 10);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test090");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(7204, (int) ' ', 2238, 71567, 6615);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test091");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(6615, 483, 77545, 3, 56977);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test092");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) 'a', 0, 0, (int) (byte) 1, (int) (short) -1);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.cinco();
        int i9 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test093");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois((int) 'a', 8418, 1126, 12057, 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test094");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (short) 0, 24798, 15060, (int) (byte) 1, 1177);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test095");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(8418, 2, 375, 14665, 58755);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test096");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(0, (-1), 46430, 77545, 826);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test097");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(7204, 2892, 0, (int) (short) 1, 1);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test098");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(7073, (int) (byte) 10, 364, (int) (short) -1, 7725);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test099");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(11818, 6442, 9105, 198, 219);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test100");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(13450, 219, 2974, 13764, 978);
        org.junit.Assert.assertTrue(i5 == 31385);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test101");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) 'a', 0, 0, (int) (byte) 1, (int) (short) -1);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.seis();
        int i8 = yatzy5.cinco();
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
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test102");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(40954, 483, 10160, 739, 8699);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test103");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(58755, 2100, 828, 1356, 2975);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test104");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (short) 1, (int) (short) 0, 11818, 40954, 0);
        int i6 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test105");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(739, 24798, 9105, (int) (short) 1, 827);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test106");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(23261, 10160, (int) (byte) 100, (int) ' ', 1237);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test107");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(9105, (int) (byte) -1, 7073, (int) 'a', 2664);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test108");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(2775, 241, 24798, 1567, 77545);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test109");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(23581, 62610, 3710, 42674, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test110");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(375, (int) (byte) 0, 8503, 3005, (int) (short) 1);
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test111");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(219, 10160, 31549, (int) (short) -1, 14710);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test112");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(0, 1126, 2838, 1958, 2892);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test113");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres((int) (byte) 0, (int) (short) -1, 13061, 34922, 10160);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test114");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(2238, 2975, 4366, 10160, 4778);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test115");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(6442, 739, 2974, 34922, 13450);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test116");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(62610, (int) 'a', 56977, (int) (short) -1, 15060);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test117");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(62610, 58755, 0, 14665, 8503);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test118");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(109, 0, 198, 24798, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test119");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(15286, 24839, (int) (byte) 100, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test120");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(0, 27943, 1, (int) (short) 100, 1648);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test121");
        int[] i_array1 = new int[] { 828 };
        try {
            int i2 = com.uepb.tcc.yatzy.Yatzy.yatzy(i_array1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array1);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test122");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(2014, 100, 14665, 111, (int) (byte) 1);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test123");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (byte) 1, 241, 100, 265, 0);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test124");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(13450, 2827, 1567, (int) (byte) 10, (int) ' ');
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test125");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance((int) ' ', (int) ' ', 7073, 3708, 8699);
        org.junit.Assert.assertTrue(i5 == 19544);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test126");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(2974, 77545, 1, 241, 19544);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test127");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance((-1), 43019, 2975, 0, 10);
        org.junit.Assert.assertTrue(i5 == 46003);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test128");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(1356, 11463, 14710, 828, 827);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test129");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(3, 15259, 1, (int) (byte) 100, 34922);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test130");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(364, 1567, 412, (int) (byte) 100, 17189);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test131");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(14116, 6176, 11804, 0, 2100);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test132");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia((int) '#', 2838, 15060, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test133");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(7725, 100, 2827, 8503, 1958);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test134");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(0, (int) (short) -1, (int) ' ', 15060, 8503);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test135");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(19544, 43019, 10666, 1745, 15259);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test136");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(2838, (int) (byte) -1, 219, 7725, (int) (short) 100);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test137");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance((-1), 2974, 43019, 0, 6615);
        org.junit.Assert.assertTrue(i5 == 52607);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test138");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(2014, 1957, 2101, 1177, 13393);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test139");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(1356, 0, 80166, (-1), 265);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test140");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(1745, 241, 1567, 2838, 198);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.cinco();
        int i9 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test141");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance((int) (byte) 10, 1958, (int) (byte) 100, (int) (short) 0, 6176);
        org.junit.Assert.assertTrue(i5 == 8244);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test142");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(46624, 1, (int) (byte) 0, 0, 1745);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test143");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(1356, (int) 'a', 42674, (int) (byte) 0, (int) 'a');
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test144");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo((int) (byte) 100, 23581, 8418, 0, 23581);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test145");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(11818, 10, 23261, 56977, 198);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test146");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(11818, 23261, 3, 10, 1648);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test147");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(7204, 2101, 2100, 1957, 7073);
        int i6 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test148");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia((-1), 1567, 2975, 56977, 828);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test149");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(3379, (int) (byte) 0, 1957, 13450, 1745);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test150");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(219, 978, 46624, 1745, 23581);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test151");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(2101, 46003, 27943, 0, 3005);
        org.junit.Assert.assertTrue(i5 == 79052);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test152");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(9105, 11804, 1356, (-1), 2758);
        org.junit.Assert.assertTrue(i5 == 25022);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test153");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(483, 58755, 19544, 15259, 265);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test154");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(0, 10394, 0, 27943, 1958);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test155");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(10160, 12057, 15060, 71567, 43019);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test156");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(8699, 4366, 7073, 40954, 1356);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test157");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(27943, (int) '#', 23581, 12057, 2827);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test158");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(46624, 5825, 10, 10394, 2775);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test159");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(58755, 351, 56977, 7251, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test160");
        int[] i_array6 = new int[] { 375, 3005, 13764, 14665, 52607, 11818 };
        try {
            int i7 = com.uepb.tcc.yatzy.Yatzy.yatzy(i_array6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array6);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test161");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(1177, 1126, (int) (short) 0, 739, 11818);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test162");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(10160, 265, 978, 12, 7204);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test163");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(2758, 46430, 15190, 23261, 13764);
        org.junit.Assert.assertTrue(i5 == 101403);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test164");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) '4', (int) (byte) 100, (int) (short) 100, (int) (byte) 10, (int) (byte) 100);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.cinco();
        int i9 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test165");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(2827, 0, (int) 'a', 241, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test166");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(34922, 3, 0, 12057, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test167");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance((int) (short) 0, 739, 1958, 1, 7204);
        org.junit.Assert.assertTrue(i5 == 9902);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test168");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(2775, (int) (byte) 0, 241, 1957, 43019);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test169");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(27943, 219, 364, 13450, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test170");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(101403, 1957, 351, 4366, 241);
        org.junit.Assert.assertTrue(i5 == 108318);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test171");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(2, (int) (short) 10, 265, 827, 1957);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test172");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(71567, 7073, (int) (short) 0, 7073, 13393);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test173");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(108318, 15286, 1, 0, 46003);
        org.junit.Assert.assertTrue(i5 == 169608);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test174");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(101403, 108318, (int) 'a', (int) (short) 10, 1958);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test175");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(10, 14665, 111, (int) ' ', 43019);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test176");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(3379, 1, 7725, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test177");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(24798, (int) (byte) 100, 4778, 15286, 11818);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test178");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par((int) (byte) 100, 52607, (int) (short) 1, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test179");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(2, 27943, 10, 14665, 2238);
        org.junit.Assert.assertTrue(i5 == 2);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test180");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(9105, 828, 826, 108318, 77545);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test181");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(828, 15060, 198, (int) '#', 8244);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test182");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia((int) '#', 9902, 1648, 14710, 1177);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test183");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(43019, 17189, 46430, 2101, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test184");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(31385, 1177, 42674, 56977, 2014);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test185");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par((int) (byte) 1, 0, 0, (int) (short) 100, 6615);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test186");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(7204, 15259, 3005, 2892, 771);
        int i6 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test187");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(169608, 2100, 111, 10666, (int) (byte) 1);
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test188");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(828, 3, 46624, 7725, 5825);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test189");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(15259, 23261, 0, (-1), 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test190");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(58755, 8418, 219, 100, 46430);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test191");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(10160, 8244, 3379, 31549, (int) (byte) 10);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test192");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(351, 2014, (int) (short) 10, 4366, 23261);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test193");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia((int) (byte) 100, 19544, 9105, 10394, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test194");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(0, 3005, 79052, 23261, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test195");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(0, 40954, (int) (short) 0, 0, 109);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test196");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(14665, 1356, 23261, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test197");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(24798, (int) (byte) 1, 11818, 10, 62610);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test198");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(1237, 14665, 2100, 34922, 13393);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test199");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(13450, 77545, 9105, 827, (int) (byte) -1);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test200");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(169608, 42674, 46624, 2838, 9902);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test201");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(13450, 15060, 40954, 11804, 3710);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test202");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(19544, 2758, 46430, 2664, 6615);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test203");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um((int) '#', 10394, 739, 19544, 2975);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test204");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia((int) ' ', 11804, 4366, 12057, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test205");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(198, 12057, 14116, 1567, 25022);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test206");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(1237, 412, 375, 13061, 5825);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test207");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(2238, 101403, 241, 13450, 1958);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test208");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo((-1), 7073, 56977, 8418, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test209");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(12057, 11463, 12057, 8503, 27943);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test210");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares((int) (byte) 10, 13061, 10666, 31549, 56977);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test211");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(2758, 58755, 109, 31549, 219);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test212");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares((int) (byte) 100, 7073, 77545, 0, 42674);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test213");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia((int) (byte) 100, 10, 10666, 10666, 7204);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test214");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(8244, (int) (short) -1, 4366, 8244, 483);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test215");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(2, 241, 0, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test216");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(1, (int) (short) -1, (int) ' ', 3710, 265);
        org.junit.Assert.assertTrue(i5 == 4007);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test217");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(56977, 46430, 15190, 0, 3005);
        org.junit.Assert.assertTrue(i5 == 121602);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test218");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(2014, 0, 11463, 8244, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test219");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(265, 62610, 9902, 375, 8418);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test220");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(9105, 14710, (int) (byte) 1, 827, 12057);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test221");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(827, 364, 198, (int) (byte) -1, (int) (short) -1);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.quatro();
        int i8 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test222");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(7725, 4007, 46430, 23581, 23581);
        org.junit.Assert.assertTrue(i5 == 105324);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test223");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(739, 24839, 40954, 2758, 79052);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test224");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(826, 0, 2238, (int) (short) -1, (int) (short) -1);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test225");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo((int) (byte) 10, (int) (byte) 1, 7073, 13393, 13393);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test226");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(7073, 12057, 52607, 0, 13764);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test227");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(52607, (int) (short) 1, 828, 105324, 27943);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test228");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(12057, 0, 10160, 10666, 42674);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test229");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(7725, 2974, 15286, 13393, 1958);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test230");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (short) 10, 198, (int) 'a', 10, (int) (short) 10);
        int i6 = yatzy5.seis();
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
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test231");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres((int) (short) 1, (int) ' ', 105324, 9105, 71567);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test232");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (byte) 0, (int) '#', (int) (short) 10, (int) (byte) 1, (int) (short) 100);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.seis();
        int i8 = yatzy5.quatro();
        int i9 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test233");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(10160, 1567, 9902, 241, 7073);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test234");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(13061, 0, 23261, 8418, 17189);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test235");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) '4', (int) (byte) 100, (int) (short) 100, (int) (byte) 10, (int) (byte) 100);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test236");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(46624, 3, 80166, 3710, 17189);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test237");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(7073, 24839, (int) (byte) 1, 739, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test238");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(80166, (int) (byte) -1, 375, 15259, 2100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test239");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(24798, 1958, 46624, 351, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test240");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(11463, (int) ' ', 10160, 15259, 3708);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test241");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) 'a', 0, 0, (int) (byte) 1, (int) (short) -1);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.seis();
        int i8 = yatzy5.quatro();
        int i9 = yatzy5.cinco();
        int i10 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test242");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(111, 1356, 827, 739, (int) ' ');
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test243");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(826, 0, 2238, (int) (short) -1, (int) (short) -1);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.seis();
        int i8 = yatzy5.quatro();
        int i9 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test244");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (short) 10, 198, (int) 'a', 10, (int) (short) 10);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.quatro();
        int i9 = yatzy5.quatro();
        int i10 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test245");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo((int) (byte) 1, (int) '4', 1567, (int) '4', 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test246");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia((int) '#', 1958, 11804, (int) (short) 10, 17189);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test247");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(8699, 2100, 24839, 13393, 1237);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test248");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(826, (-1), 6442, 77545, 1177);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test249");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(169608, 0, 2838, 23261, 2775);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test250");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(1745, 241, 1567, 2838, 198);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.cinco();
        int i9 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test251");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(169608, 1958, 2664, 412, 1648);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test252");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(9105, (-1), (int) (byte) 0, 3710, 111);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test253");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(6442, 2758, 8503, 2775, (int) (short) 1);
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test254");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(375, 79052, 10394, 9902, 6176);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test255");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(58755, 978, 24839, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test256");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(8418, 1648, 2827, 978, 8418);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test257");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(4007, 2758, 62610, 9105, (int) (short) 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test258");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (byte) 100, (int) (short) 0, 2775, 739, 1356);
        int i6 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test259");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(8418, 169608, 15190, (int) (byte) -1, 6176);
        org.junit.Assert.assertTrue(i5 == 199391);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test260");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(2, 169608, 24798, 828, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test261");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(71567, 739, 12, 7725, 23581);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test262");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(46430, 71567, 828, 2238, 46003);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test263");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(101403, 8503, 2775, 4366, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test264");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(199391, 8244, (int) (byte) 0, (int) '4', 23581);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test265");
        int[] i_array3 = new int[] { 31385, '4', 3708 };
        try {
            int i4 = com.uepb.tcc.yatzy.Yatzy.yatzy(i_array3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test266");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(1957, 483, 1356, (int) (short) 1, 46430);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test267");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(46624, (int) (byte) -1, 364, 826, 2975);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test268");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(15259, 58755, 10394, 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test269");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um((int) '4', 7725, 13061, 14116, 1);
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test270");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(31549, 771, 198, 0, 10666);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test271");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(3379, 1958, 14665, 265, 978);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test272");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(15190, 1126, 1177, 7204, 0);
        org.junit.Assert.assertTrue(i5 == 24697);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test273");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(62610, 46003, 2827, 1567, 2758);
        org.junit.Assert.assertTrue(i5 == 115765);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test274");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(0, 46430, 23581, 0, 15190);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test275");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) 'a', 0, 0, (int) (byte) 1, (int) (short) -1);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.seis();
        int i8 = yatzy5.cinco();
        int i9 = yatzy5.seis();
        int i10 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test276");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(2100, 412, 13061, 0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test277");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(0, 23261, 46003, 8418, 34922);
        org.junit.Assert.assertTrue(i5 == 112604);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test278");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (short) 100, 2827, 100, 1356, 2974);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.seis();
        int i8 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test279");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(169608, 4007, 0, 9902, 828);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test280");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo((int) (byte) 1, 2838, 11463, 14710, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test281");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(6442, 7251, 46003, 109, 112604);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test282");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(24798, 2892, 105324, 15286, 169608);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test283");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(5825, 43019, 1745, 0, 1958);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test284");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(364, 1356, (int) (short) 10, 14665, 17189);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test285");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(0, 11463, 1, 0, 2101);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test286");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres((int) (byte) 1, 24839, 14710, 108318, 58755);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test287");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(3708, 40954, 2014, 100, 3710);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test288");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(13764, 80166, 0, 46430, 2101);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test289");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(15060, 8418, 24839, 15259, (int) (byte) 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test290");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(15259, 8418, 3708, (int) (short) 100, 27943);
        org.junit.Assert.assertTrue(i5 == 55428);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test291");
        int[] i_array2 = new int[] { 2, 105324 };
        try {
            int i3 = com.uepb.tcc.yatzy.Yatzy.yatzy(i_array2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test292");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(23261, 10, 77545, 13061, 2664);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test293");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(771, 2100, 375, 23261, 14710);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test294");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(1177, (int) (short) 10, (int) (byte) 100, 58755, 109);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test295");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(7725, 13450, 58755, 11463, 112604);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test296");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(34922, 7725, 2664, 0, 2);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test297");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) '4', (int) (byte) 100, (int) (short) 100, (int) (byte) 10, (int) (byte) 100);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.seis();
        int i8 = yatzy5.seis();
        int i9 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test298");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(10, 115765, 10666, 31385, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test299");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia((int) ' ', 1126, (int) (byte) 0, 79052, 6615);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test300");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(13450, 34922, 10160, 24798, 13393);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test301");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(31385, 3379, 2838, 13393, 771);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test302");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(42674, 13061, (int) (byte) -1, 8244, 23261);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test303");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(483, 121602, 77545, 826, 2238);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test304");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(219, 24697, 31385, 351, 8418);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test305");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(8418, 1648, 2827, 978, 8418);
        int i6 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test306");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(24697, 23581, 169608, 2892, 79052);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test307");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(24697, 112604, 739, 13764, 15190);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test308");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(1, 1567, 31549, 111, 105324);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test309");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(13450, 109, 0, 17189, 2238);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test310");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(0, 79052, 2664, 483, 2775);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test311");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(100, (int) (byte) 10, 739, 2827, 80166);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test312");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia((int) '4', 1648, 0, 1126, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test313");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(351, (int) (short) 0, 2101, 241, 2975);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test314");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(1, (int) (short) 100, 1958, 2664, 3708);
        int i6 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test315");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(62610, 1, (int) 'a', (int) (short) 10, 23581);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test316");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(2974, (int) (short) 1, 1648, 8503, 109);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test317");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(77545, 826, 8503, (-1), 46430);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test318");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois((int) (short) -1, 10394, (int) (short) -1, 109, 46624);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test319");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(2100, 1356, 1356, 14665, 8503);
        int i6 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test320");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois((int) '#', 3708, 3708, 112604, 6442);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test321");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(351, 46624, 826, 241, (int) (short) 10);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test322");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(2775, 3708, 13450, 27943, 1957);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test323");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(3005, (int) '4', (int) (short) 0, 0, 7073);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test324");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(6615, (int) (short) 10, 0, 10666, 412);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test325");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (short) 1, (int) (short) 0, 11818, 40954, 0);
        int i6 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test326");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(169608, 100, 10, 7725, 62610);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test327");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(101403, 115765, 375, 7725, (int) (short) 100);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test328");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(0, 27943, 11818, (int) (short) 100, 105324);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test329");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance((int) (byte) 10, 10, 0, 0, 101403);
        org.junit.Assert.assertTrue(i5 == 101423);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test330");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(3, 12, 412, 112604, 3);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test331");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par((int) (short) 1, 15259, 5825, 15286, 24839);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test332");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(6442, 11818, (int) (byte) -1, 13061, 62610);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test333");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(101403, 31549, 15060, 12057, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test334");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(1958, 14710, 1126, (int) '#', 2827);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test335");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(0, 24798, 7725, 112604, 7204);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test336");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(2101, 46624, 199391, 2827, 827);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test337");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(241, 8699, 0, (int) '4', 71567);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test338");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(108318, 10394, 101403, 46624, (int) (short) 10);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test339");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(14710, 0, 8699, (int) '#', 11804);
        org.junit.Assert.assertTrue(i5 == 35248);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test340");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(14116, 15259, 9902, 1957, 17189);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test341");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(7725, 24798, 31385, 828, 79052);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test342");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (short) 10, 198, (int) 'a', 10, (int) (short) 10);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.quatro();
        int i9 = yatzy5.seis();
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
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test343");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(13061, 15190, 109, 6442, 1177);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test344");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(0, (int) 'a', 169608, 62610, 9902);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test345");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(364, 62610, 2838, 771, 13764);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test346");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(2014, 62610, 1177, 7204, (int) 'a');
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test347");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(1957, 241, 46624, 40954, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test348");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(108318, 121602, 0, 7725, 34922);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test349");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(0, (int) (short) 1, 7725, 3005, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test350");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (byte) 0, (int) '#', (int) (short) 10, (int) (byte) 1, (int) (short) 100);
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
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test351");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(2892, 8244, (int) (byte) 10, 8699, 4778);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test352");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(1567, 58755, 826, (int) (short) 1, 2101);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test353");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares((int) ' ', 101423, 3005, 46430, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test354");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(109, 62610, 27943, 2974, 56977);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test355");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(8244, (int) (short) 100, 43019, 71567, 375);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test356");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(828, 1957, (int) (byte) 100, 241, 13764);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test357");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(7251, 25022, 108318, 9105, 13764);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test358");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(9105, 8503, 12, (int) (byte) 100, 6615);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test359");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(15286, (-1), 2664, 9902, 10666);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test360");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(1177, 4366, 108318, 6442, 3005);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test361");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo((int) (byte) 100, 100, 12, 1957, 412);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test362");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(2775, 77545, 2974, 10394, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test363");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(1648, 15286, 6176, 121602, 4778);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test364");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(11818, 25022, 2838, 4778, 23581);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test365");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(100, 40954, 828, 112604, 108318);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test366");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(24798, 10666, 2100, 6615, 31549);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test367");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(1177, 14710, (int) (byte) 100, 1356, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test368");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(111, 1356, 827, 739, (int) ' ');
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test369");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(46430, 100, 2101, 46003, 40954);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test370");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(35248, 2975, 52607, 108318, 4366);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test371");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(13061, 978, 2101, 2101, 115765);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test372");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(13393, 1957, 483, 25022, 42674);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test373");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(1745, (int) (byte) 1, 27943, 121602, 5825);
        org.junit.Assert.assertTrue(i5 == 157116);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test374");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(121602, 46624, 827, 771, 1745);
        org.junit.Assert.assertTrue(i5 == 171569);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test375");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(8699, 2975, 23261, 7073, 2014);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test376");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo((int) (short) 1, 2758, 4778, 24839, 2664);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test377");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(23581, 115765, 43019, 2838, 978);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test378");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(31549, 58755, 2838, 5825, 2238);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test379");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares((int) (short) 100, 8699, 199391, 42674, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test380");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(24697, 101423, 109, 483, 2664);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test381");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(13061, 105324, (int) '4', 15190, 7073);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test382");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo((int) (byte) 1, 0, 2775, (int) (byte) 100, 241);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test383");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(1648, 771, 10666, 2014, (int) (byte) 1);
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test384");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(198, 2775, 3710, 8418, 2838);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test385");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(483, 109, 4366, 15259, 111);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test386");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia((int) (short) 10, 2974, 3710, 111, 42674);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test387");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(2100, (int) (byte) 10, 0, 219, 364);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test388");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(1, 198, 241, 5825, 1745);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test389");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(1237, 739, 0, 4007, 15259);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test390");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo((int) (byte) 0, 351, 3005, 14665, 8244);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test391");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(0, 24697, (int) (byte) 0, 23581, 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test392");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(14116, 1126, 265, 79052, 483);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test393");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(483, 1648, 14710, 2758, 157116);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test394");
        int[] i_array5 = new int[] { ' ', 198, (short) 0, 31549, 31549 };
        try {
            int i6 = com.uepb.tcc.yatzy.Yatzy.yatzy(i_array5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array5);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test395");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(3710, 13061, 58755, 12057, 1567);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test396");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(77545, 4778, 171569, (int) (byte) -1, 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test397");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo((int) (short) 0, 2, 351, 3379, 77545);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test398");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(771, 9902, 25022, 483, 4007);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test399");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(0, 24798, 1957, 15286, 157116);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test400");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(2775, 3005, 3710, (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test401");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (short) 100, 2827, 100, 1356, 2974);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test402");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(2775, 828, 219, 2, 2664);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test403");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(0, 109, (int) (short) 100, 71567, 111);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test404");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(46624, 265, 77545, 14710, 3379);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test405");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(169608, 13061, 157116, 34922, 11804);
        org.junit.Assert.assertTrue(i5 == 386511);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test406");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(219, 11804, 1648, 23261, 13450);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test407");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(8699, 3379, 0, 31385, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test408");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(9105, 1648, 4778, 978, 43019);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test409");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(9902, 11818, 2975, 24839, 14116);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test410");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(241, 2775, 241, 12, 13061);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test411");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(1648, 58755, 3005, 108318, 739);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test412");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(62610, 19544, 7204, 0, 157116);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test413");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(7073, 9105, 17189, 3379, 2775);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test414");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(171569, 14710, 1126, 2974, 1356);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test415");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(35248, 31385, 0, 27943, 8699);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test416");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(739, 115765, (int) (byte) -1, 2975, 101423);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test417");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(171569, (int) (byte) 10, 109, (int) (byte) 10, 978);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test418");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(12, 77545, 6615, 8244, 7073);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test419");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par((int) (byte) 1, 111, 0, 1958, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test420");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(7073, 1957, 56977, 23261, (int) '4');
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test421");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(101403, 198, 0, 826, 4007);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test422");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(15190, 40954, 1126, (int) (byte) 0, 1958);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test423");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(826, 35248, 3379, (int) (byte) 10, 1648);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test424");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(12057, 265, 12, 2238, 1177);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test425");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(3710, 71567, 1126, 121602, 43019);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test426");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(7073, 827, 1126, 1957, 412);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test427");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(23261, 79052, 14710, (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test428");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(13061, (-1), 7204, 101423, 15190);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test429");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(6615, 0, 24798, (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test430");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(2758, 198, 0, 56977, (int) '4');
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test431");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia((int) (byte) 10, 77545, 2975, (int) 'a', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test432");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (short) 10, 198, (int) 'a', 10, (int) (short) 10);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test433");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(5825, 115765, 55428, 826, 112604);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test434");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(24798, 1957, 10394, (int) ' ', 27943);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test435");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(101403, 386511, 1648, 2014, 12);
        org.junit.Assert.assertTrue(i5 == 491588);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test436");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(241, 52607, 23581, 4778, 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test437");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(171569, 7251, 771, 828, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test438");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(412, 3379, 10394, 0, (int) (short) 1);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test439");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(2838, (int) (short) 0, 8503, 3710, 157116);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test440");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(0, 14710, 35248, 3005, 31549);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test441");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(978, 2892, 5825, 1126, 1567);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test442");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(8503, 2014, (-1), 34922, 8244);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test443");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(7073, 2101, 8418, 2775, 1177);
        org.junit.Assert.assertTrue(i5 == 21544);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test444");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(105324, 1237, 771, 31549, 35248);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test445");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(79052, 24798, 12, 265, 6176);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test446");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres((int) (byte) -1, 4778, 112604, 241, 1957);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test447");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) 'a', 0, 0, (int) (byte) 1, (int) (short) -1);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.quatro();
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
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test448");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia((int) (byte) 1, 24798, 2101, 1126, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test449");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(7204, 15259, 3005, 2892, 771);
        int i6 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test450");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(13393, 21544, 169608, 13764, 23261);
        org.junit.Assert.assertTrue(i5 == 241570);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test451");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(101423, 4778, 9105, 828, 3005);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test452");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(25022, 46430, 21544, 2838, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test453");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(23581, 1958, 105324, 828, 11804);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test454");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(21544, 219, 978, 115765, 9902);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test455");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(0, 1126, (int) (short) 10, 2758, 11804);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test456");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia((int) (byte) -1, (int) '4', 0, 3379, 1958);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test457");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(15060, 24697, 241, 1, 25022);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test458");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(1356, 11818, 1, 2238, 351);
        int i6 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test459");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(2238, 101403, 0, 3, 157116);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test460");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (short) 10, 198, (int) 'a', 10, (int) (short) 10);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.quatro();
        int i9 = yatzy5.seis();
        int i10 = yatzy5.seis();
        int i11 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test461");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(7073, 978, 169608, 2827, 827);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test462");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(739, 40954, 157116, 0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test463");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(1648, 11818, 6176, 2974, (int) (byte) 100);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test464");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(978, 0, 241, 9902, 4778);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test465");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(157116, 7251, 1567, 826, 8244);
        org.junit.Assert.assertTrue(i5 == 175004);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test466");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(0, 6615, 13764, (int) (short) -1, 25022);
        org.junit.Assert.assertTrue(i5 == 45400);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test467");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(1237, (int) (short) 1, 46624, 80166, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test468");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(2975, (int) (short) 10, 6442, 157116, 491588);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test469");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(13393, 1237, 0, 199391, 23261);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test470");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(24798, 46003, 31549, 3708, 15190);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test471");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(11463, 0, 2100, 100, 375);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test472");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(71567, 121602, 1356, 10160, 42674);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test473");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(8244, 0, 0, 6176, 2100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test474");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) 'a', 0, 0, (int) (byte) 1, (int) (short) -1);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.seis();
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
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test475");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(826, 8699, 3379, 978, 14665);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test476");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(0, 2, 71567, 12057, 7073);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test477");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(34922, (int) (byte) 100, (int) 'a', (int) (byte) -1, 101403);
        org.junit.Assert.assertTrue(i5 == 136521);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test478");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (byte) -1, 827, (int) ' ', (int) (byte) -1, 1);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.quatro();
        int i8 = yatzy5.cinco();
        int i9 = yatzy5.quatro();
        int i10 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test479");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(23581, 11804, 219, (int) (short) 10, 15286);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test480");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(108318, (int) (byte) 10, 13393, 1, 24798);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test481");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(9902, 43019, 80166, (-1), 121602);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test482");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(12, 5825, 8503, (-1), 12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test483");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(8699, 62610, (int) (short) 100, 46430, 77545);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test484");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(11818, 491588, 1177, 24697, 483);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test485");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(71567, 10666, 11804, 412, 8418);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test486");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(121602, 0, 7251, 11804, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test487");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) 'a', 0, 0, (int) (byte) 1, (int) (short) -1);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.seis();
        int i8 = yatzy5.cinco();
        int i9 = yatzy5.quatro();
        int i10 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test488");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(6442, 77545, 58755, 2975, 43019);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test489");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(199391, 13764, 2664, (int) (short) 1, 80166);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test490");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(1237, 109, 0, 175004, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test491");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(0, 2758, 71567, 115765, 2975);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test492");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(43019, 199391, 739, 9902, 11804);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test493");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (byte) 0, 2, 111, (int) (short) 100, 0);
        int i6 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test494");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(35248, 112604, 2238, 826, 2100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test495");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(1745, 15060, 17189, (int) (short) 0, 15259);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test496");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(7251, 2100, 115765, 77545, 111);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test497");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(14116, 55428, 11804, 3708, 100);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test498");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(5825, 108318, 175004, 108318, (int) ' ');
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test499");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(13061, 58755, 13393, 2664, 14116);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test500");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(827, 108318, 1958, 0, 24798);
        org.junit.Assert.assertTrue(i5 == 0);
    }
}

