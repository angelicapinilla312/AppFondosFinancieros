package com.example.appfondosfinancieros.services;

import com.example.appfondosfinancieros.models.Participant;

import java.util.List;

public interface ParticipantService {

    public Participant createAdmin(Participant participant);
    public boolean delete(int id);
    public Participant updatedAdmin();
    public List<Participant> getAllAdmin();
    public Participant getAdminById(int id);

}
