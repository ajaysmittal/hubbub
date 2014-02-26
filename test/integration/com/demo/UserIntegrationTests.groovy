package com.demo

import static org.junit.Assert.*

import org.junit.*
import org.springframework.validation.FieldError;

class UserIntegrationTests {

/*	void testFirstSaveEver() { 
		def user = new User(userId: 'ajay', password: 'mittal', homepage: 'http://www.google.com')
		assertNotNull user.save()  //user.save(flush:true)
		assertNotNull(user.id)
		
		def foundUser = User.get(user.id)
		assertEquals('ajay', foundUser.userId)
		
	}
	
	void testSaveAndUpdate() {
		def user = new User(userId: 'ajay', password: 'mittal', homepage: 'http://www.google.com')
		
		assertNotNull user.save()
		assertNotNull user.id
		
		def foundUser = User.get(user.id)
		foundUser.password = 'singh'
		foundUser.save()
		
		def editedUser = User.get(user.id)
		assertEquals 'singh', editedUser.password
	}
	
	void testSaveAndDelete() {
		def user = new User(userId:'abhishek', password:'mittal', homepage:'http://www.facebook.com')
		
		assertNotNull user.save()
		assertNotNull user.id
		s
		def foundUser = User.get(user.id)
		assertEquals 'abhishek', foundUser.userId
		
		foundUser.delete()
		assertFalse User.exists(foundUser.id)
	}
	
	void testEvilSave() {
		def user = new User(userId: 'a', password: 'aja', homepage:'abc.com')
		
		assertFalse(user.validate())
		
		def errors = user.errors
		
		for(FieldError error : errors){
			println(error)
		}
		assertEquals('size.toosmall', errors.getFieldError('userId').code)
		assertEquals('url.invalid', errors.getFieldError('homepage').code)
		assertEquals('abc.com', errors.getFieldError('homepage').rejectedValue())
		 
	}
	
	void testEvilSaveCorrected() {
		def user = new User(userId: '', password: '', homepage: '')
		
		assertFalse user.validate()
		assertTrue user.hasErrors()
		assertNull user.save()
		
		user.userId = 'annu'
		user.password = 'mittal'
		user.homepage = 'http://www.blogspot.in'
		
		assertTrue user.validate()
		assertFalse user.hasErrors()
		assertNotNull user.save()
		
	}*/
	
	void testFollowing() {
		def ajayUser = new User(userId: 'ajay', password: 'ajay1').save()
		def abhiUser = new User(userId: 'abhi', password: 'abhi1').save()
		def annuUser = new User(userId: 'annu', password: 'annu1').save()
		
		ajayUser.addToFollowing(abhiUser);
		ajayUser.addToFollowing(annuUser);
		assertEquals 2, ajayUser.following.size()
		
	}
	
    /*@Before
    void setUp() {
        // Setup logic here
    }

    @After
    void tearDown() {
        // Tear down logic here
    }

    @Test
    void testSomething() {
        fail "Implement me"
    }*/
}
