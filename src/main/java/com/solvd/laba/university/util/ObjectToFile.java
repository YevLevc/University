package com.solvd.laba.university.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.solvd.laba.university.entity.Student;
import com.solvd.laba.university.entity.StudentsList;
import org.apache.log4j.Logger;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class ObjectToJson {
    private static final org.apache.log4j.Logger LOGGER = Logger.getLogger(ObjectToJson.class);

    public static void toJson(String path, Object object){
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File(path), object);
        } catch (IOException e) {
            LOGGER.error(e.getMessage());
        }
    }
    public static void toJson(String path, List <Object> objects){
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File(path), objects);
        } catch (IOException e) {
            LOGGER.error(e.getMessage());
        }
    }
public static void marshal (String path, Object object) {
    try {
        JAXBContext context = JAXBContext.newInstance(object.getClass());
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.marshal(object, new File(path));
    } catch (JAXBException e) {
        LOGGER.error(e.getMessage());
    }

}
    public static void marshalAll (String path, List <Student> objects) {
        try {
            JAXBContext context = JAXBContext.newInstance(StudentsList.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            StudentsList list = new StudentsList(objects);
            marshaller.marshal(list, new File(path));
        } catch (JAXBException e) {
            LOGGER.error(e.getMessage());
        }

    }

}
