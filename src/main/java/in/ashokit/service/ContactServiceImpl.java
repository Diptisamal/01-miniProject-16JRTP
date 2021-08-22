package in.ashokit.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Contact;
import in.ashokit.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {
	@Autowired
	private ContactRepository repo;

	@Override
	public boolean saveContact(Contact contact) {
		if(contact!=null) {
			repo.save(contact);
			return true;
		}else
		return false;
	}

	@Override
	public List<Contact> getAllContact() {
		List<Contact> listEmps = repo.findAll();
		return listEmps;

	}

	@Override
	public Object getContactById(Integer contactId) {

		Object findById = repo.findById(contactId);
		return findById;
	}

	@Override
	public boolean deleteConatctById(Integer contactId) {
		if (contactId != null) {
			repo.deleteById(contactId);
			return true;
		} else
			return false;

	}

}
