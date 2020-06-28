package com.integra.onlinegaming.serviceImpl;
import java.util.List;
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
	private Registrationdao registrationDAO;

	public void registrationdtls(RegisterRequestDto registerRequestDto) {
		
		 Registration registration = new Registration();
		 registration.setFullName(registerRequestDto.getFullName());
		 registration.setFatherName(registerRequestDto.getFatherName());
		 registration.setEmail(registerRequestDto.getEmail());
		 registration.setGender(registerRequestDto.getGender());
		 registration.setDob(registerRequestDto.getDob());
		 registration.setPinCode(registerRequestDto.getPinCode());
		 registration.setAddress(registerRequestDto.getAddress());
		 registration.setVillage(registerRequestDto.getVillage());
		 registration.setCity(registerRequestDto.getCity());
		 registration.setMobileNumber(registerRequestDto.getMobileNumber());
		 registration.setPassword(registerRequestDto.getPassword());
		 
		 if (registration != null) {
			 registrationDAO.save(registration);
			}
			
		}

	public List<RegisterRequestDto> getDeatils() {
		return null;
	}
	
		
	}
