package org.tyaa.demo.java.se.opp.models;

public interface ILengthable {
    // Double getLength();
    default Double getLength() {
        System.out.println("Not supported yet");
        return 0d;
    }
}
