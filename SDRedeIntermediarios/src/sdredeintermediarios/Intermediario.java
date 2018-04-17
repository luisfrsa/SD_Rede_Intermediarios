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
public class Intermediario {

    private Long id;
    private String name;
    private List<Publisher> publisherSet = new ArrayList<>();
    private List<Subscriber> subscriberSet = new ArrayList<>();
    private List<Intermediario> intermediarioSet = new ArrayList<>();

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

    public List<Publisher> getPublisherSet() {
        return publisherSet;
    }

    public void setPublisherSet(List<Publisher> publisherSet) {
        this.publisherSet = publisherSet;
    }

    public List<Subscriber> getSubscriberSet() {
        return subscriberSet;
    }

    public void setSubscriberSet(List<Subscriber> subscriberSet) {
        this.subscriberSet = subscriberSet;
    }

    public List<Intermediario> getIntermediarioSet() {
        return intermediarioSet;
    }

    public void setIntermediarioSet(List<Intermediario> intermediarioSet) {
        this.intermediarioSet = intermediarioSet;
    }

    @Override
    public String toString() {
        return "Intermediario{" + "id=" + id + ", name=" + name + ", publisherSet=" + publisherSet + ", subscriberSet=" + subscriberSet + ", intermediarioSet=" + intermediarioSet + '}';
    }

}
