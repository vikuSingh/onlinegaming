package com.integra.onlinegaming.serviceimpl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.integra.onlinegaming.dao.Registrationdao;
import com.integra.onlinegaming.dto.RegisterRequestDto;
import com.integra.onlinegaming.model.Registration;
import com.integra.onlinegaming.service.RegistrationService;

@Service
@Transactional
public class RegistrationServiceImpl implements RegistrationService {
	
	@Autowired
	private Registrationdao registrationdtlsDao;

	public void registrationdtls(RegisterRequestDto RegistrationDeatils) {
		
		
		
		Serializable serializable = null;
		 Registration registration = new Registration();
		 registration.setFullname(RegistrationDeatils.getFullname());
		 registration.setFathername(RegistrationDeatils.getFathername());
		 registration.setEmailaddress(RegistrationDeatils.getEmailaddress());
		 registration.setGender(RegistrationDeatils.getGender());
		 registration.setDOB(RegistrationDeatils.getDOB());
		 registration.setPincode(RegistrationDeatils.getPincode());
		 registration.setAddress(RegistrationDeatils.getAddress());
		 registration.setVillage(RegistrationDeatils.getVillage());
		 registration.setCity(RegistrationDeatils.getCity());
		 registration.setMobilenumber(RegistrationDeatils.getMobilenumber());
		 registration.setPassword(RegistrationDeatils.getPassword());
		 registration.setConfirmPassword(RegistrationDeatils.getConfirmPassword());
		 
		 if (registration != null) {
				serializable = registrationdtlsDao.save(registration);
			}
			//return serializable.hashCode();
		}
	
		
	}
