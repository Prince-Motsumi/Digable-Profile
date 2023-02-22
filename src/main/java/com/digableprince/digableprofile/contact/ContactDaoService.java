package com.digableprince.digableprofile.contact;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class ContactDaoService {
	private static List<Contact> contacts = new ArrayList<>();
	private static int contactCount = 0;
	
	static {
		contacts.add(new Contact(++contactCount, "Adam", "Adam@email.com", "Generic message" ,LocalDate.now()));
		contacts.add(new Contact(++contactCount, "Eve", "Eve@email.com", "Generic message", LocalDate.now()));
		contacts.add(new Contact(++contactCount, "Jim", "Jim@email.com", "Generic message", LocalDate.now()));
	}
	
	public List<Contact> findAll() {
		return contacts;
	}
	
	public Contact fineOne(int id) {
		Predicate<? super Contact> predicate = contact -> contact.getId().equals(id);
		return contacts.stream().filter(predicate).findFirst().get();
	}
	
	public Contact Save(Contact contact) {
		contact.setId(++contactCount);
		contact.setCreatedAt(LocalDate.now());
		contacts.add(contact);
		return contact;
	}
}
