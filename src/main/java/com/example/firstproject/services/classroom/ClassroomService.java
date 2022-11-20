package com.example.firstproject.services.classroom;

import com.example.firstproject.entities.Classroom;
import com.example.firstproject.repositories.ClassroomRepository;
import com.example.firstproject.services.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClassroomService implements IClassroomService, ICrudService<Classroom,Long> {
    @Autowired
    private ClassroomRepository classroomRepository;

    @Override
    public List<Classroom> getAll() {return classroomRepository.findAll();}

    @Override
    public Classroom add(Classroom classroom) throws Exception {
        if(classroomRepository.findByName(classroom.getName()) !=null) throw new Exception("Classroom already exists");
        return classroomRepository.save(classroom);
    }

    @Override
    public Classroom update(Long id, Classroom classroom) throws Exception {
        if(classroomRepository.findById(id).isPresent()){
            Classroom toUpdateClassroom = classroomRepository.findById(id).get();
            toUpdateClassroom.setName(classroom.getName());
            return classroomRepository.save(toUpdateClassroom);
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        classroomRepository.deleteById(id);

    }

    @Override
    public Classroom findById(Long id) {
        return classroomRepository.findById(id).get();
    }
}
