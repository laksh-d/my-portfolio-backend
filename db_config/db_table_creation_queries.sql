--database => my-portfolio;

--Tables : 
CREATE TABLE profile (
    profile_id SERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    introduction_desc VARCHAR(400) NOT NULL
);

CREATE TABLE about_me (
    id SERIAL PRIMARY KEY,
    description VARCHAR(255) NOT NULL,
    introduction_desc VARCHAR(400) NOT NULL
);

CREATE TABLE hobbies (
    id SERIAL PRIMARY KEY,
    hobby_name VARCHAR(50) NOT NULL,
	description VARCHAR(500) NOT NULL,
	about_me_id INT,
	CONSTRAINT fk_about_me FOREIGN KEY (about_me_id) REFERENCES about_me(id)
);

CREATE TABLE contact_me (
    id SERIAL PRIMARY KEY,
    phone_number VARCHAR(15) UNIQUE NOT NULL,
    email_id VARCHAR(100) UNIQUE NOT NULL,
	linkedin_profile VARCHAR(100) UNIQUE NOT NULL,
	github_profile VARCHAR(100) UNIQUE NOT NULL
);

ALTER TABLE profile ADD COLUMN aboutme_id INT, ADD CONSTRAINT fk_aboutme FOREIGN KEY (aboutme_id) REFERENCES about_me(id);
ALTER TABLE profile ADD COLUMN contact_me_id INT, ADD CONSTRAINT fk_contact_me FOREIGN KEY (contact_me_id) REFERENCES contact_me(id);


CREATE TABLE experience (
    id SERIAL PRIMARY KEY,
    company_name VARCHAR(50) NOT NULL,
	role VARCHAR(50) NOT NULL,
	role_description VARCHAR(50) NOT NULL,
	from_date DATE,
	to_date DATE,
	profile_id INT,
	CONSTRAINT fk_about_me FOREIGN KEY (profile_id) REFERENCES profile(profile_id)
);

CREATE TABLE education (
    id SERIAL PRIMARY KEY,
    degree_title VARCHAR(50) NOT NULL,
	institution_name VARCHAR(50) NOT NULL,
	CGPA FLOAT NOT NULL,
	from_date DATE,
	to_date DATE,
	profile_id INT,
	CONSTRAINT fk_about_me FOREIGN KEY (profile_id) REFERENCES profile(profile_id)
);


CREATE TABLE projects (
    id SERIAL PRIMARY KEY,
    pname VARCHAR(50) NOT NULL,
	description VARCHAR(500) NOT NULL,
	tech_stack VARCHAR(255) NOT NULL,
	source_code_link VARCHAR(255) NOT NULL,
	profile_id INT,
	CONSTRAINT fk_about_me FOREIGN KEY (profile_id) REFERENCES profile(profile_id)
);

CREATE TABLE visitor (
    id SERIAL PRIMARY KEY,
    visitor_name VARCHAR(79) NOT NULL,
	phone_number VARCHAR(50) NOT NULL,
	email_address VARCHAR(255) NOT NULL,
	note VARCHAR(500) NOT NULL
);






