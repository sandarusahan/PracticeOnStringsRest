package com.practiceonstring.practiceonstringsrest.ChordType;

import javax.persistence.*;

@Entity
public class ChordType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(unique = true)
    private String chordTypeName;
    private String chordTypeDesc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChordTypeName() {
        return chordTypeName;
    }

    public void setChordTypeName(String chordTypeName) {
        this.chordTypeName = chordTypeName;
    }

    public String getChordTypeDesc() {
        return chordTypeDesc;
    }

    public void setChordTypeDesc(String chordTypeDesc) {
        this.chordTypeDesc = chordTypeDesc;
    }
}
