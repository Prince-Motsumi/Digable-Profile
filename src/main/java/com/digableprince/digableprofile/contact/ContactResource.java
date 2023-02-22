package com.digableprince.digableprofile.contact;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class ContactResource {
	private ContactDaoService service;

	public ContactResource(ContactDaoService service) {
		this.service = service;
	}

	@GetMapping(path = "/contacts")
	public List<Contact> retreiveContacts() {
		return service.findAll();
	}

	@GetMapping(path = "/contacts/{id}")
	public Contact retreiveContact(@PathVariable int id) {
		return service.fineOne(id);
	}

	@PostMapping(path="/contacts")
	public ResponseEntity<Contact> createContact(@RequestBody Contact contact) {
		Contact savedContact = service.Save(contact);
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedContact.getId())
				.toUri();

		return ResponseEntity.created(location).build();
	}
}
