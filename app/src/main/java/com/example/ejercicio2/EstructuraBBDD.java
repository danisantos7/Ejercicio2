package com.example.ejercicio2;

public class EstructuraBBDD {
    public static final String TABLE_NAME="tabladatosPersonales";
    public static final String NOMBRE_CAMPO1="id";
    public static final String NOMBRE_CAMPO2="nombre";
    public static final String NOMBRE_CAMPO3="apellido";
    public static final String NOMBRE_CAMPO4="dirección";

    public static final String SQL_CREATE_ENTRIES = "CREATE TABLE " + EstructuraBBDD.TABLE_NAME + " ("+
            EstructuraBBDD.NOMBRE_CAMPO1 + " INTEGER PRIMARY KEY AUTOINBREMENT, " +
            EstructuraBBDD.NOMBRE_CAMPO2 + " TEXT, " +
            EstructuraBBDD.NOMBRE_CAMPO3 + " TEXT, " +
            EstructuraBBDD.NOMBRE_CAMPO4 + " TEXT)";

    public static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + EstructuraBBDD.TABLE_NAME;
}
