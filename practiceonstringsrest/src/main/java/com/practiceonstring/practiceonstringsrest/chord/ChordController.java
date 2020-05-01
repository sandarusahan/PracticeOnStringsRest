package com.practiceonstring.practiceonstringsrest.chord;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/chord")
public class ChordController {
    @Autowired
    private ChordRepository chordRepo;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
    public @ResponseBody Iterable<Chord> getAllChords(){
        return chordRepo.findAll();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(path = "/{chordId}")
    public Chord getChord(@PathVariable int chordId){
        return chordRepo.findById(chordId).get();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping
    public @ResponseBody int addNewChord(@RequestBody Chord chord){
        return chordRepo.save(chord).getId();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping
    public @ResponseBody String updateChord(@RequestBody Chord chord){
        return chordRepo.save(chord).getChordName();
    }

    @DeleteMapping(params = "/{chordId}")
    public @ResponseBody String deleteChord(@PathVariable int chordId){
        chordRepo.deleteById(chordId);
        return "Deleted";
    }
}
