package com.ce.service.stubs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.ce.dao.UserDao;
import com.ce.model.Gender;
import com.ce.model.User;
import com.ce.service.UserServiceImpl;

@ExtendWith(value = {MockitoExtension.class})
public class TestUserServiceImpl {
	
	private UserServiceImpl userService;
	
	@Mock
	private UserDao userDao;
	
	@BeforeEach
	void setUp() {
		this.userService = new UserServiceImpl(userDao);
	}
	

	
	@Test
	void testAddUser() {
		User expected = new User("xyz", LocalDate.now().minusYears(10), Gender.MALE);
		
		Mockito.when(userDao.add(expected)).thenReturn(expected);
		
		User actual = userService.add(expected);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testUpdateUser() {
		User expected = new User("xyz", LocalDate.now().minusYears(10), Gender.MALE);
		
		Mockito.when(userDao.update(expected)).thenReturn(expected);
		
		User actual = userService.update(expected);
		
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("getByFullName should return user if given fullName")
	void testGetByFullName() {
		User expected = new User("xyz", LocalDate.now().minusYears(10), Gender.MALE);
		
		Mockito.when(userDao.getByFullName("xyz")).thenReturn(expected);
		
		User actual = userService.getByFullName("xyz");
		
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("getByFullName should return null if given fullName")
	void testGetByFullName2() {
	
		Mockito.when(userDao.getByFullName(Mockito.anyString())).thenReturn(null);
		
		User actual = userService.getByFullName("xyz");
		
		assertNull(actual);
	}
	
	
	@Test
	void testGetAll() {
		List<User> expected = Arrays.asList(new User[] {
				new User("xyz", LocalDate.now().minusYears(10), Gender.MALE),
				new User("pqr", LocalDate.now().minusYears(9), Gender.MALE),
				new User("mno", LocalDate.now().minusYears(8), Gender.MALE),
		});
		
		Mockito.when(userDao.getAll()).thenReturn(expected);
		
		List<User> actual = userService.getAll();
		assertEquals(expected, actual);
	}
	
}
