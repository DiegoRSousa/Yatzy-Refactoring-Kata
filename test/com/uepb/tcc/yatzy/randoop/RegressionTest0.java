package com.uepb.tcc.yatzy.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo((-1), (int) (byte) 1, 0, 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres((int) (short) -1, 0, (int) 'a', (int) (byte) -1, 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um((int) ' ', 10, (int) ' ', (int) (short) 0, 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo((int) (byte) 10, (int) (byte) 1, (int) (byte) 10, (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares((int) (byte) 100, (int) (byte) 0, (int) (byte) 0, (int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance((int) (short) 10, 100, (int) (byte) 1, 0, 0);
        org.junit.Assert.assertTrue(i5 == 111);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois((int) (byte) 10, 0, 10, (int) '4', 111);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(111, (int) (short) 0, (int) (byte) 0, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(10, (int) (byte) -1, 111, (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres((int) (short) 100, 111, (int) ' ', (-1), (int) (byte) -1);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(10, (int) (byte) -1, (int) (short) 0, (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        int[] i_array4 = new int[] { (short) 10, '#', (short) 1, (byte) 100 };
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.yatzy(i_array4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array4);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo((int) (byte) 100, (int) ' ', 100, (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(1, (int) '#', (int) (byte) 1, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(0, (int) '#', 111, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(0, (int) (short) 0, (int) 'a', (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois((int) (short) 1, (int) (byte) 1, 1, (int) (byte) -1, (int) '4');
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia((int) (short) 0, (int) (byte) -1, (int) (byte) 0, (int) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(0, (int) (byte) 1, 111, (int) (short) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(0, (int) (byte) 0, (int) (byte) 1, 10, (int) (short) 1);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par((int) (short) 0, (int) (byte) 0, (int) (short) 0, 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        int[] i_array1 = new int[] { 'a' };
        try {
            int i2 = com.uepb.tcc.yatzy.Yatzy.yatzy(i_array1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array1);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par((int) ' ', (int) '#', 10, (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia((int) (short) 0, (int) (byte) -1, 100, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo((int) '#', (int) '#', (int) (short) 1, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres((int) (short) 10, (int) (short) -1, 0, (-1), (int) '#');
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo((int) ' ', (int) (byte) 100, 111, (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance((int) (byte) -1, 0, 100, (int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertTrue(i5 == 198);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia((int) '4', (int) (byte) 0, 100, 111, 111);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo((int) (short) 0, (int) (short) -1, (int) (short) 1, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(100, (int) (short) 1, 198, (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(100, (int) '#', (int) ' ', 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo((int) (byte) 1, (int) (byte) 0, (int) (byte) 10, 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois((int) (short) 10, (int) (short) 10, 111, (int) ' ', (int) 'a');
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(0, (int) (byte) 10, (int) (short) 1, (int) (byte) 10, 10);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia((int) (byte) 100, (int) (short) 10, (int) (short) 10, (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo((int) (short) 10, (int) (byte) 0, (int) (short) 0, 198, 111);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo((int) ' ', (int) (short) 1, (int) (short) 1, (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia((int) '4', (int) (byte) -1, 198, 111, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo((int) '#', 111, 0, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(100, (int) (short) 10, 1, (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia((int) (byte) 0, 0, (int) (short) 1, (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo((int) (short) 1, 0, (int) 'a', (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres((int) ' ', 111, (int) '4', 100, (int) (byte) 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(111, 0, 0, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um((int) (byte) -1, (int) (short) 10, (int) (short) 0, 1, (-1));
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance((int) '#', (int) ' ', (int) (short) 100, (int) 'a', (int) (byte) 1);
        org.junit.Assert.assertTrue(i5 == 265);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo((int) 'a', 111, 0, (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(1, (int) (short) -1, (int) ' ', 111, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(1, (int) ' ', 0, 1, 100);
        org.junit.Assert.assertTrue(i5 == 2);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo((int) (byte) 100, (int) (short) -1, (int) (short) 100, (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        int[] i_array2 = new int[] { 198, 1 };
        try {
            int i3 = com.uepb.tcc.yatzy.Yatzy.yatzy(i_array2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array2);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(1, (int) '#', (int) (byte) 100, (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois((int) (byte) 0, (int) '4', (int) (byte) 1, 1, (int) (short) 100);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres((int) (short) 10, 1, (int) '#', (int) '4', 265);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(198, 2, (int) (short) 0, 2, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia((int) (byte) 100, 111, (int) (short) 0, (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par((int) (short) -1, (int) (byte) 1, (int) ' ', (int) (byte) -1, 111);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(198, (int) (short) 100, (int) (byte) 10, 265, 198);
        org.junit.Assert.assertTrue(i5 == 771);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance((-1), 10, 0, 2, (int) (short) 1);
        org.junit.Assert.assertTrue(i5 == 12);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares((int) (short) 0, (int) (short) 0, 0, (int) (byte) -1, 198);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(771, (int) (byte) 0, (int) '#', (int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres((int) ' ', (int) (byte) 10, (int) '4', 111, (int) (byte) -1);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo((int) (short) -1, (int) (short) 100, 1, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(0, (int) (byte) 0, (-1), (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(111, (int) '4', 100, (int) (byte) 10, (int) (short) 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(0, 198, (int) (byte) -1, (int) ' ', 12);
        org.junit.Assert.assertTrue(i5 == 241);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia((int) (byte) 100, (int) (byte) 10, (int) (byte) -1, (int) '#', 771);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois((int) ' ', (int) (byte) 100, (-1), 2, 111);
        org.junit.Assert.assertTrue(i5 == 2);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(265, (int) (byte) -1, 2, (int) (short) 1, (int) 'a');
        org.junit.Assert.assertTrue(i5 == 364);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(12, 771, 111, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia((int) (short) 1, 364, 1, 198, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo((int) (byte) -1, (int) (byte) 0, (int) (short) 100, 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(0, (int) '#', (int) (byte) 10, 198, 241);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres((int) (short) 0, (-1), 100, (int) 'a', 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(241, (int) '4', (int) (short) -1, (int) '4', 1);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo((int) (byte) 100, 0, 265, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(0, (int) 'a', (int) (byte) 100, 1, (int) ' ');
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares((int) (short) 1, (int) (short) 100, 12, (int) '4', 111);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia((int) 'a', 364, 12, (int) '4', 12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois((-1), (int) (short) 10, 111, (int) (byte) 10, 2);
        org.junit.Assert.assertTrue(i5 == 2);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia((int) (byte) 10, 0, 771, (int) (short) 0, 364);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(10, (int) 'a', (int) (short) 0, (int) (byte) 100, 771);
        org.junit.Assert.assertTrue(i5 == 978);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(0, 100, 2, 265, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(198, (int) (short) -1, (-1), 1, (int) (byte) 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares((int) (short) -1, 0, (int) (short) 100, (-1), 111);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo((int) (byte) -1, (int) 'a', (int) (short) 10, 10, 111);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(10, (int) '#', 10, (int) (short) 1, 771);
        org.junit.Assert.assertTrue(i5 == 827);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par((int) (byte) 10, 12, 0, 198, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(771, 2, (int) (byte) 0, (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(1, (int) (byte) 0, 771, 978, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(0, 0, (int) '#', (int) (short) 0, 241);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(10, 364, 265, (int) '#', 198);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo((int) '4', (int) (byte) -1, 2, 2, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres((int) (byte) -1, 2, 0, (int) (short) 100, (-1));
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(111, (int) (byte) 10, 771, 364, (int) (short) 100);
        org.junit.Assert.assertTrue(i5 == 1356);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia((int) (byte) 0, (int) (byte) -1, 0, (int) (byte) 10, 364);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo((int) '#', (int) (byte) 1, 978, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres((int) (short) 100, 265, 265, (int) (short) 100, 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia((int) (byte) 1, (-1), (int) '4', 0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres((int) (short) 10, (int) ' ', (int) (short) 100, 978, (int) (byte) -1);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia((int) '4', 0, (-1), (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia((int) (byte) -1, 1, (int) (byte) -1, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia((int) (byte) 10, (-1), 198, (int) (short) 100, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(0, (int) (short) -1, 0, (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par((int) (short) 1, (int) (short) -1, 978, 771, 827);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(2, 978, 12, 10, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(1, (int) (short) 100, 111, 10, (int) (byte) 100);
        int i6 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(771, (int) '#', 241, (int) (short) 10, 771);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo((int) '4', (int) 'a', (-1), (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        int[] i_array6 = new int[] { '#', 198, 1, 1356, 111, 198 };
        try {
            int i7 = com.uepb.tcc.yatzy.Yatzy.yatzy(i_array6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array6);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia((int) '#', 111, (int) (short) 100, 265, 827);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares((int) (byte) 1, 100, (int) (byte) 1, 265, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres((int) (byte) 100, (int) (short) 100, (int) (short) 1, 100, (int) '#');
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) 'a', (int) (short) -1, (int) (byte) 10, (int) '4', (int) '#');
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(827, 978, (int) (byte) 10, (int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance((-1), (int) (short) -1, 12, (int) (byte) 1, 364);
        org.junit.Assert.assertTrue(i5 == 375);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(2, 827, 111, 0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(100, (int) (byte) 10, (int) 'a', 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par((int) (short) -1, (int) '4', (int) (short) 1, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(12, 111, (int) '4', (int) (short) 100, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(2, 771, 1, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(0, 241, (int) 'a', 10, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(827, 2, 375, 0, 198);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares((int) (byte) -1, 111, 0, 364, 978);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia((int) (byte) 10, 265, 1356, (int) (byte) 100, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(10, (int) (byte) 10, 241, 1356, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(0, (int) '#', 2, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(0, (int) (short) 1, (int) (byte) -1, (int) (byte) 1, (int) '4');
        org.junit.Assert.assertTrue(i5 == 2);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(10, 12, (int) (short) -1, 198, 0);
        org.junit.Assert.assertTrue(i5 == 219);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(827, (-1), (int) (short) 0, 2, (int) (byte) 0);
        org.junit.Assert.assertTrue(i5 == 828);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo((int) (byte) 10, 1356, (int) '#', 241, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance((int) ' ', 111, 827, 10, 978);
        org.junit.Assert.assertTrue(i5 == 1958);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(978, (int) (byte) 1, 978, (int) (short) 0, 771);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(771, (int) '#', (int) (short) 1, 1958, (int) (short) 10);
        org.junit.Assert.assertTrue(i5 == 2775);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres((int) (byte) 1, (int) (byte) 0, (-1), 10, (int) '4');
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(1356, (int) (byte) 100, (int) ' ', (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia((int) (short) 10, 219, 771, (int) '4', 364);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(375, (int) (short) 10, 828, (int) 'a', 12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(1958, (int) '4', (int) (byte) 10, 100, (int) (byte) 100);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(1958, (int) (byte) -1, (int) (byte) 10, 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(100, 0, 1, 219, 364);
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(0, (int) (short) 1, 241, 241, 827);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares((int) ' ', 1356, 364, 364, 771);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(375, 0, (int) '#', 828, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(0, (int) (byte) 10, 100, (int) '#', 1356);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(0, (int) ' ', 241, 219, 375);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo((int) (short) 10, 100, 241, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres((int) (byte) 0, 219, (int) (short) 100, (int) (byte) 100, (int) '4');
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(1, 100, (int) '4', 2, 978);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia((int) (short) 100, 12, 0, (int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(265, 828, 364, (int) (byte) -1, 1356);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(364, 0, (int) (byte) 1, (int) (short) -1, 375);
        org.junit.Assert.assertTrue(i5 == 739);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(219, 2, 198, 10, (int) (short) -1);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(1356, (int) (byte) -1, 0, 1958, (int) (short) 1);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(364, (int) (byte) 10, 2775, 364, 828);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        int[] i_array4 = new int[] { (-1), 'a', 219, (byte) 0 };
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.yatzy(i_array4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array4);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(219, (int) '#', 265, (int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia((int) '4', 241, 100, 739, 198);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(219, 827, (int) (short) -1, (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia((int) (byte) -1, 241, (int) (byte) 10, 10, 198);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(827, (int) (byte) 100, 828, 0, 978);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(771, 219, 0, (int) (short) 10, 241);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(978, (int) (byte) -1, 2, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um((int) '#', 100, 1958, 827, (int) (short) -1);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(978, 12, 219, 198, 241);
        org.junit.Assert.assertTrue(i5 == 1648);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia((int) (byte) 100, 0, 2775, 111, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia((int) ' ', 198, 265, 2, 827);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(828, 1, 771, (int) '4', 1958);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo((int) 'a', 10, 2, 364, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres((int) (byte) 0, 241, (int) (byte) 0, (int) (short) 10, 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo((int) (byte) -1, 771, (int) (byte) 0, (int) (byte) 0, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois((int) (short) 100, 265, 0, (int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(1958, 100, 1356, (int) '4', 364);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(827, (int) '#', 771, (int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(100, 241, 739, (int) 'a', 0);
        org.junit.Assert.assertTrue(i5 == 1177);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(111, 1356, 111, (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois((int) (short) -1, 828, 12, 978, 241);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(364, (int) (byte) 100, 827, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares((-1), (int) '#', (int) ' ', 265, 219);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(1958, (int) (short) 0, 978, 771, 1);
        org.junit.Assert.assertTrue(i5 == 3708);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo((int) '#', 198, 219, 1648, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo((int) (byte) 1, 2, 1356, 2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(198, (int) '#', 1, (int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue(i5 == 2);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo((int) (short) 1, 375, (int) (byte) 1, 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(1356, 2, 978, 12, 364);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(739, 12, 739, (int) (byte) -1, 375);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo((int) '4', 978, 1648, 2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um((int) 'a', 1648, 219, (int) (short) 10, 12);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(1356, 978, 771, (int) ' ', 1177);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par((int) (byte) 1, (int) (byte) 1, 0, 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia((int) '4', 1, 198, 2, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia((int) '#', 100, (int) (byte) -1, 219, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(828, (-1), 0, (int) (short) 0, (-1));
        org.junit.Assert.assertTrue(i5 == 826);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(771, (int) (byte) 10, 10, 978, (int) (short) 1);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(0, 1958, 10, (int) ' ', 827);
        org.junit.Assert.assertTrue(i5 == 2827);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares((int) (byte) 100, (int) (short) -1, 2827, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(12, (int) (short) 0, (int) (byte) 100, 364, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(375, 364, 0, 3708, 10);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(375, (int) '4', 10, 10, (int) (short) 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres((int) (short) 100, (int) (short) 100, 739, (int) (byte) 0, (int) (short) 10);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(100, (int) 'a', 241, (int) (byte) 1, 364);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(1, 826, (int) (short) 1, 3708, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance((int) '#', (int) (short) 10, 1648, (int) '4', 0);
        org.junit.Assert.assertTrue(i5 == 1745);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(1648, 978, 1648, 3708, 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(1356, (int) '4', 1745, 0, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(826, (int) (byte) 1, 100, 0, 1648);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(375, (int) (byte) 100, (int) (short) 0, 0, 739);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(375, (int) (short) 1, (int) '4', 3708, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares((int) 'a', 241, 10, 1648, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(1648, (int) '#', 0, 978, 828);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(771, 111, (int) (short) 0, 12, 771);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(375, (int) (short) 0, (int) '4', 219, 364);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(265, 241, 1177, 827, 3708);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(12, 12, 0, 771, 1648);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(219, (int) (byte) 100, (-1), (int) (short) 100, 1177);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(739, 826, 771, (int) '#', 241);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois((int) '#', (int) (byte) 0, 219, 111, 1648);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(827, (int) (short) 10, 1958, 3708, 375);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(0, (int) '#', 219, (int) (byte) 100, (int) '4');
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(12, 12, (int) ' ', (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(2827, 198, (int) (byte) 100, 198, 1745);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(100, (int) 'a', (int) (short) 1, 100, 828);
        org.junit.Assert.assertTrue(i5 == 1126);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(10, (int) (byte) 0, 0, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um((int) (short) 100, 771, 1126, 241, 364);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(0, 219, (int) '4', 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia((int) (short) 10, 1126, 1356, (int) (short) 100, 219);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois((int) (byte) -1, 1745, 1356, 771, 10);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares((int) (byte) 0, 1177, 10, 1, 771);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(0, 3708, (int) (short) 0, 111, 2827);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(826, 198, 375, 265, 1);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) '4', (int) (byte) 100, (int) (short) 100, (int) (byte) 10, (int) (byte) 100);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(364, (int) (byte) 10, 2775, 2775, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(1126, (int) (short) 100, 2775, (int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(0, (int) (byte) 10, 241, (int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue(i5 == 351);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(826, 3708, (int) '#', 1, 1126);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(0, 351, 1126, 739, 241);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(351, 0, (int) (short) -1, 771, 3708);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(351, 0, 0, 1648, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(2775, (int) (byte) 100, 0, (int) (short) 100, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(0, (int) (short) 1, (int) (short) 100, 1648, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia((int) '4', (int) (byte) 100, 100, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(739, (int) (short) -1, 241, (int) (byte) -1, 351);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(351, 739, 0, 1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(0, 0, 265, 826, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance((int) (byte) 0, 1745, 219, 978, (int) ' ');
        org.junit.Assert.assertTrue(i5 == 2974);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(111, 0, 1648, 265, 1648);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(3708, 10, 241, 2775, 241);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par((int) (byte) -1, 1745, (int) (byte) 1, (int) (byte) 0, 1177);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um((int) '#', 771, 364, 2, (int) (short) 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) '4', (int) (byte) 100, (int) (short) 100, (int) (byte) 10, (int) (byte) 100);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.quatro();
        int i8 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(0, 827, (int) (byte) -1, 2827, 828);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(241, (int) ' ', 828, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance((int) (short) -1, 351, 1648, (int) (byte) -1, 241);
        org.junit.Assert.assertTrue(i5 == 2238);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(739, 1, 10, 265, 10);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(3708, 1356, 241, 198, 828);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(1648, 3708, 0, 1745, 978);
        int i6 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(2827, 10, (int) '4', (int) 'a', 265);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia((int) ' ', 2, 2827, 111, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(0, (int) (short) 10, 241, (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois((int) (short) -1, 10, 0, 1648, 1648);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(2, 1745, 1958, 1, 1126);
        org.junit.Assert.assertTrue(i5 == 2);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(351, (int) (byte) 10, (int) '4', 0, (-1));
        org.junit.Assert.assertTrue(i5 == 412);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo((int) (byte) 1, (int) (short) 100, (int) (short) 1, 2775, 351);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(265, 0, (int) (byte) 10, 1356, 1356);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(10, 1, 375, 241, 978);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(1356, (int) (short) 100, 0, 739, 827);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo((int) (byte) 1, 219, 100, 1958, 1177);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(1177, 3708, 827, 364, 1958);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (short) -1, (int) (short) 0, 12, (int) (byte) -1, 265);
        int i6 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(739, (int) (short) -1, (int) (byte) 1, 771, 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(1745, 3708, 739, 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par((int) '#', 978, (int) (byte) 1, 0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(0, (int) ' ', (int) (byte) 10, 265, (int) (byte) 10);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(0, (int) (byte) 10, (int) (byte) -1, 0, (int) (byte) 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance((int) (short) 0, (int) (short) 10, 1177, (int) (byte) 1, 826);
        org.junit.Assert.assertTrue(i5 == 2014);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(265, (int) (byte) 1, (int) (byte) 1, 351, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois((int) (short) 100, 2238, 0, (int) (byte) 100, (int) 'a');
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(198, 1958, (int) 'a', (int) ' ', 1958);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(2974, (int) (byte) 1, 0, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um((int) (short) 100, 364, 10, 1745, 826);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(1177, 2974, 2, (-1), 771);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo((int) '4', 364, 2974, 265, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(978, 827, 1126, 351, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(1648, (int) 'a', 265, 375, 364);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance((int) (byte) 100, 351, (int) (short) 100, (int) (short) 1, 2827);
        org.junit.Assert.assertTrue(i5 == 3379);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois((int) (byte) 10, (int) 'a', (int) (short) 100, 739, 2014);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois((int) (byte) 1, 0, (int) (short) 1, 351, 826);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(771, (int) (short) 100, 1126, (int) '#', 826);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(0, 3708, 12, (-1), (int) (short) 1);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(2775, 2775, 827, 739, 265);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(1356, 739, 111, 375, 1177);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(2827, 351, 0, (int) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(2, (int) '#', 1, 375, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(1177, (int) (short) 1, 1648, 375, 1745);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo((int) ' ', (int) (byte) 0, 364, 2827, 1126);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(0, 0, 111, 10, 771);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres((int) (short) 0, (int) 'a', (int) (byte) 0, (int) (byte) 10, 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres((int) (short) 0, (int) '4', 2238, 0, 2974);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(826, 739, 3708, 2238, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois((int) (byte) 1, 0, 739, 3708, 2014);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(828, 0, 364, 0, 375);
        org.junit.Assert.assertTrue(i5 == 1567);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(1958, 10, 3379, 1648, 2238);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo((int) (short) -1, 265, 198, 351, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(828, 111, (int) (short) 1, 375, 828);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres((int) '#', 1567, 375, 0, (int) '4');
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(0, 364, (int) 'a', (int) (short) 10, 10);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(826, (-1), 412, 198, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(771, 2827, 1356, (int) (short) 10, 375);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(826, 375, 375, (int) '4', 3379);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um((int) ' ', 265, 2827, 375, (int) (byte) 10);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(0, 10, 1, (int) (short) 0, 2827);
        org.junit.Assert.assertTrue(i5 == 2838);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um((-1), 241, 351, 1356, 2838);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois((int) '4', 2, (int) (byte) 100, 265, (int) (byte) 100);
        org.junit.Assert.assertTrue(i5 == 2);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(826, (int) (byte) -1, (int) (short) 10, 3708, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia((int) (byte) 1, (int) (short) 0, (int) (byte) -1, 265, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres((int) (byte) 100, 241, 1745, 198, (int) (short) 1);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(364, (int) (short) 1, (int) ' ', 375, 351);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(1648, 111, (int) (short) -1, (int) 'a', (int) (short) 1);
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        int[] i_array5 = new int[] { (byte) 1, (byte) 100, 'a', 739, 3379 };
        try {
            int i6 = com.uepb.tcc.yatzy.Yatzy.yatzy(i_array5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array5);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um((int) 'a', 2775, 2014, 1177, (int) (short) 1);
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(375, (int) '4', 2838, (int) (short) 0, 364);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois((int) (short) 0, 1745, 1745, 0, 827);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(2974, 241, 2, 1567, 2014);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(351, 2014, 2838, 375, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(1126, (int) (byte) 0, 412, 412, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(2838, 3708, 1126, 3379, 412);
        org.junit.Assert.assertTrue(i5 == 11463);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(12, 1567, (int) (short) 1, 1126, (int) '4');
        org.junit.Assert.assertTrue(i5 == 2758);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(2, 10, 2775, 0, 3708);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(771, 375, 771, (int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(826, 1126, 1126, (int) (short) 10, 351);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance((int) (short) 0, 1126, (-1), 111, (int) (byte) 1);
        org.junit.Assert.assertTrue(i5 == 1237);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(1648, 1177, (int) 'a', 2, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(241, 11463, 1, 11463, 739);
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia((int) (byte) -1, 1, 10, 826, 351);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(2014, 827, 1126, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(2, 2838, 0, 3379, 1126);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(375, (int) (byte) -1, 1958, (int) (byte) -1, 2758);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(111, 364, 1958, 1356, 1567);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (byte) 0, (int) '#', (int) (short) 10, (int) (byte) 1, (int) (short) 100);
        int i6 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(2238, 2827, 11463, 11463, 2);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(1, 3379, 0, (int) (byte) 1, 2014);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(1126, 351, (int) (byte) 0, (int) (short) 10, 1177);
        org.junit.Assert.assertTrue(i5 == 2664);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(2, (int) (short) -1, 827, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(100, (int) (byte) -1, 1567, (int) (byte) 100, 1126);
        org.junit.Assert.assertTrue(i5 == 2892);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(1745, 2758, 2238, 2238, 351);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(265, 2827, 3708, 100, 351);
        org.junit.Assert.assertTrue(i5 == 7251);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(7251, 12, 2014, (int) 'a', 241);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(978, (int) (short) 10, 1356, 265, 375);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(219, 1745, 219, 2758, 739);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(2892, 771, 12, 978, 3708);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(351, 1356, (-1), 2892, 265);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres((int) '#', 10, 1126, 1, (int) (byte) 10);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(978, 1356, 2, 10, 1648);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia((int) (byte) 100, 826, 3708, 1356, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(219, 10, 111, 7251, 827);
        org.junit.Assert.assertTrue(i5 == 8418);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(828, 10, 739, 771, 7251);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(241, 1, 7251, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(1567, 1356, 0, (int) '4', 3379);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(3708, 2827, 198, 241, 7251);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(1745, (int) (byte) 0, 2664, 219, 241);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(8418, 1745, (int) (short) 100, 2892, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(1, 2238, (int) 'a', 0, (int) (short) 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(111, 3708, (int) (short) 10, 739, 111);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(351, 0, 364, 3379, 265);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(351, 1567, 2758, 375, 1126);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia((int) (short) 100, (int) (short) -1, 0, 771, 2892);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(2758, 12, (int) (byte) 10, (-1), 1356);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(412, 2838, 1567, 1, 412);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(11463, 826, 2827, (int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(2827, 1237, (int) (byte) -1, (int) (byte) 0, (int) (short) 0);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(219, 1648, 12, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(1126, 978, 8418, 1177, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia((int) (short) 0, 2775, (int) (short) 10, 12, 1126);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares((int) (byte) 0, 2238, 826, 111, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(10, 8418, (int) (short) 10, 8418, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance((int) (byte) 10, (int) 'a', 0, 2775, 828);
        org.junit.Assert.assertTrue(i5 == 3710);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(375, 0, (int) (byte) 1, 2758, 1);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(11463, (int) (byte) 0, 828, 2664, (-1));
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (byte) -1, 2827, 1745, (int) (short) 10, (int) ' ');
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(2775, (int) (short) 100, 100, 1237, 3379);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (short) 10, 1237, 771, 0, 0);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(111, 351, (int) '#', 3379, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par((int) (short) -1, (int) (short) 100, (int) (short) 0, 1, 3708);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(1, 2664, 1237, 100, (-1));
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(100, 978, (int) (short) 100, (int) (byte) 1, 2664);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance((int) (short) 10, (int) (short) 10, (int) (byte) 100, (-1), 364);
        org.junit.Assert.assertTrue(i5 == 483);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(483, 2838, 978, 2238, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(364, 8418, 219, 2664, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um((int) (byte) 1, 1, 2775, 351, (int) '#');
        org.junit.Assert.assertTrue(i5 == 2);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia((int) (short) -1, 364, 2892, 1, 1356);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(351, 2892, 111, 1126, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(2892, 2238, 8418, 0, 1745);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(2758, 12, 0, 1356, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(978, 8418, 1, 771, 7251);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(2892, 2014, 375, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(3379, (int) (short) -1, 3710, (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(1567, 0, 219, 241, 2827);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(2014, 241, (int) (short) 1, (int) (byte) 1, 2827);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(412, 483, 828, 1356, 826);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(771, (int) 'a', 412, 483, 828);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(10, 2892, 2, (int) (byte) 1, (int) 'a');
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(2238, 827, 771, 7251, 2775);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres((int) (short) 100, (int) 'a', 739, 0, (int) '4');
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo((int) (short) 100, 1177, 0, (int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(0, (int) ' ', 1567, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois((int) '4', 0, 219, (-1), 265);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(12, 241, (int) (byte) 100, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(1356, 198, 827, 739, 241);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(1958, 3710, (int) (byte) 100, 364, 483);
        org.junit.Assert.assertTrue(i5 == 6615);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(1745, 111, 364, 2775, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(2974, 0, 198, 3710, 2892);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(2014, (int) 'a', 0, 1126, 3379);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) '4', (int) (byte) 100, (int) (short) 100, (int) (byte) 10, (int) (byte) 100);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(198, 1567, 6615, (int) (short) 10, 739);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia((int) '4', 198, 1745, 2892, 6615);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(2238, 2238, 1237, 2238, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(7251, 0, 2664, 739, 1177);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(0, 2238, 1958, (int) (byte) 10, 2838);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(828, 2664, (int) (byte) 1, (int) (byte) 10, 1648);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(100, 2, (int) (short) 100, 827, 11463);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance((int) (short) 0, 1, 978, 978, 0);
        org.junit.Assert.assertTrue(i5 == 1957);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(412, (int) '#', 111, (int) ' ', 2758);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(739, (int) '4', 0, 483, 826);
        org.junit.Assert.assertTrue(i5 == 2100);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(2974, 0, 375, (int) (short) 100, 828);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(1, 198, 0, 1745, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(1126, (int) '#', 198, (int) (byte) 100, 111);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(12, 826, 483, 739, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia((int) '#', 7251, 375, 826, 2100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(1237, 1237, 2892, 7251, 826);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(198, 2892, 2, 483, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(828, (int) (byte) 1, 8418, (int) (short) 1, 1356);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(2014, 1, (int) (byte) -1, 3710, 111);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(0, 412, 265, (int) (short) 100, 6615);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(1745, (int) '4', 1177, (int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertTrue(i5 == 2975);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(828, 100, 2758, (int) (byte) 0, 3710);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(412, 0, 1957, 2892, 1567);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia((int) (short) 100, 2664, 1237, 12, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(978, 3708, 2838, 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(2, (int) '4', 0, (int) (short) 100, 1648);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(2827, 3710, 1745, 771, 978);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(2775, 2892, 8418, (-1), 827);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(3710, (int) '4', 2, 978, 1237);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(198, (int) '#', (int) (byte) 100, (int) (short) 10, 828);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(2775, 2, 412, 739, 826);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(2, (-1), 364, 2974, 771);
        org.junit.Assert.assertTrue(i5 == 2);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(219, 828, 6615, 6615, 2758);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(2100, 2014, 2838, 2014, 2014);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(8418, 2238, 219, 0, 265);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(826, (int) (short) -1, 1177, 3710, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(827, 1356, 8418, 2775, 2838);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(739, 0, (int) (short) 0, (int) '4', 826);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(1237, 12, (int) (byte) 10, 1957, 483);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo((int) '4', 1648, (int) '#', 828, 828);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(0, 2014, 12, 771, 2827);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia((int) (short) 100, 1958, (int) (byte) -1, 978, 3708);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(1, 364, 828, (int) 'a', 351);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(827, 2827, 1648, 3708, 2975);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(0, (int) (short) 1, 739, (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(2238, 2758, 241, (int) (byte) 100, 978);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(483, 2892, 771, 1567, 828);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(978, (int) (byte) 10, (int) (short) 100, 11463, 2975);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia((int) '#', 2758, 100, (int) (short) 1, 2775);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(1648, 7251, 978, 828, 1745);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(1957, 6615, 1177, (int) '4', 1567);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(827, (int) (byte) 0, 12, (int) (short) 0, 2100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois((int) 'a', 412, 2758, 1567, 1648);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(2664, 12, 0, 2, 2100);
        org.junit.Assert.assertTrue(i5 == 4778);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par((-1), 0, 1745, (int) '#', 3379);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(2892, (int) (byte) -1, 198, 2827, 2974);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(2827, (int) (byte) 100, 2014, 4778, 2100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares((int) (short) 0, 0, 2975, 375, 3708);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(3710, 1957, 12, (int) (short) 10, 412);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(2975, 827, 739, 10, 265);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(739, (int) (short) -1, 364, 1126, 12);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        int[] i_array0 = null;
        try {
            int i1 = com.uepb.tcc.yatzy.Yatzy.yatzy(i_array0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(2974, 3708, 2827, 111, 4778);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(375, 2664, 4778, (int) ' ', 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(2, 1126, 827, 1126, (int) '#');
        org.junit.Assert.assertTrue(i5 == 2);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres((int) (byte) 0, 12, 100, 219, 198);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(483, 3710, (int) (short) 1, 2892, 11463);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance((int) (short) 0, 351, (int) ' ', 1745, 2238);
        org.junit.Assert.assertTrue(i5 == 4366);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(219, 1126, 3710, 0, 1177);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(0, 0, 2838, 375, (int) (short) 1);
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(265, (int) (byte) 0, 7251, (int) (byte) 1, 2100);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(265, 483, (-1), 198, 241);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(100, 2, (int) '4', (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(11463, (int) (byte) 100, (int) ' ', 198, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(2827, 739, 12, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(1, (int) (short) 100, 111, 10, (int) (byte) 100);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia((-1), 827, 3708, (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(2827, (int) (short) 0, 1177, 1745, 1567);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(1356, (int) '4', 219, 1745, 8418);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(10, 0, 0, 2838, (int) (byte) -1);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(111, 2892, 1237, 2664, 2664);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par((int) '4', 2238, 2974, 1177, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois((int) (short) -1, 12, 1567, 2974, 2892);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(412, 265, 1567, 771, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(828, 2, 3379, 1957, 10);
        org.junit.Assert.assertTrue(i5 == 6176);
    }
}

