package com.example.tarviliivak.expandablelistview;

public class Info {
    private String kuupaev;
    private String aeg;
    private String aine;
    private String grupp;
    private String opetaja;


    public Info(String kuupaev, String aeg, String aine, String grupp, String opetaja) {
        this.kuupaev = kuupaev;
        this.aeg = aeg;
        this.aine = aine;
        this.grupp = grupp;
        this.opetaja = opetaja;

    }

    public String getKuupaev() {
        return kuupaev;
    }

    public String getAeg() {
        return aeg;
    }

    public String getAine() {
        return aine;
    }

    public String getGrupp() {
        return grupp;
    }

    public String getOpetaja() {
        return opetaja;
    }

}