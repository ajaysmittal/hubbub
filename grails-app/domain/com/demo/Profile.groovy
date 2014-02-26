package com.demo

class Profile {

    String fullName
	byte[] photo
	String bio
	String homepage
	String email
	String timezone
	String country
	String jabberAddress
	
	static constraints = {
		fullName nullable: true
		bio nullable: true , maxSize: 1000
		homepage url: true , nullable: true
		email email: true , nullable: true
		photo nullable: true
		timezone nullable: true
		jabberAddress email:true , nullable: true 
    }
	
	/*
	 * unidirectional mapping i.e. one can obtain profile from user but not user from profile, moreover
	 * if user is deleted, profile associated with user will be deleted but opposite is not true
	 */
	static belongsTo = User 
	
	
}
