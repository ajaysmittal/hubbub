package com.demo

import static org.junit.Assert.*
import grails.test.GrailsUnitTestCase
import grails.test.mixin.Mock;
import grails.test.mixin.TestFor;

import org.junit.*


class PostIntegrationTests extends GrailsUnitTestCase {

    void testFirstPost() {
		def user = new User(userId: 'ajay', password: 'mittal')
		assertNotNull user.save()
		def post1 = new Post(content: 'ajay mittal is working with oracle corp')
		user.addToPosts(post1)
		def post2 = new Post(content: 'ajay mittal was previosuly employed by onmobile global ltd')
		user.addToPosts(post2)
		def post3 = new Post(content: 'ajay mittal native call in integrity')
		user.addToPosts(post3)
		assertEquals 3, User.get(user.id).posts.size()
	}
	
	void testAccessingPosts() {
		def user = new User(userId: 'ajay', password: 'mittal')
		assertNotNull user.save()
		user.addToPosts(new Post(content: 'FIRST'))
		user.addToPosts(new Post(content: 'SECOND'))
		user.addToPosts(new Post(content: 'THIRD'))
		
		def foundUser = User.get(user.id)
		def postNames = foundUser.posts.collect { it.content }
		assertEquals(['FIRST', 'SECOND', 'THIRD'], postNames.sort())
	}
}
