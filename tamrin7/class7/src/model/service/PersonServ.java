package model.service;

import model.entity.PersonEnti;
import model.repository.PersonRepo;

import java.util.List;

public class PersonServ {
    private PersonServ () {
    }

    private static PersonServ personServ = new PersonServ ();

    public static PersonServ getInstance () {
        return personServ;
    }

    public void save (PersonEnti personEnti) throws Exception {
        try (PersonRepo personRepo = new PersonRepo ()) {
            personRepo.check (personEnti);
            personRepo.commit ();
        }
    }

    public List<PersonEnti> report(PersonEnti personEnti1) throws Exception {
        List<PersonEnti> personEntis;
        try (PersonRepo personRepo=new PersonRepo ()){
            personEntis=personRepo.select (personEnti1);
        }
        return personEntis;
    }
}
