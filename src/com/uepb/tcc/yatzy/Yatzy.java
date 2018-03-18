package com.uepb.tcc.yatzy;

public class Yatzy {

    public static int chance(int d1, int d2, int d3, int d4, int d5)
    {
        int total = 0;
        total += d1;
        total += d2;
        total += d3;
        total += d4;
        total += d5;
        return total;
    }

    public static int yatzy(int... dados)
    {
        int[] contagens = new int[6];
        for (int die : dados)
            contagens[die-1]++;
        for (int i = 0; i != 6; i++)
            if (contagens[i] == 5)
                return 50;
        return 0;
    }

    public static int um(int d1, int d2, int d3, int d4, int d5) {
        int soma = 0;
        if (d1 == 1) soma++;
        if (d2 == 1) soma++;
        if (d3 == 1) soma++;
        if (d4 == 1) soma++;
        if (d5 == 1) 
            soma++;

        return soma;
    }

    public static int dois(int d1, int d2, int d3, int d4, int d5) {
        int soma = 0;
        if (d1 == 2) soma += 2;
        if (d2 == 2) soma += 2;
        if (d3 == 2) soma += 2;
        if (d4 == 2) soma += 2;
        if (d5 == 2) soma += 2;
        return soma;
    }

    public static int tres(int d1, int d2, int d3, int d4, int d5) {
        int soma;    
        soma = 0;
        if (d1 == 3) soma += 3;
        if (d2 == 3) soma += 3;
        if (d3 == 3) soma += 3;
        if (d4 == 3) soma += 3;
        if (d5 == 3) soma += 3;
        return soma;
    }

    protected int[] dados;
    public Yatzy(int d1, int d2, int d3, int d4, int _5)
    {
        dados = new int[5];
        dados[0] = d1;
        dados[1] = d2;
        dados[2] = d3;
        dados[3] = d4;
        dados[4] = _5;
    }

    public int quatro()
    {
        int soma;    
        soma = 0;
        for (int at = 0; at != 5; at++) {
            if (dados[at] == 4) {
                soma += 4;
            }
        }
        return soma;
    }

    public int cinco()
    {
        int s = 0;
        int i;
        for (i = 0; i < dados.length; i++) 
            if (dados[i] == 5)
                s = s + 5;
        return s;
    }

    public int seis()
    {
        int soma = 0;
        for (int at = 0; at < dados.length; at++) 
            if (dados[at] == 6)
                soma = soma + 6;
        return soma;
    }

    public static int pontuacao_par(int d1, int d2, int d3, int d4, int d5)
    {
        int[] contagens = new int[6];
        contagens[d1-1]++;
        contagens[d2-1]++;
        contagens[d3-1]++;
        contagens[d4-1]++;
        contagens[d5-1]++;
        int at;
        for (at = 0; at != 6; at++)
            if (contagens[6-at-1] >= 2)
                return (6-at)*2;
        return 0;
    }

    public static int dois_pares(int d1, int d2, int d3, int d4, int d5)
    {
        int[] contagens = new int[6];
        contagens[d1-1]++;
        contagens[d2-1]++;
        contagens[d3-1]++;
        contagens[d4-1]++;
        contagens[d5-1]++;
        int n = 0;
        int pontuacao = 0;
        for (int i = 0; i < 6; i += 1)
            if (contagens[6-i-1] >= 2) {
                n++;
                pontuacao += (6-i);
            }        
        if (n == 2)
            return pontuacao * 2;
        else
            return 0;
    }

    public static int quatro_de_um_tipo(int _1, int _2, int d3, int d4, int d5)
    {
        int[] contas;
        contas = new int[6];
        contas[_1-1]++;
        contas[_2-1]++;
        contas[d3-1]++;
        contas[d4-1]++;
        contas[d5-1]++;
        for (int i = 0; i < 6; i++)
            if (contas[i] >= 4)
                return (i+1) * 4;
        return 0;
    }

    public static int tres_de_um_tipo(int d1, int d2, int d3, int d4, int d5)
    {
        int[] t;
        t = new int[6];
        t[d1-1]++;
        t[d2-1]++;
        t[d3-1]++;
        t[d4-1]++;
        t[d5-1]++;
        for (int i = 0; i < 6; i++)
            if (t[i] >= 3)
                return (i+1) * 3;
        return 0;
    }

    public static int pequenaSequencia(int d1, int d2, int d3, int d4, int d5)
    {
        int[] contas;
        contas = new int[6];
        contas[d1-1] += 1;
        contas[d2-1] += 1;
        contas[d3-1] += 1;
        contas[d4-1] += 1;
        contas[d5-1] += 1;
        if (contas[0] == 1 &&
            contas[1] == 1 &&
            contas[2] == 1 &&
            contas[3] == 1 &&
            contas[4] == 1)
            return 15;
        return 0;
    }

    public static int amplaSequencia(int d1, int d2, int d3, int d4, int d5)
    {
        int[] contas;
        contas = new int[6];
        contas[d1-1] += 1;
        contas[d2-1] += 1;
        contas[d3-1] += 1;
        contas[d4-1] += 1;
        contas[d5-1] += 1;
        if (contas[1] == 1 &&
            contas[2] == 1 &&
            contas[3] == 1 &&
            contas[4] == 1
            && contas[5] == 1)
            return 20;
        return 0;
    }

    public static int casaCheia(int d1, int d2, int d3, int d4, int d5)
    {
        int[] contas;
        boolean _2 = false;
        int i;
        int _2_at = 0;
        boolean _3 = false;
        int _3_at = 0;




        contas = new int[6];
        contas[d1-1] += 1;
        contas[d2-1] += 1;
        contas[d3-1] += 1;
        contas[d4-1] += 1;
        contas[d5-1] += 1;

        for (i = 0; i != 6; i += 1)
            if (contas[i] == 2) {
                _2 = true;
                _2_at = i+1;
            }

        for (i = 0; i != 6; i += 1)
            if (contas[i] == 3) {
                _3 = true;
                _3_at = i+1;
            }

        if (_2 && _3)
            return _2_at * 2 + _3_at * 3;
        else
            return 0;
    }
}
