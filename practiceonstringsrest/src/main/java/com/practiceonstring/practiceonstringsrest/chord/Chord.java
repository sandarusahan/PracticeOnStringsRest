package com.practiceonstring.practiceonstringsrest.chord;

import com.practiceonstring.practiceonstringsrest.ChordType.ChordType;

import javax.persistence.*;

@Entity
public class Chord {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(unique = true)
    private String ChordName;

    private String ChordDesc;

    private String ChordLayout;

    @Column(columnDefinition = "varchar(25) default 'Guest'")
    private String AddedBy = "Guest";

    @Column(columnDefinition = "varchar(25) default 'Private'")
    @Enumerated(value = EnumType.STRING)
    private Availability Availability = this.Availability.valueOf("Private");

    @ManyToOne
    private ChordType chordType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChordName() {
        return ChordName;
    }

    public void setChordName(String chordName) {
        ChordName = chordName;
    }

    public String getChordDesc() {
        return ChordDesc;
    }

    public void setChordDesc(String chordDesc) {
        ChordDesc = chordDesc;
    }

    public String getChordLayout() {
        return ChordLayout;
    }

    public void setChordLayout(String chordLayout) {
        ChordLayout = chordLayout;
    }

    public String getAddedBy() {
        return AddedBy;
    }

    public void setAddedBy(String addedBy) {
        AddedBy = addedBy;
    }

    public Chord.Availability getAvailability() {
        return Availability;
    }

    public void setAvailability(Chord.Availability availability) {
        Availability = availability;
    }

    public ChordType getChordType() {
        return chordType;
    }

    public void setChordType(ChordType chordType) {
        this.chordType = chordType;
    }

    private enum Availability {
        Public,
        Private,
        Unapproved
    }
}
