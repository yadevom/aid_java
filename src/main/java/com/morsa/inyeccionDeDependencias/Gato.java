package com.morsa.inyeccionDeDependencias;

public class Gato {

    public int edad;
    public int pesoKg;
    private Veterinario veterinario;

    public Gato(Veterinario veterinario, int edad, int pesoKg) {
        this.edad = edad;
        this.pesoKg = pesoKg;
        this.veterinario = veterinario;
    }

    // Aqui hay una dependencia de la clase veterinario
    public boolean esUnGatoSaludable() {
        boolean diagnostico = veterinario.diagnosticar(this);
        return diagnostico;
    }
}
