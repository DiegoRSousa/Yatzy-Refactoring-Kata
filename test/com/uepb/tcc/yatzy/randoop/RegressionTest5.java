package com.uepb.tcc.yatzy.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test001");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(928690, 284695, 8503, 111, 676526);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test002");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(275072, 408760, 66564, 3, 101403);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test003");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(63392, 8244, 10394, 398922, 14665);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test004");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(93739, 100, 11818, 56977, 615823);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test005");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(5825, 160918, 0, 1126, 43019);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test006");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(0, 15286, 175004, 13450, 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test007");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(17189, 557256, 827, 198, 241570);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test008");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(275072, 195986, 7725, 7073, 104090);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test009");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(4778, (int) 'a', 7204, 8418, 1958);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test010");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(657535, 398922, 0, 423337, 101423);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test011");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(71567, 36359, 66564, 657535, 1579963);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test012");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(111, 1356, 827, 739, (int) ' ');
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.quatro();
        int i8 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test013");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(108318, 412, 14710, 557256, 40954);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test014");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(42674, (int) (short) 100, 100, 826, 13393);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test015");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(22640, 71567, 139717, 14665, 115765);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test016");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (byte) -1, 827, (int) ' ', (int) (byte) -1, 1);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.quatro();
        int i8 = yatzy5.cinco();
        int i9 = yatzy5.quatro();
        int i10 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test017");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(483, (int) (byte) 10, 42674, 8418, 2975);
        int i6 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test018");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(71567, 93739, 11463, 663297, 121602);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test019");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(826, 175004, 0, 412, 115765);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.quatro();
        int i8 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test020");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(34754, 114842, 12057, 4366, 206520);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test021");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(22640, 0, 80166, 523910, 1567);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test022");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(55428, 4366, (int) (short) -1, 8699, 36050);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test023");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(10, 11818, 8699, (int) 'a', 351);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test024");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(3005, 557256, 2014, 49691, 34754);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test025");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(52607, 1163586, 615823, 13393, 10160);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test026");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(0, 826, 241, 1567, (int) (byte) 1);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test027");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(104090, 219, 3379, 11804, 25022);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test028");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) 'a', 0, 0, (int) (byte) 1, (int) (short) -1);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.quatro();
        int i8 = yatzy5.seis();
        int i9 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test029");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(0, 177426, 2101, 32771, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test030");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(280236, 101423, 3710, 14116, 6615);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test031");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(77545, 13061, 6176, 423337, 15190);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test032");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(1177, 4007, 35248, 950448, 24798);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test033");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(111, 284695, 23581, 23581, 676526);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test034");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(241, 0, 739, 46003, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test035");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (byte) -1, 827, (int) ' ', (int) (byte) -1, 1);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test036");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(10, 828, 77545, 6176, 375);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test037");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(0, 13764, 1957, 1461647, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test038");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(241, 483, 1135510, 6615, 8503);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test039");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(23261, (int) (short) -1, 375, 817077, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test040");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(280236, 4366, 43019, 109, 676526);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test041");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(6176, 408760, 0, 491588, 169608);
        org.junit.Assert.assertTrue(i5 == 1076132);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test042");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(284695, 828, 13764, 46624, 13764);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test043");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(0, 817077, 275072, 176396, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test044");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(0, 4778, 27943, 11818, 1114514);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test045");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(7073, 10666, 3379, 136521, 112604);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test046");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(11463, 10, 0, (int) (byte) -1, 2775);
        int i6 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test047");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(136521, (int) '#', (int) (byte) 100, 139717, 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test048");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(0, 111, 412, 1957, 111);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.quatro();
        int i9 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test049");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(1432242, 483, 241, 0, 386511);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test050");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(560696, 10394, 739, 10394, 35248);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test051");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(93739, 2892, 1957, 9902, 4366);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test052");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(115765, 2014, 5825, 71567, 1237);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test053");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(2775, (int) (short) 0, 0, 199391, 29121);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test054");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(739, 351, 115765, 51898, 13764);
        org.junit.Assert.assertTrue(i5 == 182517);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test055");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) 'a', 0, 0, (int) (byte) 1, (int) (short) -1);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.seis();
        int i8 = yatzy5.cinco();
        int i9 = yatzy5.quatro();
        int i10 = yatzy5.seis();
        int i11 = yatzy5.cinco();
        int i12 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test056");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(175004, 100, 32771, 2975, 14710);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test057");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(284695, 202751, 351, 275072, 35248);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test058");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(10160, 734670, 4366, 11463, 101403);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test059");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(139717, 13393, 364, 31549, 1958);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test060");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(1356, 11818, 1, 2238, 351);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.quatro();
        int i8 = yatzy5.seis();
        int i9 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test061");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(40954, 225828, 1126, 109, 130240);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test062");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(7251, 1177, 241570, 11804, 2974);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test063");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(1094113, 1567, 828, 62610, 36359);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test064");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(978, 0, 1648, (int) '4', 241);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test065");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(4366, 0, 3710, 3379, 7073);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test066");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(2775, 2827, 0, 948557, 14665);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test067");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(6442, 783989, 101423, 56977, 241570);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test068");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (byte) -1, (int) 'a', (int) (short) -1, (int) (short) -1, (int) (short) -1);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.quatro();
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
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test069");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(24697, 284695, 12, 364, 6615);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test070");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(2664, 1717333, 826, (int) (short) 0, 17294);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test071");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia((int) (byte) -1, 667722, 663297, 241570, 14710);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test072");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(7204, 177426, 3710, 2664, 101423);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test073");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(936733, 219, 169608, 2758, 34922);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test074");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(1, (int) (short) 100, 111, 10, (int) (byte) 100);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.quatro();
        int i8 = yatzy5.seis();
        int i9 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test075");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(101423, 615823, 5825, 0, 1461647);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test076");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par((int) '#', 48899, 11818, 176396, 27943);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test077");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(24839, 351, 2775, 1114514, 3379);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test078");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(3, 11804, 15286, 0, 45400);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test079");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(1096281, 3710, 219, 157116, 15286);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test080");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um((int) (short) 1, 524841, 0, 36050, 79052);
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test081");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(39011, 108318, 1567, 412, 936733);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test082");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) '4', (int) (byte) 100, (int) (short) 100, (int) (byte) 10, (int) (byte) 100);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.quatro();
        int i9 = yatzy5.seis();
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
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test083");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(17189, 423337, 676526, 17294, 104090);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test084");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(130240, 8699, 62610, 52607, 34754);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test085");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(4366, 34922, 0, 56581, 2775);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test086");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(52607, 2827, 12057, 81606, 6442);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test087");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um((int) (short) 0, 24839, 109, 236299, 241);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test088");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(524841, 950448, 783989, 11463, 175004);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test089");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(29121, 11804, (int) (byte) 10, 171569, 26198);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test090");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(0, 826, 195986, 412, 783989);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test091");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(1177, 2014, 828, 3379, 0);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.quatro();
        int i8 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test092");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(31549, 17189, 657535, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test093");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(0, 826, 241, 1567, (int) (byte) 1);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test094");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(9105, 936733, 7204, 100, 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test095");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(0, 29121, 49691, 10394, 11804);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test096");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (byte) -1, (int) 'a', (int) (short) -1, (int) (short) -1, (int) (short) -1);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.seis();
        int i8 = yatzy5.seis();
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
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test097");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(13450, 771, 171569, 1135510, 1648);
        org.junit.Assert.assertTrue(i5 == 1322948);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test098");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(2974, 26198, 0, 616395, 199391);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test099");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(175004, 100, 24798, 31549, 17294);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test100");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(978, 0, 171569, 108318, 39011);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test101");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(29121, 51898, 491588, 1432242, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test102");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(56581, 42674, (int) (short) 0, 2975, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test103");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(81606, 32771, (-1), 40954, 828);
        org.junit.Assert.assertTrue(i5 == 156158);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test104");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(225828, 828, 11804, 1579963, 364);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test105");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(13450, 3710, 23261, 0, 375);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test106");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(364, 2014, 52607, 7073, 1237);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test107");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(169608, 265, (int) (short) 1, 1579963, 1540642);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test108");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(198, 55428, 8699, 34754, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test109");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(2100, 14710, 176396, 14710, 739);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test110");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (byte) 100, 1237, 827, 2775, (-1));
        int i6 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test111");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(9105, 2664, 39011, 423337, 1540642);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test112");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(10, (int) (byte) 1, (int) ' ', 111, (int) '4');
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test113");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(108318, 2827, 827, 3708, 2238);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test114");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(936733, 7073, 8418, 1958, 280236);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test115");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(0, 827, 25022, 1356, 27943);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test116");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(826, 7204, 1717333, 667722, 56581);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test117");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(105324, 1579963, 39011, 175004, 986507);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test118");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(734670, 219, (int) (short) 0, 13764, 171569);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test119");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(364, 8418, 49691, 950448, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test120");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(55428, 31385, 36359, 32771, 3379);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test121");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(265, 364, (int) (short) 10, 739, 11463);
        int i6 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test122");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(986507, 396848, 14116, 546102, 15259);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test123");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(219, 828, 265, 615823, 676526);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test124");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(375, 23261, 6176, 14710, 177426);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test125");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(1356, 239859, 236299, 176396, 13061);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test126");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(386511, 986507, 649233, 771, 828);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test127");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(1332441, 108318, 386511, 36359, 557256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test128");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(112604, 1717333, 523910, 108318, 2238);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test129");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(1135510, 950448, 15190, (int) '4', 14665);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test130");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(1237, 24839, (int) (byte) 100, 2101, 34922);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test131");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares((-1), 23261, 2758, 14710, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test132");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(667722, 105324, 0, 177426, 136521);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test133");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(375, 182517, 239859, 0, 523910);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test134");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(12, 0, 0, 1356, 771);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test135");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(1237, 8699, 24798, 2838, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test136");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(100, 1094113, 40954, 978, 169608);
        int i6 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test137");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(109, 0, 80166, 11818, 31549);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test138");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(2664, 26198, 21544, 14710, 12057);
        org.junit.Assert.assertTrue(i5 == 77173);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test139");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(39011, 1958, 288439, 7725, 13764);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test140");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(22640, 4366, 10160, 45400, 31385);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test141");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(657535, 101423, 49691, 1567, 396848);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test142");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(0, 42674, (int) (byte) 100, 7073, 77545);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test143");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(27943, 236299, 783989, 93739, 633353);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test144");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(26198, 79052, 14116, 241570, 2827);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test145");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(11463, 2975, 1322948, 0, 1957);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test146");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(1648, 11818, 6176, 2974, (int) (byte) 100);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test147");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares((int) '4', 828, 1648, 986507, 11463);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test148");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(25022, 43019, 8418, 9902, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test149");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(195986, 32771, 8503, 649233, 57349);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test150");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(1322948, 112604, 1957, 828, 24798);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test151");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(0, 2758, 1126, 24798, 24798);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test152");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(156158, 10160, 49691, 11463, (int) (short) 10);
        org.junit.Assert.assertTrue(i5 == 227482);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test153");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(739, 423337, 157116, 649233, 616395);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test154");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(1096281, 10160, 398922, 978, 101423);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test155");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(17294, 202751, 199391, 3, 77545);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test156");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(219, 1126, 615823, 10, 11463);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test157");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (short) 1, 114842, 15286, 34922, 928690);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test158");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(2664, 0, 39011, 121602, 928690);
        org.junit.Assert.assertTrue(i5 == 1091967);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test159");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(93739, 43019, 1332441, 46624, 45400);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test160");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) '4', (int) (byte) 100, (int) (short) 100, (int) (byte) 10, (int) (byte) 100);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.cinco();
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
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test161");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(43019, 195986, 0, 734670, 175004);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test162");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(398922, 10394, 783989, 24798, 1579963);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test163");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(21544, 26198, 77173, 1648, 182517);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test164");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(23261, 412, 8244, 2975, 15286);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test165");
        int[] i_array1 = new int[] { (byte) 1 };
        int i2 = com.uepb.tcc.yatzy.Yatzy.yatzy(i_array1);
        int i3 = com.uepb.tcc.yatzy.Yatzy.yatzy(i_array1);
        int i4 = com.uepb.tcc.yatzy.Yatzy.yatzy(i_array1);
        int i5 = com.uepb.tcc.yatzy.Yatzy.yatzy(i_array1);
        int i6 = com.uepb.tcc.yatzy.Yatzy.yatzy(i_array1);
        int i7 = com.uepb.tcc.yatzy.Yatzy.yatzy(i_array1);
        int i8 = com.uepb.tcc.yatzy.Yatzy.yatzy(i_array1);
        int i9 = com.uepb.tcc.yatzy.Yatzy.yatzy(i_array1);
        int i10 = com.uepb.tcc.yatzy.Yatzy.yatzy(i_array1);
        int i11 = com.uepb.tcc.yatzy.Yatzy.yatzy(i_array1);
        int i12 = com.uepb.tcc.yatzy.Yatzy.yatzy(i_array1);
        int i13 = com.uepb.tcc.yatzy.Yatzy.yatzy(i_array1);
        int i14 = com.uepb.tcc.yatzy.Yatzy.yatzy(i_array1);
        int i15 = com.uepb.tcc.yatzy.Yatzy.yatzy(i_array1);
        int i16 = com.uepb.tcc.yatzy.Yatzy.yatzy(i_array1);
        int i17 = com.uepb.tcc.yatzy.Yatzy.yatzy(i_array1);
        int i18 = com.uepb.tcc.yatzy.Yatzy.yatzy(i_array1);
        int i19 = com.uepb.tcc.yatzy.Yatzy.yatzy(i_array1);
        int i20 = com.uepb.tcc.yatzy.Yatzy.yatzy(i_array1);
        int i21 = com.uepb.tcc.yatzy.Yatzy.yatzy(i_array1);
        int i22 = com.uepb.tcc.yatzy.Yatzy.yatzy(i_array1);
        int i23 = com.uepb.tcc.yatzy.Yatzy.yatzy(i_array1);
        org.junit.Assert.assertNotNull(i_array1);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(i23 == 0);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test166");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(176396, 46003, 24798, 1094113, 771);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test167");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(2014, 13450, 5825, 26198, 0);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test168");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(2827, 351, 1237, 15060, 657535);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test169");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(176396, 11804, 36050, 1096281, 408760);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test170");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(0, 24839, 523910, 215081, 17189);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test171");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(412, 412, (int) '#', 7204, 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test172");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(52607, 663297, 115765, 13764, 1356);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test173");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par((int) (short) 0, (int) (byte) 100, 241570, 46430, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test174");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(27943, (int) (short) 0, 10160, 1163586, 19544);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test175");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(241570, 24839, 0, 199391, 24839);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test176");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(616395, 48899, 2892, 2975, 928690);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test177");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(52607, 1091967, 11818, 10666, 111);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test178");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(81606, 105324, 9105, 734670, 8418);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test179");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (byte) 0, (int) '#', (int) (short) 10, (int) (byte) 1, (int) (short) 100);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.seis();
        int i8 = yatzy5.cinco();
        int i9 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test180");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(0, 239859, 1356, 1126, 6615);
        org.junit.Assert.assertTrue(i5 == 248956);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test181");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(105799, 136521, (int) '4', 40413, 195986);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test182");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(12057, 112604, 14710, 13061, 104090);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test183");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(7204, 36050, 10, 13393, 2974);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test184");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(1163586, 182517, 121602, (int) (byte) 1, 71567);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test185");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) 'a', 0, 0, (int) (byte) 1, (int) (short) -1);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.quatro();
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
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test186");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(265, 1091967, 156158, 7725, 649233);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test187");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(14710, 40954, 2758, 3, 13450);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test188");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(412, 2838, 4366, 396848, 121602);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test189");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(275072, 31549, 62610, 177426, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test190");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(524841, 8244, 81606, 15060, 1096281);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test191");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(12, 63392, 9902, 3379, 3708);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test192");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(2014, 35248, 1332441, 34922, 23581);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test193");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(115765, (int) (byte) -1, 817077, 1135510, 275072);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test194");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(81606, 546102, 42674, 112604, 1579963);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test195");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) '#', (int) (byte) 10, (int) (short) 1, (int) (short) 10, 265);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.quatro();
        int i8 = yatzy5.seis();
        int i9 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test196");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(10160, 2664, (int) (byte) 1, 57349, 676526);
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test197");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(8244, (int) (byte) 0, 136521, 10, 49691);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test198");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(80166, (int) (byte) -1, 24839, 111, 0);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test199");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(1957, 15190, 4366, 11818, 616395);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test200");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(105799, 3710, 77173, 10394, 1356);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test201");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(0, 734670, 157116, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test202");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(14665, 23581, 23581, 560696, 177426);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test203");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(1076132, 6615, 46430, 1648, 62610);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test204");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(483, 3710, 978, 423337, 1177);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test205");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(423337, 265, 826, 0, 1076132);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test206");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(978, 0, 51898, 1717333, 560696);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test207");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(206520, 396848, 3708, 23581, 1432242);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test208");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(0, 10160, 2238, 51898, (int) '#');
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test209");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(0, 14710, 739, 46430, 8418);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test210");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(1567, 58755, 182517, 667722, 4778);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test211");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(1717333, 412, 284695, (int) (short) 10, 828);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test212");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(17294, 49691, 2758, 2100, 10666);
        org.junit.Assert.assertTrue(i5 == 82509);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test213");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(826, 8699, 9902, 57349, 1567);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test214");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(121602, 27943, 1567, 1958, 121602);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test215");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(2101, 398922, 81606, 275072, 31549);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test216");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(56581, 386511, 1126, 26198, 2775);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test217");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(46430, 26198, 978, 1356, 2664);
        org.junit.Assert.assertTrue(i5 == 77626);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test218");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(415438, 105324, 206520, 136521, 136521);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test219");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(284695, 19544, 408760, 52607, 783989);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test220");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(0, 31385, 24697, (int) '4', 1461647);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test221");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(157116, 5825, 950448, 27943, 14116);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test222");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(2775, 828, 219, 2, 2664);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test223");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(3005, 198, 2014, 36050, 25022);
        org.junit.Assert.assertTrue(i5 == 66289);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test224");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(936733, 241, 0, 43019, 8244);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test225");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(0, 195986, 51898, 1717333, 15060);
        org.junit.Assert.assertTrue(i5 == 1980277);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test226");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(1567, 71567, 2, 1091967, 57349);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test227");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(676526, 71567, 12, 45400, 1957);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test228");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(115765, 15060, 483, 25022, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test229");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(176396, 676526, 1745, 8699, 0);
        org.junit.Assert.assertTrue(i5 == 863366);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test230");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(6615, 2014, 49691, 412, 115765);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test231");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(280236, 24839, 93739, 2758, 15060);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test232");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(101403, 114842, 1177, 45400, 8503);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test233");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(3, (int) '4', (int) (byte) 10, 412, 105324);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test234");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(828, 280236, 101403, 10160, 423337);
        int i6 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test235");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) '4', (int) (byte) 100, (int) (short) 100, (int) (byte) 10, (int) (byte) 100);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.seis();
        int i9 = yatzy5.quatro();
        int i10 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test236");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(23261, 2892, 0, 3708, 34754);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test237");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(375, 783989, 77545, 7073, 364);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test238");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(248956, 1717333, 817077, 0, 23581);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test239");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(3379, 0, 199391, 62610, 35248);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test240");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(77173, 1648, (int) (short) 10, 950448, 415438);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test241");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(219, 1237, 49691, 978, 62610);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test242");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(2664, 1957, 0, 10666, (int) (byte) 100);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test243");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(415438, (int) 'a', 936733, 7204, 7204);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test244");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(2775, 828, 219, 2, 2664);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test245");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(9105, 2827, 42674, 364, 1126);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test246");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo((int) (short) 10, 77545, 978, 56977, 375);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test247");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(0, 12057, 423337, 93739, 1237);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test248");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(17189, 950448, 108318, 288439, 523910);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test249");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(828, 42674, 1076132, 160918, 56977);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test250");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(171569, 284695, 2838, (int) '4', 105799);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test251");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(2775, 1094113, 176396, 1356, 1958);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test252");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(56977, 408760, 828, 63392, 15286);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test253");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(31549, 1096281, 15286, 978, 265);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test254");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(1076132, 546102, 169608, 139717, 11818);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test255");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(0, 2101, 219, 10, 23581);
        int i6 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test256");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(560696, 2100, 7204, 396848, 936733);
        int i6 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test257");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) 'a', (int) '4', (int) ' ', 111, (int) (short) -1);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.cinco();
        int i9 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test258");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(1540642, 423337, 1135510, 386511, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test259");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia((int) (short) 0, 160918, 2838, (int) (short) 100, 55428);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test260");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(2100, 176396, 978, 40413, 39011);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test261");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(423337, 202751, 7251, 616395, 17294);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test262");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia((int) (short) 1, 14710, 35248, 0, 1958);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test263");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(105799, 1958, 17294, 55428, 375);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test264");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(36359, 17189, 364, 0, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test265");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(51898, 195986, 826, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test266");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(2974, 57349, 241570, 1114514, 55428);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test267");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(2101, 195986, 248956, 12057, 1567);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test268");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(57349, 10160, 1322948, 219, (-1));
        org.junit.Assert.assertTrue(i5 == 1390675);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test269");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia((int) ' ', 1163586, 46430, 15190, 80166);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test270");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(0, 202751, 17294, 93739, 56977);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test271");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(2892, 1096281, 2238, 1461647, 2101);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test272");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia((int) 'a', 1957, 19544, 0, 2838);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test273");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(101403, 15190, 1177, (int) (short) -1, 280236);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test274");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares((int) (short) 1, 375, 2827, 0, 101403);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test275");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (short) -1, 0, 0, 56977, 19544);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test276");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(82509, 4778, 80166, 21544, 4366);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test277");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(171569, 199391, 14665, 248956, 23261);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test278");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(1745, 241, 1567, 2838, 198);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.seis();
        int i8 = yatzy5.seis();
        int i9 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test279");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(1237, 34754, 15286, (int) (short) 100, 63392);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test280");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(2758, 77626, 24697, 2827, 206520);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test281");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(19544, 46624, 56581, 175004, 1332441);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test282");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(8699, 7251, 2838, (int) (byte) 10, 2100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test283");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(546102, 1461647, 40954, 1717333, 46003);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test284");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(0, 8244, 11804, 10, 79052);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test285");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par((int) (byte) 10, 616395, 4778, 46624, 936733);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test286");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(198, 280236, 0, 0, 557256);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test287");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(9105, 111, 241570, 2238, 1);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test288");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(615823, 783989, 2014, 386511, 14710);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test289");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(14116, 1390675, 13393, 0, 936733);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test290");
        int[] i_array4 = new int[] { 950448, 48899, 58755, 1163586 };
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.yatzy(i_array4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(i_array4);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test291");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(15259, 412, 248956, 111, 2775);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test292");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(2238, 36050, 8503, 13393, 1648);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test293");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(239859, 39011, 739, 1957, 546102);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test294");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(56977, 32771, 351, (int) (byte) 1, (int) '#');
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test295");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(986507, 239859, 241570, 79052, 1094113);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test296");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((-1), 11463, 351, 3708, 1648);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.quatro();
        int i8 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test297");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(77545, 6615, (int) '4', 112604, 241570);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test298");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(6615, 1745, (int) (byte) 0, 23261, 56581);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test299");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(408760, 14710, 215081, 5825, 14710);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test300");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(657535, 130240, 978, 2974, 56977);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test301");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares((int) ' ', 4366, 0, 739, 1567);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test302");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(616395, 241, (int) '4', 1322948, 114842);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test303");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(0, (int) (short) -1, (int) (short) 1, 100, 1648);
        int i6 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test304");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(0, 657535, 265, 0, 40413);
        org.junit.Assert.assertTrue(i5 == 698213);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test305");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(4366, 1332441, 734670, 13393, 928690);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test306");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(280236, 31549, 280236, 14710, 1432242);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test307");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(157116, (int) ' ', 4366, 3, 817077);
        int i6 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test308");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(0, 0, 0, 0, 978);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test309");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(0, 8699, 1076132, 1717333, 15190);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test310");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(49691, 2892, 2758, 176396, 265);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test311");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(739, 121602, 828, 0, 351);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test312");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(177426, 950448, 9105, 1717333, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test313");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(236299, 2838, 557256, 1356, 7725);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test314");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(46624, 616395, 8503, 1163586, 100);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test315");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(171569, 557256, 1, 10394, 1091967);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test316");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(63392, 17294, (int) (short) 0, 12, 1096281);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test317");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(239859, (int) (byte) 1, 10, 105324, 14116);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test318");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(1958, 14665, 12057, 4778, 7204);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test319");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(63392, 35248, 32771, 14116, 8503);
        org.junit.Assert.assertTrue(i5 == 154030);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test320");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(26198, 0, 27943, 108318, (int) (short) 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test321");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(35248, 2014, (int) (byte) 0, 23261, 52607);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test322");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(0, 616395, 524841, 105324, 978);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test323");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(11463, 25022, 948557, 219, 2014);
        org.junit.Assert.assertTrue(i5 == 987275);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test324");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(136521, 284695, 771, (int) (byte) 10, 826);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test325");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (byte) -1, 4366, 8699, 13393, (int) (short) -1);
        int i6 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test326");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) 'a', 0, 0, (int) (byte) 1, (int) (short) -1);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.quatro();
        int i8 = yatzy5.quatro();
        int i9 = yatzy5.seis();
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
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test327");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(1135510, 7725, 101423, 978, 948557);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test328");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(215081, 77173, 1579963, 826, 698213);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test329");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(6442, 14665, 49691, 523910, 43019);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test330");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(1579963, 7073, 11818, 160918, 62610);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test331");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(24697, 616395, 1322948, (int) (short) 1, 79052);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test332");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(408760, 199391, 195986, 19544, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test333");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(24839, 11804, 22640, 14116, 81606);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test334");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(14116, 0, 1540642, 15286, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test335");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(0, 1094113, 10666, 1096281, 71567);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test336");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(7073, 12057, 828, (int) 'a', 978);
        int i6 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test337");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(8244, 39011, 139717, 8699, 1163586);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test338");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) '4', (int) (byte) 100, (int) (short) 100, (int) (byte) 10, (int) (byte) 100);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.cinco();
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
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test339");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(227482, 19544, 49691, 6176, 13061);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test340");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(265, 364, (int) (short) 10, 739, 11463);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.seis();
        int i8 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test341");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(169608, 412, 1096281, 23581, 633353);
        org.junit.Assert.assertTrue(i5 == 1923235);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test342");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(157116, 11463, 81606, 1957, 928690);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test343");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) '4', (int) (byte) 100, (int) (short) 100, (int) (byte) 10, (int) (byte) 100);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.cinco();
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
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test344");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(40954, 0, 46430, 46624, 828);
        int i6 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test345");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(57349, 351, 15190, 11463, 649233);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test346");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(77545, 280236, 225828, 62610, 1980277);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test347");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(978, 7725, 71567, 175004, 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test348");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(483, 24697, (int) (short) 100, 396848, 1717333);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test349");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(6176, 0, 1980277, 32771, 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test350");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(1923235, 1390675, 109, 633353, 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test351");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(0, 43019, 227482, 93739, 288439);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test352");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares((int) (short) 10, 175004, 13393, 105324, 616395);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test353");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(0, 79052, 928690, 4007, 46430);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test354");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(100, 863366, 202751, 215081, 663297);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test355");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(386511, 633353, 56581, 219, 241);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test356");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) '#', (int) (byte) 10, (int) (short) 1, (int) (short) 10, 265);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test357");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(827, 265, 24798, 739, 11818);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test358");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(77173, 1096281, 26198, 19544, 2975);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test359");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(34922, 2101, 55428, 557256, 284695);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test360");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(115765, 56581, 26198, 676526, 9902);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test361");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(15060, 115765, 275072, 7725, 1390675);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test362");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(56581, (int) 'a', 1957, 45400, 633353);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test363");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(288439, 7204, 817077, 24697, 93739);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test364");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(1980277, 6615, 1126, 398922, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test365");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(351, 49691, (int) (short) -1, 77545, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test366");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(1094113, 1094113, 40413, 206520, 4778);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test367");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(1648, 32771, 39011, 11463, 49691);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test368");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(1432242, 546102, 828, 1432242, 1135510);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test369");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(7725, 35248, 739, 11463, 13764);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test370");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(265, 2827, 1356, 1567, 6615);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.seis();
        int i8 = yatzy5.cinco();
        int i9 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test371");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(25022, 826, (int) (byte) 1, 1332441, 169608);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test372");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(121602, 284695, 10666, 136521, 649233);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test373");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(523910, 616395, 23581, 827, 6442);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test374");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(241, 7073, 11818, 1135510, 948557);
        org.junit.Assert.assertTrue(i5 == 2103199);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test375");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(3708, (int) (byte) 100, 7251, 817077, 46430);
        org.junit.Assert.assertTrue(i5 == 874566);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test376");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(101403, 1980277, 7204, 3710, 31385);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test377");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(34922, 0, 1432242, 739, 0);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test378");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (byte) 100, (int) '#', (int) (byte) -1, 241, (int) (byte) 0);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.seis();
        int i8 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test379");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(35248, 827, 15286, 364, 24798);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test380");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(22640, 633353, 1332441, 0, 66564);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test381");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (byte) 100, 14116, 826, 241, 9902);
        int i6 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test382");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(25022, 34922, 82509, 408760, 364);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test383");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(560696, 828, 58755, 15060, 11818);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test384");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) 'a', (int) '4', (int) ' ', 111, (int) (short) -1);
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
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test385");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(827, 364, 198, (int) (byte) -1, (int) (short) -1);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.quatro();
        int i8 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test386");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(71567, 546102, 31549, 27943, 649233);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test387");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(2975, 26198, 115765, 0, 2014);
        org.junit.Assert.assertTrue(i5 == 146952);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test388");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) '4', (int) (byte) 100, (int) (short) 100, (int) (byte) 10, (int) (byte) 100);
        int i6 = yatzy5.cinco();
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
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test389");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(375, (int) (short) -1, 104090, 11818, 77626);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test390");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(40413, 364, 13061, 1126, 826);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test391");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(115765, 633353, 24697, (int) (short) -1, 396848);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test392");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(1114514, 29121, 3, (int) (byte) -1, 275072);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test393");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(1567, 66289, 11818, 2664, 40954);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test394");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(66289, 23261, 415438, (int) ' ', 109);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test395");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(108318, 4366, 8699, 546102, 31549);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test396");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(202751, 1126, 615823, 14116, 42674);
        int i6 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test397");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(31385, 11804, 1126, 77626, 26198);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test398");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(1923235, 0, 27943, 236299, 57349);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test399");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(66564, 0, 77545, 483, 1091967);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test400");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(423337, 2974, 1356, 34922, 657535);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test401");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(111, 288439, 46624, 0, 199391);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test402");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(10, 978, 364, (int) (byte) 0, 827);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.quatro();
        int i8 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test403");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(2758, 130240, 0, 66289, 101403);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test404");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(2, 633353, 12, 1094113, 160918);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test405");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(928690, 408760, 8244, 676526, 160918);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test406");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(2014, 524841, 0, 1356, 62610);
        int i6 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test407");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(139717, 3710, 227482, 667722, 146952);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test408");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(108318, 23261, 105799, 105799, 936733);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test409");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(108318, 667722, 0, 649233, 51898);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test410");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(24798, 36050, 34754, 375, 111);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test411");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(0, 101423, 24798, 10160, 828);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test412");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(195986, 8699, 160918, 79052, 176396);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test413");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) 'a', 0, 0, (int) (byte) 1, (int) (short) -1);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.quatro();
        int i8 = yatzy5.quatro();
        int i9 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test414");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(375, 265, 40413, 739, 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test415");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(112604, 14710, 6615, 182517, 1461647);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test416");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares((int) (short) 0, 206520, (int) (short) 100, 24839, 1390675);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test417");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(0, 657535, (int) '#', 31385, 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test418");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(2103199, 9902, 1923235, 19544, 115765);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test419");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (byte) -1, (int) 'a', (int) (short) -1, (int) (short) -1, (int) (short) -1);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.quatro();
        int i8 = yatzy5.quatro();
        int i9 = yatzy5.cinco();
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
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test420");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) 'a', 0, 0, (int) (byte) 1, (int) (short) -1);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.seis();
        int i8 = yatzy5.seis();
        int i9 = yatzy5.cinco();
        int i10 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test421");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(739, 182517, 1177, 1579963, 31385);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test422");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(35248, 15259, 4778, 6176, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test423");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(11818, 52607, 111, 9105, 14116);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test424");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(280236, 15286, 35248, 77626, 771);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test425");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(71567, (int) (byte) 0, 0, 36050, 58755);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test426");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(93739, 6615, 239859, 219, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test427");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(1, 375, 34922, 698213, (int) (byte) 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test428");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(560696, 1163586, (int) (short) 10, 6176, 46624);
        org.junit.Assert.assertTrue(i5 == 1777092);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test429");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(104090, 1096281, (int) '4', 82509, 423337);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test430");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(48899, 19544, (-1), 986507, 1177);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test431");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(24798, (int) (byte) 100, 4366, 219, (-1));
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test432");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(1567, 139717, 771, (int) (short) 100, 10160);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test433");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(24798, 364, 2827, 523910, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test434");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(1980277, 77173, 22640, 398922, 49691);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test435");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(874566, 177426, 2838, 987275, 0);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test436");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(46003, 2775, 81606, 560696, 34922);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test437");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) '4', 1322948, 415438, 1745, 31385);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test438");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(101403, 36050, 936733, 36359, 154030);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test439");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(80166, 412, 1096281, 0, 19544);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test440");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(1126, 46430, 3005, 987275, (int) (byte) 1);
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test441");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) 'a', 0, 0, (int) (byte) 1, (int) (short) -1);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.quatro();
        int i8 = yatzy5.seis();
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
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test442");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(12, 40954, 817077, 101423, 412);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test443");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) '4', (int) (byte) 100, (int) (short) 100, (int) (byte) 10, (int) (byte) 100);
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
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test444");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(375, 8699, 11804, 71567, 100);
        int i6 = yatzy5.quatro();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test445");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(13393, 43019, 46430, 491588, 4366);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test446");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(0, 2974, (int) (byte) 10, 0, 275072);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test447");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.tres_de_um_tipo(36050, 1540642, 34754, 936733, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test448");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(0, 55428, 15286, 219, 364);
        int i6 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test449");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(0, 82509, 17189, 986507, 987275);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test450");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres((int) 'a', 657535, 3, 8244, 2892);
        org.junit.Assert.assertTrue(i5 == 3);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test451");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(4007, 7204, 176396, 2014, 108318);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test452");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(56977, 157116, 8503, (int) '#', 10160);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test453");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(2758, 936733, 3, 3, 1461647);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test454");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(56581, 2, 950448, 1332441, 1135510);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test455");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(817077, 77626, 25022, 58755, 17294);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test456");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(219, (int) '4', 6176, 1958, 1648);
        int i6 = yatzy5.cinco();
        int i7 = yatzy5.quatro();
        int i8 = yatzy5.quatro();
        int i9 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test457");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(105799, 8418, 198, 105324, 31385);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test458");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(101423, 25022, 8418, 39011, 49691);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test459");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um((int) '4', 1648, 2014, 35248, 198);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test460");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo((-1), 2974, 19544, 2775, 17189);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test461");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) 'a', 0, 0, (int) (byte) 1, (int) (short) -1);
        int i6 = yatzy5.quatro();
        int i7 = yatzy5.seis();
        int i8 = yatzy5.seis();
        int i9 = yatzy5.cinco();
        int i10 = yatzy5.seis();
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
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test462");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(828, 739, 7251, 817077, 100);
        org.junit.Assert.assertTrue(i5 == 825995);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test463");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(9902, 13450, 524841, 66289, 6176);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test464");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(1, (int) (short) 100, 111, 10, (int) (byte) 100);
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
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test465");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois((int) (byte) 100, 105799, 175004, 32771, 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test466");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(241570, 157116, 154030, (int) (byte) 1, (int) (byte) 10);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test467");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(2892, 146952, (int) (short) 100, 14116, 1717333);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test468");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(1461647, 1461647, 32771, 936733, 198);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test469");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(21544, 24839, 11818, 23261, 676526);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test470");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(227482, 9902, 649233, 863366, 55428);
        org.junit.Assert.assertTrue(i5 == 1805411);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test471");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(616395, 7251, 177426, (int) (short) 0, 11804);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test472");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(62610, 950448, 241, 8244, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test473");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(739, 8244, 14116, 1980277, 26198);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test474");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(633353, 1805411, 40954, 34754, 31385);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test475");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres((int) (byte) -1, 17189, 2101, 0, 40413);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test476");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(66564, 412, 2975, 26198, 248956);
        int i6 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test477");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(398922, 23261, (int) (short) 0, 215081, 81606);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test478");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(9902, 11804, 649233, 32771, 48899);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test479");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(4778, 284695, 26198, 111, 1177);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test480");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(66564, 412, 2975, 26198, 248956);
        int i6 = yatzy5.cinco();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test481");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(0, 1745, 1579963, 546102, 13450);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test482");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(11804, 42674, 160918, 734670, 2014);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test483");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy((int) (byte) -1, (int) 'a', (int) (short) -1, (int) (short) -1, (int) (short) -1);
        int i6 = yatzy5.seis();
        int i7 = yatzy5.cinco();
        int i8 = yatzy5.seis();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test484");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(121602, 111, 241570, (int) (byte) -1, 121602);
        org.junit.Assert.assertTrue(i5 == 484884);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test485");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(1135510, 1461647, 157116, 3710, 57349);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test486");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pequenaSequencia(0, 386511, 31549, 987275, 108318);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test487");
        int i5 = com.uepb.tcc.yatzy.Yatzy.chance(31549, 0, 14710, 987275, 0);
        org.junit.Assert.assertTrue(i5 == 1033534);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test488");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(31385, 77545, 948557, 423337, 21544);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test489");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.quatro_de_um_tipo(523910, 66289, 698213, 104090, 115765);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test490");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(546102, 0, 1135510, 225828, 77545);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test491");
        int i5 = com.uepb.tcc.yatzy.Yatzy.dois(1923235, 1461647, 1717333, 34922, 10);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test492");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia(206520, 10160, 2100, 17294, 3005);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test493");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.pontuacao_par(1091967, 105799, 48899, 154030, 1958);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test494");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.dois_pares(1958, 375, 56977, 560696, 928690);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test495");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(0, 2238, 1177, 108318, 23261);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test496");
        int i5 = com.uepb.tcc.yatzy.Yatzy.tres(7251, 42674, (int) ' ', 2838, 14665);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test497");
        int i5 = com.uepb.tcc.yatzy.Yatzy.um(206520, 948557, 771, 986507, 3708);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test498");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.amplaSequencia(199391, 101403, 3708, 3710, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test499");
        try {
            int i5 = com.uepb.tcc.yatzy.Yatzy.casaCheia((int) '#', 1461647, 1390675, (int) 'a', 35248);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test500");
        com.uepb.tcc.yatzy.Yatzy yatzy5 = new com.uepb.tcc.yatzy.Yatzy(45400, 1540642, 783989, 81606, 77173);
    }
}

