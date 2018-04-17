/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdredeintermediarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Luis
 */
public class Subscriber {

    private Long id;
    private String name;
    private List<Intermediario> intermediarioSet = new ArrayList<>();

    public Subscriber() {
    }

    public Subscriber(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Intermediario> getIntermediarioSet() {
        return intermediarioSet;
    }

    public void setIntermediarioSet(List<Intermediario> intermediarioSet) {
        this.intermediarioSet = intermediarioSet;
    }

   
}
