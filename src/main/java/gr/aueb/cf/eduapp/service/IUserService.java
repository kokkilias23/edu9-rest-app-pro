package gr.aueb.cf.eduapp.service;

import gr.aueb.cf.eduapp.core.exception.EntityAlreadyExistsException;
import gr.aueb.cf.eduapp.core.exception.EntityInvalidArgumentException;
import gr.aueb.cf.eduapp.dto.UserInsertDTO;
import gr.aueb.cf.eduapp.dto.UserReadOnlyDTO;
import gr.aueb.cf.eduapp.model.User;

import java.util.UUID;


public interface IUserService {
    UserReadOnlyDTO saveUser(UserInsertDTO userInsertDTO)
            throws EntityAlreadyExistsException, EntityInvalidArgumentException ;

    UserReadOnlyDTO getUserByUUID(UUID uuid);
    UserReadOnlyDTO getUserByUUIDDeletedFiles(UUID uuid);
}
