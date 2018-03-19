package com.uepb.tcc.yatzy.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test001");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(1356, 24798, 3005, 236299, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test002");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(175004, 32771, 15259, 15286, 42674);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test003");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(0, 9902, 0, 14116, 1648);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test004");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(114842, (int) (short) 1, 2238, 491588, 4007);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test005");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(12, 423337, 241570, 24697, 77545);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test006");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (short) 10, 198, (int) 'a', 10, (int) (short) 10);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.quatro();
        int i9 = yatzy5.seis();
        int i10 = yatzy5.cinco();
        int i11 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test007");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(71567, 17294, 2975, 0, 364);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test008");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(27943, 42674, 105799, 4007, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test009");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(27943, 2775, 105799, 46003, 24839);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test010");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(58755, 2758, 176396, 17294, 1957);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test011");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(2758, 23261, 1957, 6176, 198);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test012");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance((int) (byte) 100, 1237, 35248, 10666, 1648);
        org.junit.Assert.assertTrue(i5 == 48899);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test013");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(52607, (int) '#', 36050, 29121, 40954);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test014");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(3710, 45400, 8244, 58755, 6442);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test015");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) 'a', 0, 0, (int) (byte) 1, (int) (short) -1);
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
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test016");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(115765, 10394, 22640, 195986, 524841);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test017");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(36359, 1957, (int) (byte) 100, 17294, 375);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test018");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(77545, 771, 236299, 524841, 11463);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test019");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(978, 46624, 24697, 13450, 15190);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test020");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(0, (int) ' ', 4366, 423337, (int) 'a');
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test021");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(13764, 45400, 34754, 56977, 14710);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test022");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(40954, 3379, (int) (byte) 100, 114842, (int) (short) 10);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test023");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(23261, 171569, 11804, 77545, 1958);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test024");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(408760, 0, 11804, 771, (int) '4');
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test025");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(1958, 1177, 3005, 1094113, 2238);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test026");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(215081, 10, 265, 52607, 8244);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test027");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(265, 2827, 1356, 1567, 6615);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.quatro();
        int i8 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test028");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(10666, 15060, 483, 396848, 2974);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test029");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo((int) (short) 10, 0, 219, 215081, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test030");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia((-1), 13450, 1126, 1126, 171569);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test031");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(121602, 157116, 6442, 663297, 100);
        org.junit.Assert.assertTrue(i5 == 948557);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test032");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(32771, 1957, 24839, 2974, 2238);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test033");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(398922, 109, (int) '#', (int) '#', 2827);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test034");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um((int) '#', 23581, 157116, 1177, 7204);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test035");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) '#', (int) (byte) 10, (int) (short) 1, (int) (short) 10, 265);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.seis();
        int i8 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test036");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(2014, 13061, (int) (byte) 0, (int) ' ', 7725);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test037");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(15259, 27943, 169608, (int) ' ', 55428);
        int i6 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test038");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(3710, 14710, (int) (short) 10, (int) '4', 3005);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test039");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(0, 2975, 8418, 45400, 62610);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test040");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(7073, 36359, 46624, 175004, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test041");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia((int) ' ', 4366, 93739, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test042");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(2775, 3708, 36359, 2101, 241);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test043");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(15286, 7251, 6442, 2775, 2);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test044");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(14665, 13764, 491588, 0, 171569);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test045");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(1957, 1745, 978, 663297, 5825);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test046");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(386511, 15190, 241, 32771, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test047");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(483, 15060, 826, 48899, (int) (byte) 1);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test048");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(46003, 15190, 2100, (int) (byte) -1, 100);
        org.junit.Assert.assertTrue(i5 == 63392);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test049");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(101423, 109, 948557, 52607, 11818);
        org.junit.Assert.assertTrue(i5 == 1114514);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test050");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) '4', (int) (byte) 100, (int) (short) 100, (int) (byte) 10, (int) (byte) 100);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.quatro();
        int i9 = yatzy5.cinco();
        int i10 = yatzy5.quatro();
        int i11 = yatzy5.seis();
        int i12 = yatzy5.cinco();
        int i13 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test051");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(2775, 828, 219, 2, 2664);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.seis();
        int i8 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test052");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(45400, 14710, 101403, 0, 8244);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test053");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(6176, 100, 6442, 40413, 15259);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test054");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(14116, 2892, 23261, 29121, 23261);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test055");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(198, (int) 'a', 8418, 51898, 93739);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test056");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(32771, 39011, 1094113, 275072, 39011);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test057");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(26198, (int) (short) 10, 23581, 7073, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test058");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(23261, 63392, 351, 27943, 4778);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test059");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(2775, 524841, 105324, 0, 24798);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test060");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(6442, (int) (byte) 1, 0, 0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test061");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(80166, 10666, 3710, 2664, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test062");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(398922, 2974, 412, 0, 121602);
        org.junit.Assert.assertTrue(i5 == 523910);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test063");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(667722, (-1), 177426, 10666, 108318);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test064");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia((int) (byte) 10, 34754, 8244, 51898, 364);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test065");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres((int) (short) 100, 48899, 2775, 26198, 1745);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test066");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(827, (int) (short) -1, 826, 13764, 948557);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test067");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(108318, 3, 6176, (-1), 4007);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test068");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(9105, 21544, 1356, (int) (byte) 0, 25022);
        int i6 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test069");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(3379, 7073, 17294, 108318, 739);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test070");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(21544, 2664, 2892, 13061, 13393);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test071");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(3379, 4778, 36050, 43019, 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test072");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(5825, 523910, 23581, 7204, 1648);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test073");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia((int) (byte) 1, 105324, 105324, 15060, 1114514);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test074");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) '4', (int) (byte) 100, (int) (short) 100, (int) (byte) 10, (int) (byte) 100);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.seis();
        int i8 = yatzy5.cinco();
        int i9 = yatzy5.seis();
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
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test075");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(1177, 55428, 121602, 0, 351);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test076");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(9105, 46430, (int) '#', 46430, 2101);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test077");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(40954, 0, 46430, 46624, 828);
        int i6 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test078");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(36050, 195986, 1567, 1094113, (-1));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test079");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(46003, 43019, 206520, 26198, 657535);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test080");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(1163586, 40954, 396848, 42674, 13764);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test081");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(1356, 24798, 24798, (int) (short) 100, 175004);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test082");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(115765, 663297, 14710, 34922, 2238);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test083");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(40413, 2838, 31549, 1356, 1094113);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test084");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(34922, 101423, 1094113, 8244, 93739);
        org.junit.Assert.assertTrue(i5 == 1332441);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test085");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(43019, 15286, 171569, 219, 1177);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test086");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(1745, 7725, 26198, 176396, 13764);
        org.junit.Assert.assertTrue(i5 == 225828);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test087");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(739, 1177, 31549, 663297, 77545);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test088");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(9902, 826, 114842, 36359, 1094113);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test089");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(236299, 275072, 827, 23261, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test090");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(2974, 2838, (int) (byte) 10, 826, 14665);
        int i6 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test091");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(1163586, 239859, 48899, 9105, 198);
        org.junit.Assert.assertTrue(i5 == 1461647);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test092");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia((int) (byte) -1, 15259, 23581, 0, 4366);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test093");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(1461647, 7725, 828, 3005, 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test094");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(5825, 978, 483, 17294, 1094113);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test095");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(101423, 2892, 408760, (int) (byte) 0, 63392);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test096");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(169608, (int) (byte) 1, 14116, 111, 7251);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test097");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(13764, 93739, (int) 'a', 0, 22640);
        org.junit.Assert.assertTrue(i5 == 130240);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test098");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(0, 175004, 2014, 14665, 3005);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test099");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(11818, 1114514, 195986, 206520, 11804);
        org.junit.Assert.assertTrue(i5 == 1540642);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test100");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(1114514, 0, 0, 111, 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test101");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(1094113, 115765, 10394, 1094113, 219);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test102");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(31549, 351, 31385, 80166, (int) '#');
        int i6 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test103");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(7204, 265, (int) '4', 351, 398922);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test104");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(10, 2974, (int) (short) 1, 826, 239859);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test105");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(826, 8503, 826, 15060, 57349);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test106");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par((int) '4', 236299, 77545, 14665, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test107");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres((int) '#', (int) (short) 10, 42674, 24839, 2101);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test108");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(1, 100, 171569, 15259, (int) (short) 100);
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test109");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(241, 14116, 13764, 34754, 2975);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test110");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(1461647, 6442, 15190, 615823, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test111");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(0, 8418, 36050, (int) '4', 8503);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test112");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(157116, 14665, 827, 101403, 17189);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test113");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(771, (int) '4', 8503, 42674, 663297);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test114");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(23261, 2892, 34922, 8244, 58755);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test115");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia((-1), 0, (int) '#', (int) (byte) -1, 169608);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test116");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(616395, 4778, (int) '4', 0, 31549);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test117");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) '#', (int) (byte) 10, (int) (short) 1, (int) (short) 10, 265);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.seis();
        int i8 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test118");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(80166, 176396, 1356, 15190, 0);
        int i6 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test119");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(17294, 26198, 0, 48899, 4366);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test120");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(1094113, 171569, 948557, 101423, 130240);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test121");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(351, 12057, 130240, 13061, 169608);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test122");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(31385, 51898, 23581, 10, 13764);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test123");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(77545, 7073, 49691, 105324, 10394);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test124");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(22640, 1094113, 4778, 13764, 206520);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test125");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(398922, 219, 6615, 423337, 0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test126");
        int[] i_array0 = new int[] {};
        int i1 = com.uepb.tcc.yatzy.Yatzy.yatzy(i_array0);
        int i2 = com.uepb.tcc.yatzy.Yatzy.yatzy(i_array0);
        int i3 = com.uepb.tcc.yatzy.Yatzy.yatzy(i_array0);
        int i4 = com.uepb.tcc.yatzy.Yatzy.yatzy(i_array0);
        int i5 = com.uepb.tcc.yatzy.Yatzy.yatzy(i_array0);
        int i6 = com.uepb.tcc.yatzy.Yatzy.yatzy(i_array0);
        int i7 = com.uepb.tcc.yatzy.Yatzy.yatzy(i_array0);
        int i8 = com.uepb.tcc.yatzy.Yatzy.yatzy(i_array0);
        org.junit.Assert.assertNotNull(i_array0);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test127");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(2101, 828, 667722, (int) (byte) 10, 2758);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test128");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(667722, 241, 828, 7725, (int) (byte) 10);
        org.junit.Assert.assertTrue(i5 == 676526);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test129");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(136521, 0, 206520, 17294, 23261);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test130");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(3708, 241, 1, 826, 557256);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test131");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(225828, 1540642, 12057, 3, 108318);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test132");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(23261, 10, 11818, (int) (byte) 100, 2838);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test133");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(241, 42674, 2100, 1461647, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test134");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(108318, 0, 101423, (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test135");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(40413, 11818, 0, 14665, 14710);
        org.junit.Assert.assertTrue(i5 == 81606);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test136");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(130240, 0, 43019, 265, 43019);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test137");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(3708, 24798, 7251, 3005, 4366);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test138");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(8699, 121602, 27943, (int) (short) 10, 2664);
        org.junit.Assert.assertTrue(i5 == 160918);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test139");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(11818, 105799, 105799, 0, 8503);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test140");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(2101, 139717, 491588, 24839, 7073);
        int i6 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test141");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(4366, 4366, (int) (short) 10, 13450, 523910);
        org.junit.Assert.assertTrue(i5 == 546102);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test142");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(79052, 109, 7725, 1177, 9902);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test143");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(10666, 826, (int) (byte) -1, 1177, 1163586);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test144");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(36050, 0, 2, 241570, 7073);
        org.junit.Assert.assertTrue(i5 == 284695);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test145");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(36359, 2827, 2238, 77545, 176396);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test146");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) '#', (int) (byte) 10, (int) (short) 1, (int) (short) 10, 265);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test147");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(35248, 412, 826, 71567, 1);
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test148");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(2775, 364, 57349, 2, 77545);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test149");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(14116, 2892, 1957, (int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test150");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(241, 24697, 396848, 2014, 11804);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test151");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(111, 171569, 663297, (-1), 1332441);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test152");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((-1), 11463, 351, 3708, 1648);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.quatro();
        int i8 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test153");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(1958, 3005, 826, 71567, 0);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test154");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(265, 364, (int) (short) 10, 739, 11463);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test155");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(739, 284695, 739, 45400, 114842);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test156");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(0, (int) (short) 1, 100, (int) (byte) 0, 202751);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test157");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(1114514, 14710, 6176, 111, (int) (short) -1);
        org.junit.Assert.assertTrue(i5 == 1135510);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test158");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(0, (int) (byte) -1, 7073, 101403, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test159");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(19544, 2892, 7251, 36050, 827);
        org.junit.Assert.assertTrue(i5 == 66564);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test160");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(40954, 9105, 2664, 1958, 202751);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test161");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(364, 36050, 101403, 0, 978);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test162");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(948557, 56977, 2827, 4366, 48899);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test163");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(523910, 46003, 93739, 284695, 2101);
        org.junit.Assert.assertTrue(i5 == 950448);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test164");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(31385, 27943, 375, 31385, 34754);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test165");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(0, 616395, 195986, 14665, 130240);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test166");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(265, 2014, 157116, 0, 5825);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test167");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(71567, 40413, 2664, 284695, 1163586);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test168");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(11804, 667722, 35248, 81606, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test169");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(398922, 27943, 239859, 12057, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test170");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(10394, (int) ' ', 160918, 265, 24697);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test171");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(27943, 827, 24839, 3710, 1567);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test172");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (byte) -1, 1177, (int) '4', 739, (int) (byte) -1);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.quatro();
        int i8 = yatzy5.cinco();
        int i9 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test173");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(828, 6615, 7725, 7073, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test174");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(2775, 1332441, 4778, 108318, 24839);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test175");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(115765, 24839, 0, 46003, 43019);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test176");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(8699, 0, 9105, 10394, 241570);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test177");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(13450, 176396, 14665, (int) (short) 100, 616395);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test178");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(3005, 206520, 1648, 206520, 557256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test179");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(2775, 111, 130240, (int) (byte) 1, 663297);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test180");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(0, 6442, 3710, (int) (short) -1, 46430);
        org.junit.Assert.assertTrue(i5 == 56581);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test181");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(36359, 215081, 4007, 22640, 55428);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test182");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(0, 46624, 667722, 177426, 826);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test183");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(1957, 3379, 160918, 22640, 524841);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test184");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo((int) (short) 100, 0, 1177, 130240, 9902);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test185");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(1237, 615823, 31385, (int) (byte) -1, 195986);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test186");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(225828, 81606, 109, 557256, 398922);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test187");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(198, 2974, 948557, 22640, 171569);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test188");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(202751, 136521, 71567, 676526, 241570);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test189");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(950448, 79052, 34754, 1957, 1135510);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test190");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(1648, 81606, 657535, 13764, 26198);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test191");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(1356, 236299, 219, 6615, 739);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test192");
        int[] i_array4 = new int[] { 115765, 1332441, 3379, 22640 };
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.yatzy(i_array4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array4);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test193");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(36050, 364, 206520, (int) (byte) 0, 1461647);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test194");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(523910, 2014, 46003, 0, 6615);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test195");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(6615, 546102, 15286, 4007, 81606);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test196");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo((int) (byte) 1, 0, 31549, 101423, 386511);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test197");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(491588, (int) (short) 100, 615823, 1540642, 15286);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test198");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(42674, 2101, 0, 9902, 15190);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test199");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(1356, 111, 136521, 1957, 523910);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test200");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(2838, 15286, 112604, 667722, 130240);
        org.junit.Assert.assertTrue(i5 == 928690);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test201");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(8418, 1648, 199391, 524841, 49691);
        org.junit.Assert.assertTrue(i5 == 783989);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test202");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(46624, 13393, 40413, 39011, 14116);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test203");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(3708, 225828, 386511, 11804, 36359);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test204");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(2, (int) (short) 10, 265, 827, 1957);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test205");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(265, 6442, 130240, 412, 423337);
        org.junit.Assert.assertTrue(i5 == 560696);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test206");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(0, 351, 239859, 105324, 667722);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test207");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(52607, 1, 676526, 0, 42674);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test208");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(3, 12, 49691, 783989, 1135510);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test209");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(1957, 32771, 17294, 2975, 1648);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test210");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(275072, 408760, 31549, 241, 22640);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test211");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(43019, 8244, 93739, 557256, 105799);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test212");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(7204, (int) (byte) -1, 0, 783989, 3379);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test213");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(1332441, 23261, 6442, 15060, 108318);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test214");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(2014, 40413, 12, 667722, 17294);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test215");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(408760, 24798, 1461647, 104090, (int) (byte) 1);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test216");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(13450, 412, 265, 1094113, 275072);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test217");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(4778, 55428, 2838, 2974, 771);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test218");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(14710, 1648, 51898, 386511, 2758);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test219");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(396848, 26198, 48899, 10, 1163586);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test220");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(8418, 195986, 24697, (-1), 139717);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test221");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(105324, 423337, 265, 202751, 46430);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test222");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(101403, 3, 241570, 828, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test223");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(198, 7251, (int) (short) -1, 827, 2);
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
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test224");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(386511, 8418, 206520, 45400, 111);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test225");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(45400, 3708, 1177, 667722, 177426);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test226");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(2827, 198, 1745, 398922, 11463);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test227");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um((int) '#', 4007, 375, 48899, 12);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test228");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(524841, 25022, 0, 58755, 45400);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test229");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(1648, 491588, 31549, (int) (byte) 1, 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test230");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(8418, 0, 40954, 364, 21544);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test231");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(11804, 13061, 0, 6615, 1957);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test232");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(6442, 6176, 45400, 171569, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test233");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(46430, 1332441, 34754, 32771, 15060);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test234");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(827, 34922, 111, 1114514, 11463);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test235");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (byte) 0, (int) '#', (int) (short) 10, (int) (byte) 1, (int) (short) 100);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test236");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance((int) (short) 100, 284695, 3379, 265, 0);
        org.junit.Assert.assertTrue(i5 == 288439);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test237");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(15060, 215081, (int) (byte) 0, 275072, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test238");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(6176, 14116, 783989, 11818, 978);
        org.junit.Assert.assertTrue(i5 == 817077);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test239");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(351, (int) (byte) 100, 1461647, 386511, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test240");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(171569, 0, 62610, 177426, 4778);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test241");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(8418, 523910, 17294, 7725, 948557);
        int i6 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test242");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(40954, 2, 14116, 560696, 1540642);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test243");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(1332441, 39011, 8503, 109, 2664);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test244");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(275072, 29121, 24798, 13764, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test245");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo((int) (short) 0, 408760, 43019, 7725, 13764);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test246");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (byte) 1, 241, 100, 265, 0);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test247");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(1094113, 177426, (int) (short) 100, 928690, 4007);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test248");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(206520, 828, 783989, 198, 29121);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test249");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(2758, 49691, 25022, 375, 23261);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test250");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(39011, 275072, 57349, (-1), 771);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test251");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(93739, 8418, 14116, 171569, 2101);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test252");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(7251, 176396, 71567, 0, 25022);
        org.junit.Assert.assertTrue(i5 == 280236);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test253");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(15190, 15259, 0, 114842, 71567);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test254");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(0, 1648, 22640, 0, 375);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test255");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo((int) (short) 1, 3379, 739, (int) (short) 0, 15190);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test256");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo((int) (byte) 1, 9902, 241, 101423, 32771);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test257");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(160918, 280236, 13061, 219, 114842);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test258");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(0, 14116, 2664, 176396, 1567);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test259");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(6615, 52607, 195986, (int) (byte) 10, 978);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test260");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(219, 48899, 408760, 4778, 139717);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test261");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(265, (int) (byte) 100, (int) ' ', 58755, 11463);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test262");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(157116, 115765, (int) (short) 10, 8503, 24697);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test263");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(1356, 45400, 100, 351, (int) (byte) 1);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test264");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(8418, 36359, 14710, 771, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test265");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(10666, 10, 408760, 1, 6442);
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test266");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(31549, 176396, 386511, 0, 826);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test267");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(3708, 3708, 10666, 0, 2775);
        int i6 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test268");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(13450, 34922, 15190, 1163586, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test269");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(121602, 0, 40954, 0, 398922);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test270");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(6442, 8503, 2014, (-1), 616395);
        org.junit.Assert.assertTrue(i5 == 633353);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test271");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(160918, 7204, 160918, 13764, 42674);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test272");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(14116, 663297, 239859, 49691, 19544);
        org.junit.Assert.assertTrue(i5 == 986507);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test273");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(771, 8418, 23581, 46003, 40954);
        int i6 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test274");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (short) 10, 198, (int) 'a', 10, (int) (short) 10);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.quatro();
        int i9 = yatzy5.seis();
        int i10 = yatzy5.quatro();
        int i11 = yatzy5.seis();
        int i12 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test275");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(1648, 24798, 23581, 32771, 1461647);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test276");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(12, 31549, 408760, 21544, 4778);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test277");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(219, 0, (int) (short) -1, 62610, 108318);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test278");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(408760, 36050, 49691, 108318, 1114514);
        org.junit.Assert.assertTrue(i5 == 1717333);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test279");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(1648, 0, 1177, 198, 771);
        int i6 = yatzy5.cinco();
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
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test280");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) ' ', 15259, 139717, 81606, 783989);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test281");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(100, 24839, 34922, (int) (byte) 0, 667722);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test282");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(111, 1958, (int) (byte) -1, 3379, 12);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.quatro();
        int i8 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test283");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia((int) (short) 0, 17294, 0, 39011, 676526);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test284");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(826, 31549, 6176, 783989, 198);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test285");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(175004, 13393, 241, 2975, 21544);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test286");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(1540642, 1094113, (int) (short) 100, (int) (short) -1, 6176);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test287");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(42674, 3379, 109, 22640, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test288");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo((int) (short) 100, 3005, 13061, 1135510, 10394);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test289");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(31549, (int) '4', 15060, 1540642, 49691);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test290");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(215081, 49691, 364, 48899, 101403);
        org.junit.Assert.assertTrue(i5 == 415438);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test291");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(0, 948557, 36050, (int) '4', 1745);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test292");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(56581, 81606, 265, 17294, 15259);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test293");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(25022, 169608, 663297, 616395, 24839);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test294");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(139717, 66564, 24697, 3, 105324);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test295");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(0, (int) (short) 100, 1540642, 1163586, 1648);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test296");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(10, 1126, 280236, 1177, 739);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test297");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(175004, 560696, 22640, 986507, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test298");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(0, 48899, 3710, (int) (short) 10, 32771);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test299");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(27943, 423337, 10, 10160, 8418);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test300");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(15190, 14116, 2238, 29121, 2101);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test301");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(1717333, 13061, 1717333, 22640, 13061);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test302");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia((int) (short) 1, 0, 57349, (int) (byte) 10, 7251);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test303");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(12057, 24839, 24839, 1461647, 56581);
        org.junit.Assert.assertTrue(i5 == 1579963);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test304");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(11818, 40954, 0, 1094113, 398922);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test305");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(81606, 2975, 176396, 978, 195986);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test306");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(667722, 42674, 40954, 4366, 676526);
        org.junit.Assert.assertTrue(i5 == 1432242);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test307");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(3708, 114842, 219, 950448, 46003);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test308");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(25022, 21544, 81606, 928690, (int) (byte) 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test309");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(1745, 40413, (int) (short) 100, 169608, 13061);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test310");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(121602, 3379, 34922, 0, 284695);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test311");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) '4', (int) (byte) 100, (int) (short) 100, (int) (byte) 10, (int) (byte) 100);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.quatro();
        int i9 = yatzy5.cinco();
        int i10 = yatzy5.quatro();
        int i11 = yatzy5.seis();
        int i12 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test312");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(8418, 23581, 5825, 8503, (int) (short) 0);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test313");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(948557, 398922, 27943, 177426, 32771);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test314");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(0, 2101, 219, 10, 23581);
        int i6 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test315");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(1745, 17294, 24697, 2758, 219);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test316");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(11804, 36359, 2, 63392, 56581);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test317");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(950448, 615823, 13393, 8418, 109);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test318");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(4007, 483, (int) (byte) 0, 0, 4366);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test319");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(14116, 49691, 423337, 7073, 105324);
        int i6 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test320");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(2975, 1094113, 1461647, 2238, 104090);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test321");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(4007, 24697, (int) (byte) 10, 616395, 739);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test322");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) 'a', (int) '4', (int) ' ', 111, (int) (short) -1);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.seis();
        int i8 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test323");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(198, 7251, (int) (short) -1, 827, 2);
        int i6 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test324");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(48899, 0, 51898, 280236, (int) '#');
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test325");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(225828, 15259, 199391, (int) (short) 100, 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test326");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(46624, 0, (int) (byte) 10, 55428, 10666);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test327");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(396848, 206520, 19544, 7204, 663297);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test328");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(284695, 524841, 169608, 39011, 1177);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test329");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(63392, 40413, 62610, 415438, 2101);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test330");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(17189, 177426, 171569, 62610, 739);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test331");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(15259, 139717, 42674, 3379, 1567);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test332");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(219, 32771, 56977, 63392, 6442);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test333");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) 'a', 0, 0, (int) (byte) 1, (int) (short) -1);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.seis();
        int i9 = yatzy5.cinco();
        int i10 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test334");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(2838, 0, 101423, 100, 284695);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test335");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(423337, (int) '4', 15259, 239859, 32771);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test336");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(1356, 11818, 1, 2238, 351);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test337");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(79052, 491588, 12057, 986507, 81606);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test338");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(219, (int) '4', 6176, 1958, 1648);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.quatro();
        int i8 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test339");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(57349, 676526, (int) ' ', 546102, 15190);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test340");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(1177, (int) 'a', 2238, 1177, (int) (byte) 100);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test341");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(0, 524841, 2758, 202751, 288439);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test342");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(3005, 8418, 171569, 491588, 3708);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test343");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(80166, 2827, 0, 415438, 52607);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test344");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois((int) ' ', 21544, 29121, 1163586, 111);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test345");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(62610, 7725, 23581, 483, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test346");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia((int) (short) 10, 5825, 25022, 1094113, 2775);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test347");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(79052, 32771, 783989, 108318, 523910);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test348");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(1114514, 560696, 4007, 560696, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test349");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (byte) 0, (int) '#', (int) (short) 10, (int) (byte) 1, (int) (short) 100);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.seis();
        int i9 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test350");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia((int) (short) -1, (int) (byte) 10, 9105, 0, 77545);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test351");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(157116, 2775, 121602, 7204, 109);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test352");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(3005, 0, 0, 783989, 57349);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test353");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(396848, 104090, 241570, 56581, 275072);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test354");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(1356, 2758, 491588, 667722, 7725);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test355");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(46003, 12057, 483, 15060, 827);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test356");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(288439, 10, 523910, 11463, 19544);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test357");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(177426, 6615, 2827, 2892, 27943);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test358");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(81606, 169608, 0, 36050, 177426);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test359");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(101403, 1135510, 15286, 1, 1177);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test360");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(57349, 1237, 48899, 77545, 160918);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test361");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par((int) (byte) 1, 19544, 948557, 15060, 11818);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test362");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(1332441, 19544, 57349, 104090, 34922);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test363");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (short) 10, 198, (int) 'a', 10, (int) (short) 10);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.quatro();
        int i8 = yatzy5.seis();
        int i9 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test364");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(265, (int) (byte) -1, 114842, 412, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test365");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(105324, 375, (int) (byte) -1, 1135510, 40954);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test366");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(32771, 24839, 108318, 546102, 22640);
        org.junit.Assert.assertTrue(i5 == 734670);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test367");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(364, 0, 2775, 1237, 948557);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test368");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(169608, 105324, 0, 396848, 928690);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test369");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (short) 100, (int) '4', 1356, (int) (byte) -1, (int) ' ');
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.quatro();
        int i8 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test370");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(9105, (int) 'a', (-1), 2838, 46003);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test371");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) 'a', (int) '4', (int) ' ', 111, (int) (short) -1);
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
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test372");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(101423, 1717333, 11463, 1177, 663297);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test373");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(4778, 24798, 1958, 560696, 8503);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test374");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(14710, 32771, 225828, 375, 2758);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test375");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(0, 15060, 17189, 1717333, 2974);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test376");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(10, 225828, 483, 5825, 24798);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test377");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(14116, (int) (short) 10, 2758, 663297, 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test378");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(386511, (int) (short) -1, 101423, 386511, 114842);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test379");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(9105, 2100, 817077, 139717, 950448);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test380");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) 'a', 0, 0, (int) (byte) 1, (int) (short) -1);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.seis();
        int i9 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test381");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(667722, 1, 2101, 42674, (int) (short) -1);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test382");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(0, 109, 139717, 10666, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test383");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(986507, 15286, 26198, 275072, 827);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test384");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(31549, 2975, 31549, 364, 15190);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test385");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(112604, 177426, 978, 225828, 202751);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test386");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(1958, 195986, 121602, 2775, 43019);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test387");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) 'a', (int) '4', (int) ' ', 111, (int) (short) -1);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.seis();
        int i8 = yatzy5.cinco();
        int i9 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test388");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(241570, 160918, 0, 49691, 676526);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test389");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(66564, (int) (byte) 100, 3708, 7073, 80166);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test390");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(2100, 1717333, (int) (byte) 1, 49691, (int) (short) 1);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test391");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(17189, 21544, 928690, 284695, 105799);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test392");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(34754, 14665, (int) (short) 100, 1745, 1432242);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test393");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) '4', (int) (byte) 100, (int) (short) 100, (int) (byte) 10, (int) (byte) 100);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.seis();
        int i8 = yatzy5.cinco();
        int i9 = yatzy5.seis();
        int i10 = yatzy5.quatro();
        int i11 = yatzy5.quatro();
        int i12 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test394");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(62610, 6442, 8244, 11818, 351);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test395");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(11818, 171569, (int) (byte) 1, 32771, 10160);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test396");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(100, 10160, 39011, 1114514, 1567);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test397");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(3379, 7251, 12, 10394, 415438);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test398");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(115765, 633353, 10160, 280236, 2);
        org.junit.Assert.assertTrue(i5 == 2);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test399");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (short) 10, 198, (int) 'a', 10, (int) (short) 10);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test400");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres((int) (byte) 10, 265, 17189, 22640, 77545);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test401");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(0, 560696, 1461647, 10160, 1567);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test402");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(10666, 2, 114842, 15190, 34754);
        org.junit.Assert.assertTrue(i5 == 2);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test403");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(2238, 978, 396848, 1094113, 8699);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test404");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(115765, 93739, 39011, 79052, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test405");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(415438, 15190, 219, 4007, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test406");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(0, 1163586, 1114514, 2, 11463);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test407");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(11463, 827, 8699, 986507, 667722);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test408");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(0, 8699, (int) (byte) 0, 12, 52607);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test409");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(177426, 284695, 139717, (int) '#', 771);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test410");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(826, 275072, 386511, 288439, 1);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test411");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) '4', (int) (byte) 100, (int) (short) 100, (int) (byte) 10, (int) (byte) 100);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.cinco();
        int i9 = yatzy5.seis();
        int i10 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test412");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(7073, 10666, 3379, 136521, 112604);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test413");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(2838, 93739, 275072, 57349, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test414");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(986507, 375, 62610, (int) (byte) -1, 1332441);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test415");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(826, 0, 2238, (int) (short) -1, (int) (short) -1);
        int i6 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test416");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(115765, 199391, 206520, 7725, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test417");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(1356, 130240, 412, 93739, 11463);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test418");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(46624, 1163586, 265, 2014, 1135510);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test419");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(24839, 2775, 1, 39011, 12057);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test420");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(105799, 15060, 52607, 43019, 546102);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test421");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(80166, 524841, 978, 31549, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test422");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(739, 45400, 13393, 560696, 160918);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test423");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(77545, 491588, 4778, 5825, 783989);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test424");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(1126, (int) ' ', 2775, 546102, 12057);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test425");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(219, 734670, 239859, 225828, 202751);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test426");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(986507, 1163586, 396848, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test427");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(1648, 6615, (int) ' ', (int) '#', 46003);
        int i6 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test428");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(0, 826, 241, 1567, (int) (byte) 1);
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
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test429");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(10, 978, 364, (int) (byte) 0, 827);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.seis();
        int i8 = yatzy5.quatro();
        int i9 = yatzy5.cinco();
        int i10 = yatzy5.seis();
        int i11 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test430");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(236299, 483, 265, 17294, (int) (byte) 10);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test431");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(2238, 8503, 108318, 0, 15259);
        int i6 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test432");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(23581, 978, 1745, 826, 1648);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test433");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(12, 0, 0, 1356, 771);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test434");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(657535, (int) (short) 100, 284695, 557256, 31549);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test435");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(2101, 4366, 1567, 4778, 771);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test436");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(199391, 55428, 676526, (int) '#', 667722);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test437");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(25022, 663297, (int) '4', 8503, 239859);
        org.junit.Assert.assertTrue(i5 == 936733);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test438");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(396848, 27943, 139717, 241570, 423337);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test439");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(100, 14116, (int) (byte) 100, 176396, 14116);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test440");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(36359, 1, 219, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test441");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(46624, 0, 1237, 13764, (int) (short) -1);
        int i6 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test442");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(423337, 415438, 8699, 36050, 236299);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test443");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(57349, 1332441, 657535, 77545, 114842);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test444");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(1163586, 35248, 24798, 139717, 524841);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test445");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(2664, 2975, 0, 523910, 57349);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test446");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(408760, 24839, 46003, 40413, 2838);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test447");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(6615, 739, 1126, 3379, 112604);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test448");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(195986, 1579963, 31549, 1461647, 46624);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test449");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(1579963, 241570, 1332441, 11463, 1237);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test450");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(109, 108318, 121602, 9902, 23581);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test451");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(31549, 560696, (-1), 56977, 12);
        org.junit.Assert.assertTrue(i5 == 649233);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test452");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(950448, 63392, 80166, 676526, 557256);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test453");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(771, 0, 5825, 8503, 8503);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test454");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(0, 2, 24839, 2975, 55428);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test455");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(408760, 0, 169608, 35248, 667722);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test456");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(8699, 6615, 676526, 2838, 21544);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test457");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(633353, 1177, 1567, 649233, 936733);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test458");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(43019, 34922, 77545, 225828, 101403);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test459");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(112604, 21544, 10666, 79052, 1567);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test460");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(1745, 157116, 105324, 100, (int) '#');
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test461");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia((-1), 15286, (int) (byte) 10, 9105, 978);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test462");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(0, (int) (byte) 1, 546102, 19544, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test463");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(4366, 0, 100, 2, 3708);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test464");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(4778, 105324, 0, 21544, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test465");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(34922, 79052, 58755, 22640, 157116);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test466");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(483, 284695, 524841, 1567, 284695);
        org.junit.Assert.assertTrue(i5 == 1096281);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test467");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(206520, 375, 1717333, 386511, 14710);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test468");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres((int) (byte) 100, 51898, 2827, 198, 10394);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test469");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(9902, (int) (short) 100, 398922, 136521, 15060);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test470");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(1135510, 0, 616395, 199391, 817077);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test471");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(649233, 24697, (int) (short) 0, (int) ' ', 3005);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test472");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(2892, 828, 1135510, 31385, 22640);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test473");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(112604, 0, 12, 105324, 48899);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test474");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(24798, 46003, 0, (int) '4', 26198);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test475");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(93739, (int) (byte) 10, 817077, (int) (byte) -1, 15060);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test476");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(817077, 62610, 42674, 663297, 1094113);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test477");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(114842, 15060, 34922, 375, 57349);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test478");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(1114514, 139717, 676526, 1114514, 398922);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test479");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(11804, 280236, 202751, 364, 215081);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test480");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(21544, 105799, 24697, 408760, 10160);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test481");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(77545, 11463, 46003, 14665, 15286);
        int i6 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test482");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(2100, 49691, 1163586, 783989, 24839);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test483");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(21544, 15190, 351, (int) (short) 1, 0);
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test484");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(827, 265, 24798, 739, 11818);
        int i6 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test485");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(46003, 3710, 56581, (int) ' ', 23261);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test486");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(978, 2101, 114842, 10, 1958);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test487");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (byte) -1, (int) 'a', (int) (short) -1, (int) (short) -1, (int) (short) -1);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.quatro();
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
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test488");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(195986, 667722, 265, 0, 2775);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test489");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(1126, 2664, 0, (int) (byte) 1, 2238);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test490");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(17189, 130240, 1958, 415438, 52607);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test491");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(36359, (-1), 0, 483, 26198);
        int i6 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test492");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres((int) '4', 24839, 239859, 36050, 1567);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test493");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(0, 3005, 17294, 175004, 39011);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test494");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(0, 986507, 71567, 24798, 15190);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test495");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(23581, 1717333, 826, 783989, 15190);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test496");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(14116, 39011, 15060, 0, (int) (byte) -1);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test497");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(364, 14665, (int) ' ', 6442, 351);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test498");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo((int) (short) 10, 23261, 2100, 351, 195986);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test499");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(412, 1745, 948557, 657535, 10160);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test500");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(176396, 12057, 19544, 24839, 560696);
        org.junit.Assert.assertTrue(i5 == 0);
    }
}

