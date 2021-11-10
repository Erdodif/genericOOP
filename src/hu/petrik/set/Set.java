package hu.petrik.set;

import java.security.cert.CertificateNotYetValidException;
import java.util.ArrayList;
import java.util.List;

public class Set<T> {
    private List<T> elements;

    public <T> Set() {
        this.elements = new ArrayList<>();
    }

    public void addAll(List<T> elements){
        for (T elem : elements) {
            this.add(elem);
        }
    }

    public void add(T element) {
        if (!this.elements.contains(element)) {
            this.elements.add(element);
        }
    }

    public boolean remove(T element) {
        return this.elements.remove(element);
    }

    public int getSize() {
        return this.elements.size();
    }

    public void clear() {
        this.elements.clear();
    }

    public boolean isElement(T element) {
        return this.elements.contains(element);
    }

    public boolean isEmpty() {
        return this.elements.isEmpty();
    }

    public boolean isPartOf(Set<T> otherSet) {
        return this.isEmpty() || otherSet.elements.containsAll(this.elements);
    }

    public boolean isEquals(Set<T> otherSet) {
        return otherSet.getSize() == this.getSize() && this.isPartOf(otherSet);
    }

    public Set<T> unio(Set<T> otherset) {
        Set<T> temp = new Set<>();
        temp.addAll(this.elements);
        for (T elem : otherset.elements) {
            temp.add(elem);
        }
        return temp;
    }

    public Set<T> intersect(Set<T> otherset) {
        Set<T> temp = new Set<>();
        temp.addAll(this.elements);
        for (T elem : otherset.elements) {
            if (this.isElement(elem)) {
                temp.add(elem);
            }
        }
        return temp;
    }
}