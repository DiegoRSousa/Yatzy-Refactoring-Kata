package com.uepb.tcc.yatzy.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test001");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(6615, 6615, 1126, 1567, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test002");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(1648, 1177, 1237, 6176, (int) (short) 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test003");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (byte) 100, (int) '#', (int) (byte) -1, 241, (int) (byte) 0);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test004");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(2775, (int) (short) -1, 826, 6176, 1745);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test005");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(2775, 0, (int) (byte) 100, 4366, 2892);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test006");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres((int) (byte) -1, 2014, (int) ' ', 2664, 3379);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test007");
        int[] i_array5 = new int[] { 2238, 2892, 739, 4366, 2975 };
        try {
            int i6 = com.uepb.tcc.yatzy.Yatzy.yatzy(i_array5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array5);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test008");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(2775, 2827, 483, 4778, 2827);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test009");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(826, (int) (short) 1, (int) ' ', 198, (int) (byte) 1);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test010");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(2, 2974, (int) (short) 100, 111, (int) '#');
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test011");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(10, 4778, (int) (byte) 0, 2664, 4366);
        org.junit.Assert.assertTrue(i5 == 11818);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test012");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(0, 1958, 6176, 2827, 2758);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test013");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) 'a', 0, 0, (int) (byte) 1, (int) (short) -1);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.seis();
        int i8 = yatzy5.cinco();
        int i9 = yatzy5.quatro();
        int i10 = yatzy5.cinco();
        int i11 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test014");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(2975, 100, 364, 265, 219);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test015");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(0, 364, 12, 1177, 483);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test016");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (byte) 1, 241, 100, 265, 0);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test017");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(6615, 0, 3379, 6615, 1745);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test018");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(6615, 7251, 2838, 3708, 2758);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test019");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(2838, 0, 0, 2775, 2100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test020");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(0, 2975, (int) ' ', (-1), (-1));
        org.junit.Assert.assertTrue(i5 == 3005);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test021");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(2892, 1745, (int) '#', 11818, 1237);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test022");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(1958, 739, 198, (int) (byte) 100, 1126);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test023");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(100, 375, 2975, 100, 826);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test024");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(1957, 412, 1567, 3005, (int) ' ');
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test025");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia((int) '#', 2975, 241, 978, 827);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test026");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(7251, 3708, 3379, (int) (short) -1, 739);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test027");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(2100, 1957, 8418, 11463, 2758);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test028");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(771, 6176, 375, (int) (byte) 10, 2838);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test029");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo((int) (short) 10, 2014, 1745, 2775, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test030");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(364, 2014, 100, 12, 2100);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test031");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(828, 3005, 7251, (int) 'a', 6176);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test032");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(2975, 1237, 12, 771, 3379);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test033");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo((int) (byte) 100, 2100, (int) (short) 100, 4366, 1126);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test034");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(412, 2014, (int) '#', 6615, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test035");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(375, (int) (short) 10, 1, 2974, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test036");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(1356, 0, 1, 351, 6176);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test037");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(826, 11463, 8418, 1237, 1237);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test038");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(6176, (int) '#', 828, 364, 375);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test039");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(2775, 1648, 827, 4778, 2974);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test040");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(6176, (-1), (int) (byte) 1, 2758, 739);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test041");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(3379, 1958, 1, 483, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test042");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(351, (int) ' ', 1958, 2892, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test043");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(1957, 7251, 2975, 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test044");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(351, 219, 1648, 0, 2664);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test045");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo((int) (short) -1, 2014, 11463, 12, 198);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test046");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(2238, 828, 2664, (int) (short) 100, 2758);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test047");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(3005, 8418, 351, (int) (byte) -1, 2892);
        org.junit.Assert.assertTrue(i5 == 14665);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test048");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(1958, 2014, (int) 'a', 1567, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test049");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um((int) (short) 0, (int) ' ', 2892, 1567, 11463);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test050");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(219, (int) (short) 100, 3005, 4366, 2758);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test051");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(828, (int) (byte) 1, 2, 1, 978);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test052");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares((int) '#', 1356, 10, 14665, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test053");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(11463, (int) (byte) 0, (int) (byte) -1, 375, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test054");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(241, 0, (int) (byte) -1, (int) '4', 219);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test055");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(11818, 351, 12, 2100, 978);
        org.junit.Assert.assertTrue(i5 == 15259);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test056");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(1648, 1745, (int) (byte) 100, 1177, 2664);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test057");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(0, 3708, 2014, 2758, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test058");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(111, 1126, (int) (short) 10, (int) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test059");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(241, 483, (int) (short) 100, 3379, 7251);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test060");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(828, 219, (int) (short) 10, 2974, 828);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test061");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(3708, 4778, (int) (short) 0, 0, (-1));
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test062");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(2100, 3710, (int) (short) 100, 1958, 1237);
        org.junit.Assert.assertTrue(i5 == 9105);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test063");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia((int) (short) 10, 2892, 0, (int) (short) 100, 2838);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test064");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(219, 6615, 1648, 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test065");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(0, 1, 2775, 3379, 265);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test066");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(2975, 1648, 10, 1356, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test067");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(10, (int) (byte) 10, 2664, (int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test068");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(2775, (int) (short) -1, 11818, 364, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test069");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois((int) (short) 1, 2014, 826, 2664, 351);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test070");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(15259, 0, 8418, 11463, 828);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test071");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(1, 12, 3710, 14665, 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test072");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance((int) 'a', 739, 2014, 2975, (int) (byte) 0);
        org.junit.Assert.assertTrue(i5 == 5825);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test073");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia((int) (short) 10, 0, 4778, (int) (short) 1, 7251);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test074");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(828, (int) '4', 2775, 11818, 2974);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test075");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(12, 241, (int) (short) 10, (int) (byte) 0, 111);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test076");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(1648, 3708, 0, 1745, 978);
        int i6 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test077");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (byte) -1, 3379, 828, 1356, 2892);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test078");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(2664, 826, 0, 2758, 5825);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test079");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(3710, (int) (byte) -1, (int) (short) 100, 828, 1958);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test080");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(2827, 6176, 2974, 4366, 1958);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test081");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(739, (int) (byte) 0, 2975, 4366, 2100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test082");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(241, 351, 4366, 3379, 2838);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test083");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(4778, 2974, 5825, 3710, 241);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test084");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(827, 827, 2238, 1957, (int) '4');
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test085");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) 'a', 0, 0, (int) (byte) 1, (int) (short) -1);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.quatro();
        int i8 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test086");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(12, 1177, 2838, 2892, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test087");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(2238, 2975, 771, 2238, 2775);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test088");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia((int) (short) 10, (int) (short) 100, 2838, 111, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test089");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(198, 1356, 0, 1957, 375);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test090");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um((int) (short) -1, (int) 'a', 2892, 1177, 198);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test091");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um((int) 'a', 826, (int) '#', 0, 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test092");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(351, 2, 0, 100, 1648);
        org.junit.Assert.assertTrue(i5 == 2101);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test093");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia((int) (short) 0, 0, 265, 6176, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test094");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(11818, 15259, 198, 1745, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test095");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(2101, 0, 2100, (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test096");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois((int) (short) 10, 2974, (int) '4', (int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test097");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo((int) (short) 0, 219, 8418, 15259, 351);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test098");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um((int) (short) 10, 7251, 4366, 100, 3708);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test099");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(8418, 1957, 2101, 11463, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test100");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia((int) (short) 1, 375, (int) (byte) -1, 1356, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test101");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(8418, 5825, 2974, (int) ' ', 2838);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test102");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par((int) (short) 100, 828, 1745, 1958, 11818);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test103");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(4366, (int) (byte) 10, 198, 1958, 2664);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test104");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia((int) (byte) 0, 2014, 14665, 3379, 1177);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test105");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(1177, 826, 4778, 1, 1745);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test106");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(111, 1745, 1237, 828, 2975);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test107");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(5825, (int) (short) -1, 14665, 827, 1126);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test108");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(2014, 1648, (int) (short) -1, 0, 2838);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test109");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(2975, 2664, (int) 'a', 1177, 198);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test110");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(2775, 2014, 5825, 2775, 2838);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test111");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(828, (int) (short) -1, 1237, 241, 375);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test112");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(15259, 351, 11463, (int) (short) 100, 1958);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test113");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(8418, (int) (short) 10, 10, 111, 9105);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test114");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(14665, 10, 412, 11818, 2101);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test115");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(0, 1745, 10, 2664, 11463);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test116");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (byte) 0, (int) '#', (int) (short) 10, (int) (byte) 1, (int) (short) 100);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test117");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(2758, 1957, 978, 1567, 771);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test118");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(14665, 2892, 1745, 1648, 14665);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test119");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(2, 9105, 0, (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test120");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(1356, 1648, 3005, (int) (byte) 10, 828);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test121");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(11463, 3708, 2238, 375, 1356);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test122");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(8418, 0, 2238, (int) (byte) -1, 1);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test123");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(265, 826, 2758, 6615, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test124");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(364, 2, 1745, 2238, 265);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test125");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(412, 241, 9105, 351, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test126");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um((int) (byte) 10, 7251, 2101, 6176, 2974);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test127");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(111, (int) (short) -1, (int) (short) 10, 4778, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test128");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(2975, 2975, (int) (short) 1, 2775, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test129");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(2664, (-1), 6615, 11818, 826);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test130");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(978, 351, 4778, 10, 771);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test131");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(1648, 2101, (int) (byte) 0, 3710, 7251);
        org.junit.Assert.assertTrue(i5 == 14710);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test132");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(351, 12, (int) (short) 0, 198, 1237);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test133");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(1648, 14665, 2892, 10, 4366);
        org.junit.Assert.assertTrue(i5 == 23581);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test134");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(11818, (int) (short) 100, 827, 412, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test135");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(0, 3708, 2974, (int) (short) -1, 8418);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test136");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(3708, 1648, 241, 1567, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test137");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(3005, (int) '#', (int) (short) -1, 1, 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test138");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(198, (int) (byte) -1, 4778, 0, 8418);
        org.junit.Assert.assertTrue(i5 == 13393);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test139");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(1, 4778, 0, 2827, 10);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test140");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(4778, (int) (short) 100, 11818, 15259, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test141");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um((int) ' ', (int) (byte) 1, 826, 0, 12);
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test142");
        int[] i_array4 = new int[] { (-1), 2975, (-1), 2838 };
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.yatzy(i_array4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array4);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test143");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(412, 771, 0, 483, 826);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test144");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(3379, (int) '4', 2838, 3710, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test145");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(3710, 111, 7251, 351, 739);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test146");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(0, 1957, 7251, 4366, 2238);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test147");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia((int) (byte) -1, 2775, 1126, 219, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test148");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(5825, 3708, 23581, (int) (short) 10, 364);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test149");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(13393, 2664, 2664, 2975, 1567);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test150");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(2101, (int) (short) -1, 14665, 10, 11463);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test151");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(483, (int) 'a', 6176, (int) '4', 265);
        org.junit.Assert.assertTrue(i5 == 7073);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test152");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo((int) (short) 0, (int) (byte) 1, (int) (byte) 100, 11463, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test153");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(0, (int) (short) -1, 375, 12, 1745);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test154");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(2974, 364, 1237, 1648, 219);
        org.junit.Assert.assertTrue(i5 == 6442);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test155");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia((int) (short) 100, 2758, (int) '4', 1356, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test156");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(6442, 4366, 0, 12, 2775);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test157");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia((int) (short) -1, 12, 8418, 12, 2238);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test158");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(771, 5825, 2238, (int) (byte) 10, 6442);
        org.junit.Assert.assertTrue(i5 == 15286);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test159");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois((int) (short) 10, 1648, 2664, (int) (short) -1, (-1));
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test160");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(13393, 739, 7251, 12, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test161");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(23581, 14710, 6176, (int) ' ', 4778);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test162");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(265, 219, 4366, (int) (byte) 0, 483);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test163");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(1237, 4778, 827, 2100, 1648);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test164");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(771, 8418, 827, (int) '4', 6176);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test165");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(771, 111, 771, 1237, 241);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test166");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(241, 2775, 2827, (int) 'a', 2758);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test167");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance((int) (short) -1, 7251, (int) (short) 10, 265, 978);
        org.junit.Assert.assertTrue(i5 == 8503);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test168");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um((int) (short) -1, 2101, 198, 8418, (int) (byte) 10);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test169");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(0, 3005, (int) (short) 1, 1237, 828);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test170");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(351, 1237, 7073, 23581, (int) (short) 100);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test171");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(15259, 4366, 265, 8503, 8503);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test172");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(1567, 1126, 265, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test173");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia((int) (short) 1, (int) (short) -1, 828, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test174");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo((int) (byte) -1, 3005, 3379, 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test175");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(265, 3005, 1745, 12, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test176");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(13393, 14665, (int) (short) 0, 7251, 978);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test177");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(483, (int) (short) -1, (int) (byte) 10, 2014, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test178");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um((int) '#', 2827, 2892, 826, 828);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test179");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um((int) (byte) 1, (int) '4', 14710, 827, (-1));
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test180");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia((int) '#', 8418, 0, (int) '#', 23581);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test181");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) '4', (int) (byte) 100, (int) (short) 100, (int) (byte) 10, (int) (byte) 100);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test182");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(2101, 2827, 2758, 23581, 351);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test183");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(364, 412, (int) (short) 0, 1957, 1356);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test184");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um((int) '#', 375, 6615, 2827, 111);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test185");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(412, 1356, 3708, 10, 3005);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test186");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(5825, (int) (byte) -1, 3710, (int) (byte) -1, 2827);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test187");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(0, 0, 13393, 6442, 6442);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test188");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo((int) (short) 0, 3708, 2664, 3379, 483);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test189");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(3379, 5825, 11463, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test190");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance((int) (short) 1, 826, 4778, 828, 771);
        org.junit.Assert.assertTrue(i5 == 7204);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test191");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(7251, 265, 2974, (int) (byte) 0, 1567);
        org.junit.Assert.assertTrue(i5 == 12057);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test192");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo((int) (short) 10, 2827, (int) (short) 0, 11463, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test193");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (short) 100, 2974, 351, 826, 2775);
        int i6 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test194");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(198, (int) '#', 1356, 771, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test195");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres((int) (byte) 100, 0, 2, (int) (byte) 10, (int) (short) -1);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test196");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(351, 5825, 241, 219, 1);
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test197");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(7204, (int) (short) 10, 483, 412, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test198");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(2238, 2838, 412, 1, 2827);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test199");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(14665, 2664, 3710, 1356, 412);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test200");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (byte) 100, (int) '#', (int) (byte) -1, 241, (int) (byte) 0);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test201");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(11463, (int) (short) 0, 1648, 14665, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test202");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(13393, 4366, 14665, 7204, 2892);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test203");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(2101, 11463, 2100, 0, 11463);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test204");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(0, 826, 351, 265, 111);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test205");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(2827, 5825, 375, (int) (short) 10, 12057);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test206");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(198, 6176, 2838, 771, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test207");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(1958, 0, 0, 826, 198);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test208");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(7073, 2664, 1958, 826, 1958);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test209");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(0, 3005, (int) (byte) 100, 978, 1126);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test210");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance((int) (short) -1, 0, 771, 6615, 2775);
        org.junit.Assert.assertTrue(i5 == 10160);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test211");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(14665, 7251, (int) (byte) 1, 1745, 11818);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test212");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um((int) (short) 1, (int) ' ', 2238, 265, 2);
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test213");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(2238, 11463, (int) 'a', 828, (int) (byte) 10);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test214");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(4366, 198, 7251, 0, 5825);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test215");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(5825, 2827, 2014, (int) (short) 10, 7073);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test216");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (byte) 100, (int) (short) 0, 2775, 739, 1356);
        int i6 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test217");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(1126, 241, 2758, 9105, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test218");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) 'a', 0, 0, (int) (byte) 1, (int) (short) -1);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.quatro();
        int i8 = yatzy5.quatro();
        int i9 = yatzy5.seis();
        int i10 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test219");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(7204, 241, 828, 1126, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test220");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(1, 15259, 1648, 0, 2974);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test221");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(8418, 3005, 8503, 14665, 9105);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test222");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) 'a', 0, 0, (int) (byte) 1, (int) (short) -1);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.seis();
        int i9 = yatzy5.cinco();
        int i10 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test223");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(10160, 3379, 1567, 2100, 7073);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test224");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia((int) (short) 0, 351, (int) (byte) -1, 3710, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test225");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(6442, 1126, 2827, 2974, 198);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test226");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(1177, (int) (byte) 1, 2101, 2838, (int) (byte) 100);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test227");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(15259, 10160, (int) 'a', 0, (int) (short) 10);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test228");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(2975, 8418, (int) (byte) 0, 13393, 12);
        org.junit.Assert.assertTrue(i5 == 24798);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test229");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(375, 10160, 24798, (-1), 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test230");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(1, 2014, 1237, 8503, 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test231");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(2238, 2664, 13393, 12, 6176);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test232");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(219, 1957, 2014, 6442, 1567);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test233");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(2238, 351, 24798, (int) (byte) 1, 1648);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test234");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(3708, 2758, 0, 14665, 3708);
        org.junit.Assert.assertTrue(i5 == 24839);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test235");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(1177, 12, 826, 828, 2758);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test236");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(1237, 241, 6176, 1177, 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test237");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(7204, 0, 1648, (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test238");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(14710, 771, 24798, 2101, 14710);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test239");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (short) 100, (int) '4', 1356, (int) (byte) -1, (int) ' ');
        int i6 = yatzy5.seis();
        int i7 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test240");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(2, 2975, 2238, 7073, 12);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test241");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(100, 2775, 10160, 2101, 12057);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test242");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(1958, 2664, (int) ' ', 3379, 1356);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test243");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(2838, 1648, 0, 2, 2892);
        org.junit.Assert.assertTrue(i5 == 2);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test244");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(1567, (int) (short) 0, (int) (byte) 0, 375, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test245");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(2827, (int) (byte) -1, 2664, 364, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test246");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(9105, 0, 2014, 1356, 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test247");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(2014, (int) (short) 10, 2974, 2014, 6615);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test248");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (short) 0, 4366, 7073, (int) (byte) 10, 2838);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test249");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(826, 375, (int) (byte) 1, 10, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test250");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(14665, 5825, (int) (byte) 1, 24839, 24839);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test251");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres((int) (byte) 10, 1237, 12, 483, 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test252");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(10, 1567, 1356, 2101, 3710);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test253");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(4366, 14710, 2014, 12057, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test254");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(7204, 0, 739, (int) '4', 739);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test255");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(11463, 2838, 1567, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test256");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(8418, 5825, 2975, (int) (short) 1, 100);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test257");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(2892, (int) (byte) 100, (int) (short) 1, 4366, 198);
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test258");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(1745, 483, (int) (byte) 100, 11463, 1177);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test259");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres((int) (short) 0, 13393, 412, 351, 6615);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test260");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(111, 1237, 6176, 1567, 11463);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test261");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(13393, 3710, 1958, 827, 14665);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test262");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (byte) -1, (int) 'a', (int) (short) -1, (int) (short) -1, (int) (short) -1);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.seis();
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
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test263");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(483, 827, 739, 5825, 1648);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test264");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(10, (int) (short) -1, (-1), 0, 351);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test265");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(2838, 0, 1567, 4778, 826);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test266");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(6176, 3005, 23581, 4366, 6176);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test267");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(1237, 1, 13393, 0, 978);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test268");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(10, (-1), 1957, 14710, 2101);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test269");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(241, 15286, 351, (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test270");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(6442, 2775, 1177, 2101, 826);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test271");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(2892, 483, 8418, 0, 3379);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test272");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par((int) (short) 10, 265, 1957, 3708, 3005);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test273");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(198, 3708, 7204, 8418, 1237);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test274");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia((int) (short) 0, 0, 7204, 1957, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test275");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(2664, 4366, 3708, 198, 2758);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test276");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(3379, 7251, 2664, 3710, 1177);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test277");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(2758, 3005, 12, 12057, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test278");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(15286, 0, 2238, 2238, 111);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test279");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(1648, 1, 15259, 265, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test280");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(5825, 100, 1648, 7251, (int) (byte) 1);
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test281");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(7204, 15259, 3005, 2892, 771);
        int i6 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test282");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(12, 7073, (int) (short) 0, 978, 111);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test283");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(8503, 8503, (int) (short) 1, (int) (short) 100, 2775);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test284");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(6176, 1958, 1745, 12, 1745);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test285");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia((int) (short) 100, 11818, 6442, 2974, 8418);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test286");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(219, 15286, 2101, 12057, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test287");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(24798, 978, 1745, 2838, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test288");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(1648, 2014, 7073, 978, (int) (short) 1);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test289");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(10160, 1648, 826, (int) (short) -1, 364);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test290");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(2758, 4366, 483, 412, 15259);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test291");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia((-1), 0, 2827, (int) (byte) -1, 1648);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test292");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(265, 24839, 8418, 1957, 1958);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test293");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(11463, 24798, 827, (int) '4', 7251);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test294");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(0, 11463, 2101, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test295");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(8503, 1, 826, 241, 364);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test296");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(351, 241, 3708, 3379, 10);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test297");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(14710, 2100, (int) '#', 4778, 3005);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test298");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(828, 7251, 3005, 24798, 14710);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test299");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo((int) '4', 219, 219, (int) (byte) 10, 1126);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test300");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par((int) (byte) 0, 483, 364, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test301");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(0, (int) ' ', 2101, 412, 265);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test302");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(826, 23581, 14665, 11463, 2838);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test303");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(265, 2975, 3005, 111, 2974);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test304");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres((int) 'a', 2975, 111, 2100, 13393);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test305");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(351, 7251, 15286, 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test306");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(2892, 2974, 11463, 24839, 1356);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test307");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(0, 198, (int) (short) -1, 100, 364);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test308");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia((int) (short) -1, 14710, 827, 2014, 6615);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test309");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(3005, 11818, 7251, (int) (byte) 0, 14710);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test310");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(111, (int) (short) -1, 1567, 198, 739);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test311");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(265, 7073, 5825, 483, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test312");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(8418, 2892, 1648, 23581, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test313");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(2238, 198, (int) (byte) 10, 0, 2838);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test314");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(0, 13393, 100, 6176, 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test315");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(2892, 13393, 2101, 7073, (int) (byte) -1);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test316");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(771, 2974, (int) (byte) 1, 364, 12057);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test317");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(1126, 11463, 1957, 3708, 2100);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test318");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois((int) (short) 10, (int) ' ', 828, 3710, 2);
        org.junit.Assert.assertTrue(i5 == 2);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test319");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo((int) '4', 7073, 771, 2892, 1356);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test320");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(827, 364, 198, (int) (byte) -1, (int) (short) -1);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test321");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(1356, 24839, 100, 1648, 0);
        org.junit.Assert.assertTrue(i5 == 27943);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test322");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(3379, 12057, 1177, 24839, 1567);
        org.junit.Assert.assertTrue(i5 == 43019);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test323");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(13393, (int) (short) 10, 0, 27943, (int) '#');
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test324");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(2664, 8503, 8503, (int) (byte) -1, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test325");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia((int) (byte) 10, 9105, 1126, 3005, 351);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test326");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(7251, 23581, 0, 12057, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test327");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares((int) ' ', 2975, 1356, 1126, 2974);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test328");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(2758, (int) (short) 10, 3005, 978, 24798);
        org.junit.Assert.assertTrue(i5 == 31549);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test329");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(0, 351, 375, 2, 828);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test330");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(265, 4366, (int) (byte) 1, 11818, 739);
        org.junit.Assert.assertTrue(i5 == 17189);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test331");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(0, 6176, 827, 6442, 1745);
        org.junit.Assert.assertTrue(i5 == 15190);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test332");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(11818, 2014, 1177, 3005, 43019);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test333");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(1356, 364, (int) (short) 100, 219, 351);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test334");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(1126, 12057, 15259, (int) (short) 0, 14665);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test335");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(2664, 828, 241, 198, 2827);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test336");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(375, 15190, 2975, 412, 15286);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test337");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(1957, 3379, 10160, (int) (short) 10, 8418);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test338");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(265, 0, 739, 0, 12057);
        org.junit.Assert.assertTrue(i5 == 13061);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test339");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(375, 1745, 1, 9105, 100);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test340");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance((int) (byte) 1, 12, 2101, 23581, 15259);
        org.junit.Assert.assertTrue(i5 == 40954);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test341");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(7204, 0, 364, 14710, 5825);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test342");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres((int) 'a', 8418, 828, 375, 2892);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test343");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(2014, 13393, 2975, 15286, 2775);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test344");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(2238, 0, (-1), 412, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test345");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia((int) '#', 8503, (int) (short) 0, 1958, 1958);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test346");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(3708, 0, 1648, 412, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test347");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(11463, 219, 111, 24798, 10160);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test348");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(24839, 0, (int) (short) 1, 265, 826);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test349");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(826, (-1), 14665, 2775, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test350");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(2827, 219, (int) (short) 10, 43019, 7073);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test351");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(1356, 14710, 0, 771, 40954);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test352");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(2775, (int) (byte) 10, 9105, 15259, 12057);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test353");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(0, 483, 1, 826, 241);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test354");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(8503, 14710, 2014, 364, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test355");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(483, 412, 0, 43019, 13061);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test356");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(2, 828, 3708, 2775, 412);
        org.junit.Assert.assertTrue(i5 == 7725);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test357");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(0, 14665, 5825, 2892, 40954);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test358");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(978, 6442, 14665, 2775, 2101);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test359");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(2664, 1745, 15259, 15259, 24839);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test360");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(7251, (int) 'a', 2664, (int) '4', 219);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test361");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(2838, 1126, 827, 826, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test362");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(2101, 6615, 2100, 0, 375);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test363");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(7251, 31549, 43019, 11463, 2238);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test364");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(219, 771, 14710, 17189, 739);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test365");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(2, 241, 7725, 2100, 826);
        org.junit.Assert.assertTrue(i5 == 2);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test366");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(6442, (int) (short) 100, 2827, 111, 241);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test367");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres((int) ' ', 27943, (int) 'a', 375, 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test368");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(1237, 2014, (int) 'a', 2838, 4778);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test369");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um((int) (byte) 1, 6615, (int) (short) 0, 351, 10160);
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test370");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(5825, (-1), 0, 0, 4778);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test371");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(15190, 1958, 111, 0, 7204);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test372");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(3005, 100, 0, (int) '#', 11463);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test373");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(375, 1648, 10, 11818, 265);
        org.junit.Assert.assertTrue(i5 == 14116);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test374");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia((int) (byte) 0, 23581, 1177, 13061, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test375");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(2100, 828, 14665, 0, (int) (byte) 100);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test376");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(7725, 483, (int) (short) 0, 828, 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test377");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance((int) (short) 1, (int) (short) -1, 1356, 364, 40954);
        org.junit.Assert.assertTrue(i5 == 42674);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test378");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(1958, 3708, 219, 2238, 412);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test379");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(10, 7251, 3005, 2975, 1237);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test380");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(412, 10, 483, 2975, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test381");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(0, 1, 2101, 198, 2238);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test382");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(15286, 3379, (int) ' ', 8418, 13393);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test383");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(2758, 6615, 17189, 3005, 2838);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test384");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois((int) '4', 31549, 9105, 5825, 2014);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test385");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(7251, 4366, 15286, (int) 'a', 1177);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test386");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(351, 111, 4366, 5825, 1237);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test387");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(0, 15190, 3379, 15259, 739);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test388");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(2892, 12, 1958, 1177, 7725);
        org.junit.Assert.assertTrue(i5 == 13764);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test389");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo((int) 'a', 0, 1177, 364, 24839);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test390");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(14710, 2101, 1567, (int) (short) -1, 2827);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test391");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par((int) (short) 1, 1126, 2758, 8418, 6442);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test392");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(24798, 111, 42674, 2664, 2974);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test393");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(12, 5825, 24798, 978, 27943);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test394");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(17189, 1, 483, 0, 7251);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test395");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(1957, 14665, 1958, 100, 10160);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test396");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(2975, 7725, (-1), 15286, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test397");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(1648, 23581, 2238, 27943, 1567);
        org.junit.Assert.assertTrue(i5 == 56977);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test398");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(412, 13393, 219, 1745, 1745);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test399");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(0, 1567, 8503, 2892, 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test400");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(7073, 27943, 12057, 219, 11463);
        org.junit.Assert.assertTrue(i5 == 58755);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test401");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(241, 6442, 351, 111, 8418);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test402");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois((int) (byte) 1, 13764, 1648, 1567, 828);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test403");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares((int) (short) 100, 7251, 40954, (int) (byte) 100, 7725);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test404");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(8503, (int) ' ', (int) (byte) 100, 111, (int) (short) 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test405");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(2892, 0, 9105, 12057, 6442);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test406");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(2014, 17189, 0, 1745, 43019);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test407");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia((int) (byte) 1, 40954, 483, (-1), 43019);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test408");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(6615, (int) 'a', 1126, 11463, 43019);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test409");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo((int) 'a', 5825, 13061, 2238, 1957);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test410");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(364, 111, 24839, 2014, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test411");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(40954, 7204, 1958, (-1), 6442);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test412");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(0, 2975, 3708, 2, 3005);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test413");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(0, 111, 412, 1957, 111);
        int i6 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test414");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(364, 10, 826, (int) (short) 10, 3710);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test415");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(5825, 6176, 43019, 100, 5825);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test416");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(1958, 11818, 241, 1958, 6442);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test417");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(1126, 7204, 0, 0, 7251);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test418");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(13061, 11463, 13764, 15286, 2975);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test419");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance((int) 'a', 56977, 12057, 2238, 6176);
        org.junit.Assert.assertTrue(i5 == 77545);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test420");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(77545, 0, 8503, 3708, 27943);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test421");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(0, (int) (byte) 1, (int) (byte) -1, 0, 7251);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test422");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (short) 100, 2827, 100, 1356, 2974);
        int i6 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test423");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(1, 3379, 58755, 375, 100);
        org.junit.Assert.assertTrue(i5 == 62610);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test424");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo((int) (short) 10, 1, 3379, 42674, 2014);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test425");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(11463, 978, 3379, 11463, 2892);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test426");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(11818, 2101, 978, 0, 364);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test427");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par((int) (short) 0, 828, 40954, 43019, 10160);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test428");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(2100, 15286, 265, 2664, 7725);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test429");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(0, 11818, 13393, (int) (short) 0, 11818);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test430");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(6442, 364, 4778, 12, 1957);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test431");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(62610, 24798, 2664, 8503, 375);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test432");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(62610, 77545, (int) (byte) 1, 7725, 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test433");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(7073, (int) (byte) 0, (int) ' ', 412, 4366);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test434");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) '4', (int) (byte) 100, (int) (short) 100, (int) (byte) 10, (int) (byte) 100);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.cinco();
        int i9 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test435");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(2892, 7725, 1567, 978, 826);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test436");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(7204, 2758, 12, 24839, 1177);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test437");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(2, (int) (short) 10, 265, 827, 1957);
        int i6 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test438");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(1958, 7251, 827, 1356, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test439");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(43019, 265, 14665, (int) (short) 1, 7204);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test440");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(24839, 1648, (int) '#', 3379, 2827);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test441");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(771, 15286, 8503, 7251, 2974);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test442");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(739, 5825, 40954, 62610, (int) (short) 100);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test443");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(12, 23581, 1957, 3379, 11818);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test444");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(1958, 1958, 0, 1126, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test445");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia((int) ' ', 100, 2775, 828, 24839);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test446");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(17189, 14710, (int) '#', 11463, 351);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test447");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(1356, 1, (int) (short) 1, 24839, 1);
        org.junit.Assert.assertTrue(i5 == 3);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test448");
        int[] i_array3 = new int[] { 3708, 43019, 7073 };
        try {
            int i4 = com.uepb.tcc.yatzy.Yatzy.yatzy(i_array3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test449");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(4778, 827, (int) (short) -1, 739, 31549);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test450");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(1958, 13061, 77545, (int) (short) 1, 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test451");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia((-1), 1126, (int) (short) 10, 15286, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test452");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(2664, 3005, 2101, 11463, 15286);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test453");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(375, 0, 2, 15190, 15286);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test454");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(0, 111, 375, 2014, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test455");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(2664, 42674, 12, 56977, 7251);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test456");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(2892, 6442, (int) (short) 10, 375, 2100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test457");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(10160, 826, 6615, 15259, 13764);
        org.junit.Assert.assertTrue(i5 == 46624);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test458");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(7204, 1957, 1356, (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test459");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(219, 24798, 739, (int) (short) 100, 2892);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test460");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(14665, (int) (byte) 100, 826, 3005, 10160);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test461");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(42674, 2827, (int) (byte) 100, 2, 827);
        org.junit.Assert.assertTrue(i5 == 46430);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test462");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(7073, 771, 1958, 364, 14116);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test463");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(198, 828, 43019, 111, 2101);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test464");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(3, 10160, 412, 23581, 219);
        org.junit.Assert.assertTrue(i5 == 3);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test465");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo((int) (byte) 0, (-1), 15259, (int) (short) 1, 2827);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test466");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(10160, 1567, 0, 11818, 483);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test467");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(8503, 7204, 1, 24839, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test468");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(739, 1958, (int) (byte) -1, 1648, 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test469");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(0, 43019, 10160, 4778, 375);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test470");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres((int) '4', 24798, 46624, 1126, 100);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test471");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(2838, 15190, 2100, (int) (byte) 10, 2238);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test472");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(8503, 2101, 62610, 375, 27943);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test473");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(2758, 1648, 1648, 0, (int) (byte) 1);
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test474");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (byte) -1, (int) 'a', (int) (short) -1, (int) (short) -1, (int) (short) -1);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.seis();
        int i8 = yatzy5.seis();
        int i9 = yatzy5.quatro();
        int i10 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test475");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(12057, 24798, 5825, 9105, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test476");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(2100, 4778, 1648, 11818, 77545);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test477");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) '#', (int) (byte) 10, (int) (short) 1, (int) (short) 10, 265);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.seis();
        int i8 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test478");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(14665, 13061, 1126, 219, 42674);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test479");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(3708, 2101, 3005, 1, 2892);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test480");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance((int) (byte) -1, 5825, (int) (short) 10, 4366, 13061);
        org.junit.Assert.assertTrue(i5 == 23261);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test481");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(11463, 15286, 7251, 0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test482");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(2775, (int) (short) 0, 1567, 2, 24839);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test483");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(827, 1356, 15286, 6442, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test484");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(241, 483, 2758, 2238, 2838);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test485");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par((int) 'a', 483, (int) ' ', 6615, 62610);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test486");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(364, (int) (byte) 0, 827, 12, 9105);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test487");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(198, 10, 100, 2100, 265);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test488");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(265, (int) (short) -1, 7204, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test489");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(2838, 0, 17189, 0, 1177);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test490");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(14116, 219, 1, 241, 483);
        org.junit.Assert.assertTrue(i5 == 15060);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test491");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(219, (int) (short) 10, 23261, 1356, 739);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test492");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(1958, 9105, 7251, 12, 4778);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test493");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(2827, 1567, 826, 3, 265);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test494");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(739, 1958, 9105, 1, (int) (byte) 1);
        org.junit.Assert.assertTrue(i5 == 11804);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test495");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(12, 826, 6442, 13393, (int) (byte) 1);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test496");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(2827, (-1), 1177, 6442, 17189);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test497");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(23581, 2758, 77545, (-1), 24798);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test498");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(23261, 7073, (int) (short) -1, 42674, 5825);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test499");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(2664, 1567, (int) (short) 100, (int) (short) 100, 7073);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test500");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(2758, 2100, 2664, 0, 1177);
        org.junit.Assert.assertTrue(i5 == 8699);
    }
}

