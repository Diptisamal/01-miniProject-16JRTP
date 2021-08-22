package in.ashokit.service;

import java.util.List;

import in.ashokit.entity.Contact;

public interface ContactService {
	public boolean saveContact(Contact contact);
	
	public List<Contact> getAllContact();
	
	public Object getContactById(Integer contactId);
	
	public boolean deleteConatctById(Integer contactId);
	

}
