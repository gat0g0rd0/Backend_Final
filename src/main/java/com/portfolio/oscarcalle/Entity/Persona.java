package com.portfolio.oscarcalle.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "Longitud maxima de caracteres 50")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 50, message = "Longitud maxima de caracteres 50")
    private String apellido;
    
    @NotNull
    private String descripcion;
    
    private String img;

    public Persona() {
    }

    public Persona(int id, String nombre, String apellido, String descripcion, String img) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.descripcion = descripcion;
        this.img = img;
    }

       
    
}
