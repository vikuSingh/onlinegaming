package com.integra.onlinegaming.serviceImpl;

import java.util.ArrayList;
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
		List<Registration> listRegistrations = registrationDAO.getDetails();
		List<RegisterRequestDto> listRegisterReqestDto = new ArrayList<RegisterRequestDto>();
		listRegistrations.forEach(reg -> {
			RegisterRequestDto registerRequestDto = new RegisterRequestDto();
			registerRequestDto.setFullName(reg.getFullName());
			registerRequestDto.setFatherName(reg.getFatherName());
			registerRequestDto.setEmail(reg.getEmail());
			registerRequestDto.setGender(reg.getGender());
			registerRequestDto.setDob(reg.getDob());
			registerRequestDto.setPinCode(reg.getPinCode());
			registerRequestDto.setAddress(reg.getAddress());
			registerRequestDto.setVillage(reg.getVillage());
			registerRequestDto.setCity(reg.getCity());
			registerRequestDto.setMobileNumber(reg.getMobileNumber());
			registerRequestDto.setPassword(reg.getPassword());
			listRegisterReqestDto.add(registerRequestDto);
		});

		return listRegisterReqestDto;
	}

}
