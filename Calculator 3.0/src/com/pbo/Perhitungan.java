package com.pbo;

public class Perhitungan {

    public long hitung(long angka1, long angka2, String operan){
        switch (operan) {
            case "+":
                return angka1 + angka2;
            case "-":
                return angka1 - angka2;
            case "x":
                return angka1 * angka2;
            case "/":
                if (angka2 == 0)
                    return 0;
                return angka1 / angka2;
        }
        System.out.println("Operan tidak ada ! " + operan);
        return 0;
    }

}
