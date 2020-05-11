package com.practiceonstring.practiceonstringsrest.ChordType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/chord-type")
public class ChordTypeController {
    @Autowired
    private ChordTypeRepository chordTypeRepo;

    @GetMapping
    public @ResponseBody Iterable<ChordType> getAllChordTypes(){
        return chordTypeRepo.findAll();
    }

    @GetMapping(path = "/{chordTypeId}")
    public ChordType getChordType(@PathVariable int chordTypeId){
        return chordTypeRepo.findById(chordTypeId).get();
    }

    @PostMapping
    public @ResponseBody int addNewChordType(@RequestBody ChordType chordType){
        return chordTypeRepo.save(chordType).getId();
    }

    @PutMapping
    public @ResponseBody int updateChordType(@RequestBody ChordType chordType){
        return chordTypeRepo.save(chordType).getId();
    }

    @DeleteMapping(params = "/{chordTypeId}")
    public @ResponseBody String deleteChordType(@PathVariable int chordTypeId){
        chordTypeRepo.deleteById(chordTypeId);
        return "Deleted";
    }
}
