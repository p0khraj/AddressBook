package io.pukhraj.service;
import org.glassfish.hk2.utilities.binding.AbstractBinder;

import io.pukhraj.repo.PersonRepository;
import io.pukhraj.repo.PersonRepositoryImpl;
import io.pukhraj.service.PersonResource; 

public class MyApplicationBinder extends AbstractBinder {
    @Override
    protected void configure() {
        //bind(PersonServiceImpl.class).to(PersonService.class);
        bind(PersonRepositoryImpl.class).to(PersonRepository.class);
        bind(PersonRepositoryImpl.class).to(PersonResource.class);
       // bind(PersonServiceImpl.class).to(PersonRepositoryImpl.class);
        //bind(PersonResource.class).to(PersonService.class);
        
    }
}
