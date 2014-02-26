package com.demo

import javax.crypto.spec.PSource;

class User {
	
	String userId
	String password
	Date dateCreated
	Profile profile
	
    static constraints = {
    	userId unique: true, size: 3..20
		password blank: false, unique: true, validator: {
			password, user -> return password != user.userId 
		}
		profile nullable: true 
	}
	
	static mapping = {
		profile lazy:false
		posts sort: 'dateCreated'
	}
	
	static hasMany = [posts : Post, tags: Tag, following: User]
}